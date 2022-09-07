package dev.wannabe.log4j.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestController {
	static Logger logger = LogManager.getLogger(TestController.class);
	public void run() {
		logger.info("Inside TestController");
		logger.warn("Warning from TestController");
	}
}
