package com.grwts.configuration;

import org.springframework.context.annotation.Bean;

import com.grwts.depricated.DepricatedImplimentation;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public DepricatedImplimentation getDepricatedImplimentation()
	{
		return new DepricatedImplimentation();
	}
	@Bean
	public DepricatedImplimentation getDepricatedImplimentationObject()
	{
		return new DepricatedImplimentation();
	}
	

}
