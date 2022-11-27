package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Writing the all the symptoms counted and sorted to a file.txt format
 *
 */
public class WriteSymptomDataCountedSortedToFile implements ISymptomWriter {
	private String filepath;

	/**
	 * 
	 * @param filepath <String> a full or partial path to a writing file with
	 *                 symptom + occurrence strings , one per line
	 */
	public WriteSymptomDataCountedSortedToFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * the object parameter transmitted is casted into a sorted collection in order
	 * to be written into the output file
	 */
	@Override
	public void saveSymptoms(Object symptoms) {
		TreeMap<String, Integer> mapSymptoms = (TreeMap<String, Integer>) symptoms;
		FileWriter writer = null;
		try {
			writer = new FileWriter(filepath);
			for (Map.Entry<String, Integer> entry : mapSymptoms.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue() + "\r\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
