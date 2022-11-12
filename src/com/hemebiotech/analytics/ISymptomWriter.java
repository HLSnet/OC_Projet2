package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Anything that will write symptom data from a source
 * The important part is, the parameter transmitted to the operation, which is a Map of <strings, Integer>
 * alphabetically ordered
 * 
 */
public interface ISymptomWriter {
	/**
	 * 
	 *
	 */
	void saveSymptoms (TreeMap<String, Integer> symptoms);
}
