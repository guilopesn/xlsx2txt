package com.github.guilopesn.xlsx2txt.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TXTFile extends ArrayList<TXTRow> {

    private static final long serialVersionUID = 1L;

    private String filePath;
    private File file;

    public TXTFile(String filePath) throws IOException {

	this.filePath = filePath;

	this.file = new File(this.filePath);

	if (!file.exists()) {
	    file.createNewFile();
	} else {
	    file.delete();
	    file.createNewFile();
	}
    }

    public void save() throws IOException {

	FileOutputStream fileOutputStream = new FileOutputStream(this.file);

	OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

	BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

	for (TXTRow row : this) {

	    bufferedWriter.write(row.toString());
	    bufferedWriter.newLine();
	}

	bufferedWriter.close();
	outputStreamWriter.close();
	fileOutputStream.close();
    }
}