package app.timeAPI.com.controller;

import java.text.SimpleDateFormat;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

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
	    DocumentContext jsonContext = JsonPath.parse(result);
	    String jsonpathCreatorNamePath = "$['timestamp']";
	    String jsonpathCreatorNamePath1 = "$['formatted']";

	    int jsonpathCreatorName = jsonContext.read(jsonpathCreatorNamePath);
	    String jsonpathCreatorName1 = jsonContext.read(jsonpathCreatorNamePath1);

	    
	    System.out.println(jsonpathCreatorName);
	    System.out.println(jsonpathCreatorName1);
	    


	    
	    
		/*
		 * DateTime date = DateTime.parse(jsonpathCreatorName1,
		 * DateTimeFormat.forPattern("HH:mm:ss"));
		 * 
		 * DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm:ss"); String dtStr =
		 * fmt.print(date);
		 */

	
	
	}
}
