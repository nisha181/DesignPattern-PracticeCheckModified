package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.abstractFactoryPattern.CarClient;

public class SteveObserver implements INotificationObserver {
	String name = "Steve";

	private static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);

	public void onServerDown() {
		LOGGER.info("start");
		LOGGER.info(name + " : Notification has been Recieved");
		LOGGER.info("end");
	}

	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
