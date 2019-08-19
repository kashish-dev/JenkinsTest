package com.example.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

	@RequestMapping(method = RequestMethod.GET, value="/print", produces = MediaType.APPLICATION_JSON)
	public String messageInJson() {
		String msg = "Hello World";
		return msg;
	}
}
