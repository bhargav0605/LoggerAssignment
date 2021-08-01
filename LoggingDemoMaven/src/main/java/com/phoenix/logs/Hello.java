package com.phoenix.logs;
/*
 * @author bhargav.parmar@stltech.in
 * @version 1.0
 * @creation_date 28-Jul-2021
 * @copyright Sterlite Technology Ltd.
 */

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {
	
	private static final Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) {
		LOGGER.info("This is info message");
		LOGGER.debug("This is debug message");
		LOGGER.warn("This is warning message");
		LOGGER.error("This is error message");
		
		// Generic Method
		LOGGER.log(Level.TRACE, "This is trace message");

	}

}
