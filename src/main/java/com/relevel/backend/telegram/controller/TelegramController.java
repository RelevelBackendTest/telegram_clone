package com.relevel.backend.telegram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelegramController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

