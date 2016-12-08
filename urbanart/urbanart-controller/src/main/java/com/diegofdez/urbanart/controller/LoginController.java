package com.diegofdez.urbanart.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	Logger LOG = Logger.getLogger(LoginController.class.getCanonicalName());
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView createUser(@RequestParam(value="name", required=false, defaultValue="World") String name) {

		LOG.info("Received body: " + name);
		
		String result = null;
		
		final ModelAndView mav = new ModelAndView("jsonView");
		mav.addObject("response", result);
		return mav;
	}
	
}
