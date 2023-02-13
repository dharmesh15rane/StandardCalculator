package com.banking.serviceImpl;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.banking.serviceimpl.CalculatorServiceImpl;

//@RunWith(MockitoJUnitRunner.class)
class calculatorServiceImplTest {
    
	
	
	@Test
	 public void calculatTest()
	{
		CalculatorServiceImpl cs = new CalculatorServiceImpl();
		assertTrue(cs.calculat(10, "add", 2).equals("12.0"));
		assertTrue(cs.calculat(10, "minus", 2).equals("8.0"));
		assertTrue(cs.calculat(10, "multiply", 2).equals("20.0"));
		assertTrue(cs.calculat(10, "divide", 2).equals("5.0"));
		
		
	}
	@Test
	public void  singleValueOpration()
	{
		CalculatorServiceImpl cs = new CalculatorServiceImpl();
		assertTrue(cs.singleValueOpration("root", 9).equals("3.0"));
		assertTrue(cs.singleValueOpration("squere", 2).equals("4.0"));
		
	}

}
