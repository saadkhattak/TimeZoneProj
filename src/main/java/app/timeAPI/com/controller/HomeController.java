package app.timeAPI.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/try")
	public ModelAndView homePage() {
		System.out.println("Hello");
		return new ModelAndView("index");
	}

}
