package io.ExampleFive.operator;

import io.ExampleFive.service.Service;

public class Airtel implements Operator {
	Service service;

	public Service getService() {

		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
}
