package com.gain.java.knowledge.messaging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/message")
	public String getMessage() {
		return "Aws code pipeline Re-deployement";
	}
}
