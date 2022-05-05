package com.dataflake.sf.connector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataflake.sf.connector.client.SFClient;
import com.dataflake.sf.connector.request.SFConnectionRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Connector {

	private static final Logger LOGGER = LoggerFactory.getLogger(Connector.class);

	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private SFClient sfClient;

	@PostMapping("/sf/connect")
	public Object connect(@RequestBody SFConnectionRequest payload) throws JsonProcessingException {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		LOGGER.info("SF Connector triggerred with payload: {}", objectMapper.writeValueAsString(payload));
		stopWatch.stop();
		LOGGER.info("Time Taken to process the SF Connector is: {} Seconds", stopWatch.getTotalTimeSeconds());
		return null;
	}

}
