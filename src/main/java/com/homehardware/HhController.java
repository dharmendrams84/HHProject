package com.homehardware;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public final class HhController {
	protected static final Logger logger = Logger.getLogger(HhController.class);

	@RequestMapping("/login")
	public final String login() {
		logger.error("inside login method");
		return "home.html";
	}
}
