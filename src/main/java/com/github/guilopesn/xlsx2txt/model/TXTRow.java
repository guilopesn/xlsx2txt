package com.github.guilopesn.xlsx2txt.model;

import java.util.ArrayList;

public class TXTRow extends ArrayList<TXTField> {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {

	String row = "";

	for (TXTField field : this) {

	    row += field.toString();
	}

	return row;
    }
}