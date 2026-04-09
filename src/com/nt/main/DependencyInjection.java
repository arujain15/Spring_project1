package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.CalendarService;

public class DependencyInjection {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/com/nt/config/appContext.xml");
		
		CalendarService cs = (CalendarService)ctx.getBean("cs");
		
		System.out.println(cs.showMessage());
	}
}
