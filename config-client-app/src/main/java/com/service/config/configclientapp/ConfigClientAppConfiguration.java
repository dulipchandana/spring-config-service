/**
 * 
 */
package com.service.config.configclientapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author dulip
 *
 */
@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientAppConfiguration {
	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

}
