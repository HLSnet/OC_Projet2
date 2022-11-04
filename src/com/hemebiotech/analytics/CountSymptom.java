package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptom {
	
	TreeMap<String, Integer> count(List<String> listSymptoms){
		
		TreeMap<String, Integer> symptoms = new TreeMap<>();
		
		String symptom;
		
		for (int i = 0; i< listSymptoms.size(); i++){
			symptom = listSymptoms.get(i);
			
			// incrementing counter of symptom
			if  (symptoms.containsKey(symptom)) {
				symptoms.put(symptom, symptoms.get(symptom)+1);
			}
			// adding the symptom in the map collection
			else { symptoms.put(symptom, 1);}
		}
		return symptoms;
	}	
}
