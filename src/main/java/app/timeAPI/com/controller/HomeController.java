package app.timeAPI.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/try")
	public ModelAndView homePage() {
		System.out.println("Hello");
		getTimeZone();
		return new ModelAndView("index");
	}
	
	private void getTimeZone()
	{
	    final String uri = "http://api.timezonedb.com/v2.1/get-time-zone?key=2BXG0JBYXNS0&format=json&by=zone&zone=America/Chicago";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
}
