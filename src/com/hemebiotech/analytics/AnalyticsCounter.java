package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	public TreeMap<String, Integer> symptoms = new TreeMap<>();
	
	public static void main(String args[]) throws Exception {
		// Declaring a map collection		
		TreeMap<String, Integer> symptoms = new TreeMap<>();
		
		List<String> ListSymptoms = new ArrayList<String>();		

		// Reading the file symptoms
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");			

		// Retrieving the list of symptoms in a array		
		ListSymptoms = readSymptomDataFromFile.GetSymptoms();		
		
		// Filling the map collection of the symptoms
				String symptom;
				for (int i = 0; i<ListSymptoms.size(); i++)
				{
					symptom = ListSymptoms.get(i);
					
					// incrementing counter of symptom
					if  (symptoms.containsKey(symptom)) {
						symptoms.put(symptom, symptoms.get(symptom)+1);
					}
					// adding the symptom in the map collection
					else {
						symptoms.put(symptom, 1);
					}
				}

		// Writing the results in the file "result.out"
		try {
			FileWriter writer = new FileWriter ("result.out");		
			writer.write(symptoms.toString());
			writer.close();		
		} catch (IOException e) {e.printStackTrace();}	
	}
}
