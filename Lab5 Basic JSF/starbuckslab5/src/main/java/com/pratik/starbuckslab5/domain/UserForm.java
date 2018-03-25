package com.pratik.starbuckslab5.domain;

import com.pratik.starbuckslab5.data.DataFacade;

public class UserForm {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "name:"+this.name+"passowrd:"+this.password;
	}
	
	
	public boolean authenticate(DataFacade data){
		
		String expectedPassword = data.findPassword(name );
		
		return expectedPassword != null && expectedPassword.equals(password);
				
		
	}
	
	
	

}
