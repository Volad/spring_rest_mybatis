package net.sc.reporting.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/sayHello")
public class SimpleRestController {
	@RequestMapping(value = "/{user}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String user) {
		String result = "Hello " + user;
		return result;
	}
}
