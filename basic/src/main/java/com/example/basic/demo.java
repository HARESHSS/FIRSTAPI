package com.example.basic;
import java.util.HashMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class demo {
	@GetMapping("/API")
	public HashMap country(){
		HashMap<String,String> obj = new HashMap<String,String>();
		obj.put("INDIA","DELHI");
		obj.put("PARIS","LONDON");
		obj.put("UAE","ABUTHABI");
		return obj;
		
	}
	
}