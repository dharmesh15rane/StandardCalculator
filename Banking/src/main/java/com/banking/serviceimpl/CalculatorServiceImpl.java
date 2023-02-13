package com.banking.serviceimpl;

import org.springframework.stereotype.Service;

import com.banking.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	
	@Override
	public String calculat(double first, String oprant, double second) {
		double result =0;
		switch (oprant)
	{
		case "add":
		 {
			result=first + second;
			break;
		 } 
		case "minus":
		 {
			result=first - second;
			break;
		 }
		case "multiply":
		 	result=first * second;
			break;
		case "divide":
		 {
			if(second != 0) {
			result=first / second;}
			else {return "E";}
			break;
		 }
	}
		return String.valueOf(result);
	}

	@Override
	public String singleValueOpration(String opration, double number) {
		double result =0;
		switch (opration){
		case "root":
		 {
			result = Math.sqrt(number);
			break;
		 }
		case "squere":
		 {
			result = Math.pow(number, 2);
			break;
		 }
		case "fraction":
		 {
			result = 1 / number;
			break;
		 }
		case "percent":
		 {
			result = number / 100;
			break;
		 }
		}
		return String.valueOf(result);
		
	}

}
