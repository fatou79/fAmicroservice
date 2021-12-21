package com.fatou.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum;
	private int maximum;
	
	public int getMimimum() {
		return minimum;
	}
	public void setMimimum(int mimimum) {
		this.minimum = mimimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

}
