package net.therap.sleeptracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String printWelcome(ModelMap model) {

        logger.info("In Hello Controller");

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}