package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(CarClient.class);

	public static void main(String[] args) {

		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.MICRO, Location.USA));
		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.MINI, Location.USA));
		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.LUXURY, Location.USA));

		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.MICRO, Location.INDIA));
		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.MINI, Location.INDIA));
		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.LUXURY, Location.INDIA));

		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.MICRO, Location.DEFAULT));
		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.MINI, Location.DEFAULT));
		LOGGER.debug("CARFACTORY:", CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
	}
}
