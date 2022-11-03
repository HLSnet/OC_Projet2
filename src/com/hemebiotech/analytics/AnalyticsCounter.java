package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String args[]) throws Exception {
		// Opening the file containing the list of the symptoms
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		
		// reading the first symptom
		String line = reader.readLine();

		while (line != null) {
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headacheCount++;
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("dialated pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// generate output
		FileWriter writer = new FileWriter ("result.out");
		
		writer.write("headache: " + headacheCount + "\r\n");
		writer.write("rash: " + rashCount + "\r\n");
		writer.write("dialated pupils: " + pupilCount + "\r\n");
		writer.close();
	}
}
