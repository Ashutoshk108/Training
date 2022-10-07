package demoSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomeController {
	@RequestMapping(value="/welcome.html" method= RequestMethod.GET)
	public String display() {
		return "welcome";
	}
}
