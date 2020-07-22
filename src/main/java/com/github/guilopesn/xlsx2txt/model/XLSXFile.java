package com.github.guilopesn.xlsx2txt.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXFile {

    private File xlsxFile;

    public XLSXFile(File xlsxFile) {
	this.xlsxFile = xlsxFile;
    }

    public List<Row> getSheetRows(String sheetName)
	    throws InvalidFormatException, IOException {

	XSSFWorkbook xssfWorkbook = new XSSFWorkbook(xlsxFile);

	XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);

	if (xssfSheet == null) {
	    xssfWorkbook.close();
	    throw new IOException("Planilha inválida!");
	}

	List<Row> rows = new ArrayList<Row>();

	for (Row row : xssfSheet) {
	    rows.add(row);
	}

	xssfWorkbook.close();

	return rows;
    }
}