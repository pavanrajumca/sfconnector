package com.dataflake.sf.connector.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SFClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(SFClient.class);

	@Autowired
	private RestTemplate restTemplate;

}
