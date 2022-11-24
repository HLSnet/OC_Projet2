package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;
/**
 * count the occurrence of ALL the symptoms and sorting alphabetically
 *
 */
public class CountAllSymptoms implements ISymptomCounter{
/**
 *   count the occurrence of ALL the symptoms and sort alphabetically
 *   
 *   @param listSymptoms : list of strings (the list of the symptoms)
 *   @return Object : a sorted collection of all symptoms and their occurrence 
 */
	public Object countSymptoms(List<String> listSymptoms) {
		TreeMap<String, Integer> treeMapSymptoms = new TreeMap<>();
		
		for (String symptom : listSymptoms){			
			// incrementing counter of symptom
			if  (treeMapSymptoms.containsKey(symptom)) {
				treeMapSymptoms.put(symptom, treeMapSymptoms.get(symptom)+1);
			}
			// adding the symptom in the map collection
			else { 
				treeMapSymptoms.put(symptom, 1);
			}
		}
		return treeMapSymptoms;
	}	
}

