package com.pengqiang;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopedEventHandler implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStoppedEvent recved.");
	}
}
