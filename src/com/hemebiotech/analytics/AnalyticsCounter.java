package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * 
 * @author Said
 *
 */
public class AnalyticsCounter {
	//public TreeMap<String, Integer> symptoms = new TreeMap<>();
	
	public static void main(String args[]) throws Exception {
		
		// Reading the file symptoms
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");		
		List<String> listSymptoms = readSymptomDataFromFile.getSymptoms();		
				
		// Counting the symptoms
		CountSymptom countSymptom = new CountSymptom();			
		TreeMap<String, Integer> symptoms = countSymptom.count(listSymptoms);

		// Writing the results in the file "result.out"
		WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");			
		writeSymptomDataToFile.saveSymptoms(symptoms);		
	}
}
