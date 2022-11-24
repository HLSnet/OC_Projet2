package com.hemebiotech.analytics;


public class Heme_Biotech_Application {
	
	public static void main(String args[]) throws Exception {

	// Instanciating an object from AnalyticsCounter
	AnalyticsCounter analyticsCounter = new AnalyticsCounter("symptoms.txt", "result.out");
	
	// Specify which type of input file 
	// in this case, using the implementation ReadSymptomDataFromFile (to read from a text file)
	analyticsCounter.setISymptomReader(new ReadSymptomDataFromFile(analyticsCounter.getinputPath()));
	
	// Specify how to count the symptoms
	// in this case, using the implementation CountAllSymptoms (to count the occurrence of ALL the symptoms	)
	analyticsCounter.setISymptomCounter(new CountAllSymptoms());	


	// Specify which type of output file 
	// in this case, using the implementation WriteSymptomDataToFile ( to write a sorted collection in a text file	)
	analyticsCounter.setISymptomWriter(new WriteSymptomDataCountedSortedToFile(analyticsCounter.getOutPath()));	
	
	// Reading , counting , writing
	analyticsCounter.writeAnalysis();
	}	
}
