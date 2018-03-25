package com.pratik.starbuckslab5.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.pratik.starbuckslab5.data.DataFacade;
import com.pratik.starbuckslab5.data.DataFacadeFactory;


public class ContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext servletContext = event.getServletContext();
		String version = servletContext.getInitParameter("version");
		DataFacade data = new DataFacadeFactory().getDataFacadeInstance(version);
		servletContext.setAttribute("dataSource", data);
		
	}
	

}
