package com.github.guilopesn.xlsx2txt.controller;

import com.github.guilopesn.xlsx2txt.model.TXTField;
import com.github.guilopesn.xlsx2txt.model.TXTFile;
import com.github.guilopesn.xlsx2txt.model.TXTRow;
import com.github.guilopesn.xlsx2txt.model.XLSXFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SpreadSheetConverter {

    public static void convert(File spreadSheetFile, String sheetName) throws IOException, InvalidFormatException {

        XLSXFile xlsxFile = new XLSXFile(spreadSheetFile);

        List<Row> rows = xlsxFile.getSheetRows(sheetName);

        String txtFileName = spreadSheetFile.getAbsolutePath().replace(".xlsx", ".txt");

        TXTFile txtFile = new TXTFile(txtFileName);

        for (Row row : rows) {

            TXTRow txtRow = new TXTRow();
            TXTRow txtRow2 = new TXTRow();

            for (int columnIndex = 0; columnIndex < row.getLastCellNum(); columnIndex++) {

                Cell cell = row.getCell(columnIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

                int[] fieldPosition = ConverterConfigurations.getFieldsPositions().get((columnIndex + 1));

                if (fieldPosition.length != 3) {
                    throw new IOException("Configurações do campo inválidas!");
                }

                if (fieldPosition[0] == 0) {

                    if (cell.getCellType() == CellType.NUMERIC) {
                        throw new IOException("A coluna " + (columnIndex + 1) + " não está definida com tipo texto!");
                    } else {
                        txtRow.add(new TXTField(fieldPosition[1], fieldPosition[2], cell.getStringCellValue()));
                    }
                } else if (fieldPosition[0] == 1) {
                    if (cell.getCellType() == CellType.NUMERIC) {
                        throw new IOException("A coluna " + (columnIndex + 1) + " não está definida com tipo texto!");
                    } else {
                        txtRow2.add(new TXTField(fieldPosition[1], fieldPosition[2], cell.getStringCellValue()));
                    }
                }
            }

            txtFile.add(txtRow);
            txtFile.add(txtRow2);
        }

        txtFile.save();
    }

}