package edu.mum.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.repository.DataFacade;
import edu.mum.service.AdviceService;

@Service
public class AdviceServiceImp implements AdviceService {
	
	@Autowired
	DataFacade dataFacade;

	@Override
	public List<String> getAdvice(String roast) {
		return dataFacade.getAdvice(roast);
	}

}
