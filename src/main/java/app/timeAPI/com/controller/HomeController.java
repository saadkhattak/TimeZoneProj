package app.timeAPI.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView homePage(Model model) {
		model.addAttribute("city", new City());
		return new ModelAndView("index");
	}
	
	private String getTimeZone(String city)
	{
	    String baseUri = "http://api.timezonedb.com/v2.1/get-time-zone?key=2BXG0JBYXNS0&format=json&by=zone&zone=";
	    String completeURI = baseUri + city;
	    
	    //Call external API to fetch date and time details. 
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(completeURI, String.class);
	     
	    System.out.println(result);
	    DocumentContext jsonContext = JsonPath.parse(result);
	    
	    String key = "$['formatted']";

	    String formattedTime = jsonContext.read(key);
	    return formattedTime;
	}
	
	@RequestMapping("processCity")
	public ModelAndView Timetime(@ModelAttribute("city") City city, Model model) {
		city.setCityTime(getTimeZone(city.getCityName()));
		model.addAttribute("city", city);
		return new ModelAndView("timeWithCity");
	}
}
