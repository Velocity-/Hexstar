package com.bartpelle.hexstar;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Bart on 9/26/2015.
 */
public class DataRow {
	private StringProperty address;
	private StringProperty[] data = new StringProperty[16];

	public DataRow(int addr, byte[] b) {
		address = new SimpleStringProperty(String.format("%08X", addr));
		for (int i = 0; i < b.length; i++) {
			data[i] = new SimpleStringProperty(String.format("%02X", b[i]));
		}
	}

	public StringProperty addressProperty() {
		return address;
	}

	public StringProperty b0Property() {
		return data[0];
	}

	public StringProperty b1Property() {
		return data[1];
	}

	public StringProperty b2Property() {
		return data[2];
	}

	public StringProperty b3Property() {
		return data[3];
	}

	public StringProperty b4Property() {
		return data[4];
	}

	public StringProperty b5Property() {
		return data[5];
	}

	public StringProperty b6Property() {
		return data[6];
	}

	public StringProperty b7Property() {
		return data[7];
	}

	public StringProperty b8Property() {
		return data[8];
	}

	public StringProperty b9Property() {
		return data[9];
	}

	public StringProperty bAProperty() {
		return data[0xA];
	}

	public StringProperty bBProperty() {
		return data[0xB];
	}

	public StringProperty bCProperty() {
		return data[0xC];
	}

	public StringProperty bDProperty() {
		return data[0xD];
	}

	public StringProperty bEProperty() {
		return data[0xE];
	}

	public StringProperty bFProperty() {
		return data[0xF];
	}
}
