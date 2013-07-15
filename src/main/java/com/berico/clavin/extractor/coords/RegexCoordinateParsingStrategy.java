package com.berico.clavin.extractor.coords;

import java.util.Map;

import com.google.code.regexp.Pattern;

import com.berico.clavin.extractor.CoordinateOccurrence;

/*#####################################################################
 * 
 * CLAVIN (Cartographic Location And Vicinity INdexer)
 * ---------------------------------------------------
 * 
 * Copyright (C) 2012-2013 Berico Technologies
 * http://clavin.bericotechnologies.com
 * 
 * ====================================================================
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * ====================================================================
 * 
 * RegexCoordinateParsingStrategy.java
 * 
 *###################################################################*/

public interface RegexCoordinateParsingStrategy<T> {

	/**
	 * Get the REGEX pattern used to find and extract coordinate occurrences.
	 * @return REGEX pattern.
	 */
	Pattern getPattern();
	
	/**
	 * Given the REGEX-matched text, the named capture groups, and start position
	 * in the document, return a CoordinateOccurrence.
	 * @param matchedString Matched text in the document.
	 * @param namedGroups Named Capture Groups in the REGEX pattern.
	 * @param startPosition Start position in the document.
	 * @return CoordianteOccurrence.
	 */
	CoordinateOccurrence<T> parse(
		String matchedString, Map<String, String> namedGroups, int startPosition);
	
}