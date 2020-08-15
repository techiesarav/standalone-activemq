package com.example.messaging.standaloneactivemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination="standalone.queue")
	public void consumeResource(String message) {
		System.out.println("Recieved Message "+message);
	}
}
