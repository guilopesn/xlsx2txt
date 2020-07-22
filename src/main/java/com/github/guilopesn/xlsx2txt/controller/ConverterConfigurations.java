package com.github.guilopesn.xlsx2txt.controller;

import java.util.HashMap;
import java.util.Map;

public class ConverterConfigurations {

	private static int[] createIntegerArray(int index1, int index2, int index3) {

		int[] integerArray = { index1, index2, index3 };

		return integerArray;
	}

	public static Map<Integer, int[]> getFieldsPositions() {

		Map<Integer, int[]> fieldsPositions = new HashMap<Integer, int[]>();

		fieldsPositions.put(1, ConverterConfigurations.createIntegerArray(0, 1, 1));
		fieldsPositions.put(2, ConverterConfigurations.createIntegerArray(0, 2, 4));
		fieldsPositions.put(3, ConverterConfigurations.createIntegerArray(0, 5, 12));
		fieldsPositions.put(4, ConverterConfigurations.createIntegerArray(0, 13, 13));
		fieldsPositions.put(5, ConverterConfigurations.createIntegerArray(0, 14, 20));
		fieldsPositions.put(6, ConverterConfigurations.createIntegerArray(0, 21, 30));
		fieldsPositions.put(7, ConverterConfigurations.createIntegerArray(0, 31, 38));
		fieldsPositions.put(8, ConverterConfigurations.createIntegerArray(0, 39, 42));
		fieldsPositions.put(9, ConverterConfigurations.createIntegerArray(0, 43, 44));
		fieldsPositions.put(10, ConverterConfigurations.createIntegerArray(0, 45, 114));
		fieldsPositions.put(11, ConverterConfigurations.createIntegerArray(0, 115, 115));
		fieldsPositions.put(12, ConverterConfigurations.createIntegerArray(0, 116, 117));
		fieldsPositions.put(13, ConverterConfigurations.createIntegerArray(0, 118, 127));
		fieldsPositions.put(14, ConverterConfigurations.createIntegerArray(0, 128, 142));
		fieldsPositions.put(15, ConverterConfigurations.createIntegerArray(0, 143, 157));
		fieldsPositions.put(16, ConverterConfigurations.createIntegerArray(0, 158, 165));
		fieldsPositions.put(17, ConverterConfigurations.createIntegerArray(0, 166, 168));
		fieldsPositions.put(18, ConverterConfigurations.createIntegerArray(0, 169, 182));
		fieldsPositions.put(19, ConverterConfigurations.createIntegerArray(0, 183, 186));
		fieldsPositions.put(20, ConverterConfigurations.createIntegerArray(0, 187, 194));
		fieldsPositions.put(21, ConverterConfigurations.createIntegerArray(0, 195, 202));
		fieldsPositions.put(22, ConverterConfigurations.createIntegerArray(0, 203, 206));
		fieldsPositions.put(23, ConverterConfigurations.createIntegerArray(0, 207, 214));
		fieldsPositions.put(24, ConverterConfigurations.createIntegerArray(0, 215, 215));
		fieldsPositions.put(25, ConverterConfigurations.createIntegerArray(0, 216, 223));
		fieldsPositions.put(26, ConverterConfigurations.createIntegerArray(0, 224, 231));
		fieldsPositions.put(27, ConverterConfigurations.createIntegerArray(0, 232, 281));
		fieldsPositions.put(28, ConverterConfigurations.createIntegerArray(0, 282, 289));
		fieldsPositions.put(29, ConverterConfigurations.createIntegerArray(0, 290, 361));
		fieldsPositions.put(30, ConverterConfigurations.createIntegerArray(0, 362, 366));
		fieldsPositions.put(31, ConverterConfigurations.createIntegerArray(0, 367, 406));
		fieldsPositions.put(32, ConverterConfigurations.createIntegerArray(0, 407, 446));
		fieldsPositions.put(33, ConverterConfigurations.createIntegerArray(0, 447, 455));
		fieldsPositions.put(34, ConverterConfigurations.createIntegerArray(0, 456, 495));
		fieldsPositions.put(35, ConverterConfigurations.createIntegerArray(0, 496, 497));
		fieldsPositions.put(36, ConverterConfigurations.createIntegerArray(0, 498, 508));
		fieldsPositions.put(37, ConverterConfigurations.createIntegerArray(0, 509, 523));
		fieldsPositions.put(38, ConverterConfigurations.createIntegerArray(0, 524, 524));
		fieldsPositions.put(39, ConverterConfigurations.createIntegerArray(0, 525, 525));
		fieldsPositions.put(40, ConverterConfigurations.createIntegerArray(0, 526, 526));
		fieldsPositions.put(41, ConverterConfigurations.createIntegerArray(0, 527, 527));
		fieldsPositions.put(42, ConverterConfigurations.createIntegerArray(0, 528, 528));
		fieldsPositions.put(43, ConverterConfigurations.createIntegerArray(0, 529, 529));
		fieldsPositions.put(44, ConverterConfigurations.createIntegerArray(0, 530, 530));
		fieldsPositions.put(45, ConverterConfigurations.createIntegerArray(0, 531, 531));
		fieldsPositions.put(46, ConverterConfigurations.createIntegerArray(0, 532, 550));
		fieldsPositions.put(47, ConverterConfigurations.createIntegerArray(0, 551, 600));
		fieldsPositions.put(48, ConverterConfigurations.createIntegerArray(0, 601, 604));
		fieldsPositions.put(49, ConverterConfigurations.createIntegerArray(0, 605, 609));
		fieldsPositions.put(50, ConverterConfigurations.createIntegerArray(0, 610, 614));
		fieldsPositions.put(51, ConverterConfigurations.createIntegerArray(0, 615, 618));
		fieldsPositions.put(52, ConverterConfigurations.createIntegerArray(0, 619, 623));
		fieldsPositions.put(53, ConverterConfigurations.createIntegerArray(0, 624, 628));
		fieldsPositions.put(54, ConverterConfigurations.createIntegerArray(0, 629, 632));
		fieldsPositions.put(55, ConverterConfigurations.createIntegerArray(0, 633, 637));
		fieldsPositions.put(56, ConverterConfigurations.createIntegerArray(0, 638, 642));
		fieldsPositions.put(57, ConverterConfigurations.createIntegerArray(0, 643, 647));
		fieldsPositions.put(58, ConverterConfigurations.createIntegerArray(1, 1, 1));
		fieldsPositions.put(59, ConverterConfigurations.createIntegerArray(1, 2, 5));
		fieldsPositions.put(60, ConverterConfigurations.createIntegerArray(1, 6, 13));
		fieldsPositions.put(61, ConverterConfigurations.createIntegerArray(1, 14, 21));
		fieldsPositions.put(62, ConverterConfigurations.createIntegerArray(1, 22, 23));

		return fieldsPositions;
	}
}