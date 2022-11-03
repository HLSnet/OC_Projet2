package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class AnalyticsCounter {
	public TreeMap<String, Integer> symptoms = new TreeMap<>();
	
	public static void main(String args[]) throws Exception {
		TreeMap<String, Integer> symptoms = new TreeMap<>();
		
		try {
			// Opening the file containing the list of the symptoms
			BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
			
			// reading the first symptom
			String line = reader.readLine();
	

			
			// Reading sequentially the file "symptoms.txt"
						while (line != null) {
						
							if  (symptoms.containsKey(line)) {
								symptoms.put(line, symptoms.get(line)+1);
							}
							else {
								symptoms.put(line, 1);
							}

							line = reader.readLine();	// get another symptom
						}
			reader.close();
		
		} catch (IOException e) {e.printStackTrace();}			

		// generate output
		try {
			FileWriter writer = new FileWriter ("result.out");		
			writer.write(symptoms.toString());
			writer.close();		
		} catch (IOException e) {e.printStackTrace();}	
	}
}
