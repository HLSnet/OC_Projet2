package com.hemebiotech.analytics;

/**
 * Anything that will write the counting of symptom data to a destination
 * 
 */
public interface ISymptomWriter {
	/**
	 * 
	 * @param symptoms Object containing the result of the counting of symptoms
	 */
	void saveSymptoms(Object symptoms);
}
