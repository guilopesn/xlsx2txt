package com.github.guilopesn.xlsx2txt.gui;

import com.github.guilopesn.xlsx2txt.controller.SpreadSheetConverter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.io.IOException;

public class Main extends JDialog {
    private JPanel contentPane;
    private JButton selectButton;
    private JFileChooser fileChooser;
    private XSSFWorkbook spreadSheet;
    private JComboBox sheetCombo;
    private JButton convertButton;

    public Main() {

        setContentPane(contentPane);

        setModal(true);

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Planilha Excel", "xlsx"));

        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fileChooser.showOpenDialog(contentPane);
            }
        });

        fileChooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sheetCombo.removeAllItems();

                if (fileChooser.getSelectedFile() != null) {
                    try {
                        spreadSheet = new XSSFWorkbook(fileChooser.getSelectedFile());
                    } catch (IOException ex) {
                        showError("Erro! Você precisa selecionar uma planilha Excel válida!");
                    } catch (InvalidFormatException ex) {
                        showError("Erro! Você precisa selecionar uma planilha Excel válida!");
                    } catch (Exception ex) {
                        showError("Erro! Você precisa selecionar uma planilha Excel válida!");
                    }

                    for (int i = 0; i < spreadSheet.getNumberOfSheets(); i++) {
                        sheetCombo.addItem(spreadSheet.getSheetName(i));
                    }
                }
            }
        });

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    SpreadSheetConverter.convert(fileChooser.getSelectedFile(), sheetCombo.getSelectedItem().toString());
                    showSuccess("Arquivo convertido com sucesso!");
                } catch (IOException ex) {
                    showError(ex.getMessage());
                } catch (InvalidFormatException ex) {
                    showError(ex.getMessage());
                }
            }
        });

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void showSuccess(String message) {
        JOptionPane.showMessageDialog(new JFrame(), message, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(new JFrame(), message, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {

        Main dialog = new Main();

        dialog.pack();

        dialog.setVisible(true);

        System.exit(0);
    }
}