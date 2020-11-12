package com.training.org.SpringbootApplication;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculation {
	@Autowired
	//private static Environment environment;
	
	
	@Value("${sbpg.init.number}")
	private int number;
	
	@Value("${sbpg.init.numbers}")
	private int[] numbers;
	
	@Value("#{${sbpg.init.number-map}}")
	private Map<String, Integer> numberMap;
	
	@Value("#{'${sbpg.init.nums}'.split(';')}")
	private List<Integer> nums;
	
	@RequestMapping("/")
	public String getNumber() {
		//System.out.println(environment.getProperty("spring.application.name"));
		return "Hello"+nums;
	}
}
