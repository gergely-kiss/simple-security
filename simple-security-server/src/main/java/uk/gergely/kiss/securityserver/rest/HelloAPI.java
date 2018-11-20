package uk.gergely.kiss.securityserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloAPI {

	@GetMapping
	public @ResponseBody String hello() {
		return "Hello";
	}
}
