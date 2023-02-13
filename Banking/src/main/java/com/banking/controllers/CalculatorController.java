package com.banking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.service.CalculatorService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CalculatorController {

	@Autowired
	CalculatorService clService;
	
	@GetMapping("/{first}/{operation}/{second}")
	public ResponseEntity<String> calculateValue(@PathVariable("first") double first,@PathVariable("operation") 
	                                             String operation,@PathVariable("second") double second)
	{
	     String s =this.clService.calculat(first, operation, second);
	     return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	
	@GetMapping("/{operation}/{number}")
	public ResponseEntity<String> singleValue(@PathVariable("operation") 
	                              String operation,@PathVariable("number") double number)
	{
		String s = this.clService.singleValueOpration(operation, number);
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
}
