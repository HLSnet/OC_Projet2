package com.hemebiotech.analytics;

/**
 * 
 * @author Said
 *
 */
public class AnalyticsCounter {
	private ISymptomReader iSymptomReader = null; // used to specify which type of input file
	private ISymptomCounter iSymptomCounter = null; // used to specify how to count the symptoms
	private ISymptomWriter iSymptomWriter = null; // used to specify which type of output file

	private String inputPath;
	private String outputPath;

	/**
	 * Reading , counting , writing
	 * 
	 */
	public void writeAnalysis() {
		// Writing in the output file,
		this.iSymptomWriter.saveSymptoms(
				// the counting of symptoms
				this.iSymptomCounter.countSymptoms(
						// read from the input file.
						this.iSymptomReader.getSymptoms()));
	}

	// CONSTRUCTORS
	
	public AnalyticsCounter() {

	}

	/**
	 * 
	 * @param inputPath  <String> a full or partial path to file with symptom
	 *                   strings
	 * @param outputPath <String> a full or partial path to a file for writing the
	 *                   result of counting
	 */
	public AnalyticsCounter(String inputPath, String outputPath) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
	}

	// GETTERS and SETTERS
	public void setISymptomReader(ISymptomReader iSymptomReader) {
		this.iSymptomReader = iSymptomReader;
	}

	public ISymptomReader getISymptomReader() {
		return this.iSymptomReader;
	}

	public void setISymptomCounter(ISymptomCounter iSymptomCounter) {
		this.iSymptomCounter = iSymptomCounter;
	}

	public ISymptomCounter getISymptomCounter() {
		return this.iSymptomCounter;
	}

	public void setISymptomWriter(ISymptomWriter iSymptomWriter) {
		this.iSymptomWriter = iSymptomWriter;
	}

	public ISymptomWriter getISymptomWriter() {
		return this.iSymptomWriter;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public String getInputPath() {
		return this.inputPath;
	}

	public void setOutPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public String getOutPath() {
		return this.outputPath;
	}

}
