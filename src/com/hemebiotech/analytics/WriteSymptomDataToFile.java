package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter{
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void saveSymptoms(TreeMap<String, Integer> symptoms) {
		try {
			FileWriter writer = new FileWriter (filepath);		
			writer.write(symptoms.toString());
			writer.close();		
		} catch (IOException e) {e.printStackTrace();}	
	}	
}

