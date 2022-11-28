package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reading the symptoms from a file.txt format
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath <String> a full or partial path to file with symptom strings,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> listSymptoms = new ArrayList<String>();

		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					listSymptoms.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			finally {
				try {
					if (reader != null)
						reader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return listSymptoms;
	}

}
