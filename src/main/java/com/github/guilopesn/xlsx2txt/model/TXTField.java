package com.github.guilopesn.xlsx2txt.model;

import java.io.IOException;

public class TXTField {

    private int startPosition;
    private int endPosition;
    private int fieldSize;
    private String value;

    public TXTField(int startPos, int endPos, String value) throws IOException {

	this.startPosition = startPos;
	this.endPosition = endPos;

	if (this.endPosition < this.startPosition) {
	    throw new IOException("A posição final do campo não pode ser menor do que a inicial");
	}

	this.fieldSize = this.endPosition - this.startPosition + 1;

	if (this.fieldSize < value.length()) {
	    throw new IOException("Valor do campo maior do que o máximo permitido - " + "Posição Inicial: "
		    + this.startPosition + " - Posição Final: " + this.endPosition + " - Tamanho Máximo: " + this.fieldSize);
	}

	this.value = this.formatValue(value);
    }

    private String formatValue(String value) {

	while (value.length() < this.fieldSize) {
	    value += " ";
	}

	return value;
    }

    public int getStartPosition() {
	return this.startPosition;
    }

    public int getEndPosition() {
	return this.endPosition;
    }

    public int getFieldSize() {
	return this.fieldSize;
    }

    public String getValue() {
	return this.value;
    }

    @Override
    public String toString() {
	return this.value;
    }
}