package dev.wannabe.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.wannabe.log4j.controller.TestController;

public class Main {
	
	static Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		logger.trace("this is trace");
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is error");
		logger.fatal("this is fatal");
		
		TestController controller = new TestController();
		controller.run();
	}
}
