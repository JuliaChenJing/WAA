package edu.mum.serviceImp;

import org.springframework.stereotype.Service;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;

@Service
public class CalculatorServiceImp implements CalculatorService {

	@Override
	public Calculator compute(Calculator calculator) {
		Integer sum = calculator.getAdd1() + calculator.getAdd2();
		calculator.setSum(sum);
		
		Integer product = calculator.getMult1() * calculator.getMult2();
		calculator.setProduct(product);
		
		return calculator;
	}

}
