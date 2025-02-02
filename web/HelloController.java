package fi.k2021sanna.Week1Exe1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {

	@RequestMapping("hello")
	@ResponseBody
	public String helloGreeting(@RequestParam(name = "name", required = false, defaultValue = "Joku") String name, 
			@RequestParam(defaultValue = "location") String location) {
		return "Welcome to the " + location + " " + name + "!"; 
	}
	
}
