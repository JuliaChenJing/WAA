package com.pratik.starbuckslab5.data;

import java.util.List;



public class TestDataImpl implements DataFacade {
	private static final Database data = new Database();
	 
	// Private constructor. Prevents instantiation from other classes.
	private TestDataImpl() {
		
	}

	// eager init'ed singleton...
	public final static TestDataImpl INSTANCE = new TestDataImpl();

	public String findPassword (String name ) {
 		String expectedPassword = data.getPassword(name);
		return expectedPassword;
	}
	public List<String> getAdvice(String roast) { 
		return data.getAdvice(roast);
	}
}
