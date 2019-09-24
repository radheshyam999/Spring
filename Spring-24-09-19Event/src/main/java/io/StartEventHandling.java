package io;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandling implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("It is start");
	}

}
