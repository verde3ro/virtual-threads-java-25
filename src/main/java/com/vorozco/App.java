package com.vorozco;

import java.util.logging.Logger;

import com.vorozco.jep444.VirtualThreadsDemo;

/**
 * Hello world!
 */
public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main() throws InterruptedException {
		VirtualThreadsDemo.run();
		LOGGER.info("Hello World!");
	}

}
