package com.hemebiotech.analytics;

import java.util.List;


/**
*   Class used to count (possibly in many ways)  symptoms from a file
 *  without a specific format (e.g. : txt, csv, ..)
 *  The result is store in a file.
 * 
 *  The important part : the parameter transmitted to the operation, which is a list of strings (that may contain many duplications)
 *  and the return value from the operation is possibly a number, collection, etc...
 * 
 *
 */
public interface ISymptomCounter {
	/**
	 * 
	 * @param listSymptoms : list of strings (that may contain many duplications)
	 * @return : object to be precised in the implementation
	 * 
	 */
	Object countSymptoms (List<String> listSymptoms);
}


