package com.pratik.starbuckslab5.data;


public class DataFacadeFactory{
	public DataFacade getDataFacadeInstance(String type) {
		if(type.equals("dev")) {
			return  TestDataImpl.INSTANCE;
		}
		return null;
	}
}
