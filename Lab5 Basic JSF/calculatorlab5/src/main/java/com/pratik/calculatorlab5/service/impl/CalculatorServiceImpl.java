package com.pratik.calculatorlab5.service.impl;

import org.springframework.stereotype.Service;

import com.pratik.calculatorlab5.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public long sum(long num1, long num2) {
		return num1+num2;
	}

	@Override
	public long product(long num1, long num2) {
		return num1*num2;
	}

}
