package com.assignment.model;

/*
 * This is a Bank Services Model which is used to output the All Services in the Bank
 * It has only one property named as serviceName
 */

public class Services {

	private String serviceName;

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(String serviceName) {
		super();
		this.serviceName = serviceName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		return "Services [serviceName=" + serviceName + "]";
	}
}
