package com.cognizant.observerPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cognizant.abstractFactoryPattern.CarClient;

public class NotificationService implements INotificationService {
	List<INotificationObserver> observers;
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}

	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		LOGGER.info("start");
		for (INotificationObserver iNotificationObserver : observers) {
			LOGGER.info(iNotificationObserver.toString());
		}
		LOGGER.info("end");
	}

	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		LOGGER.info("start");
		for (INotificationObserver iNotificationObserver : observers) {
			LOGGER.info(iNotificationObserver.toString());
		}
		LOGGER.info("end");
	}

	public void notifySubscriber() {
		for (INotificationObserver iNotificationObserver : observers) {
			iNotificationObserver.onServerDown();
		}
	}

}
