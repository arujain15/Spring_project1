package com.nt.sbeans;

import java.time.LocalDate;

public class CalendarService {
	private LocalDate date;
	
	public CalendarService()
	{
		System.out.println("CalendarService() -> 0:param constructor");
	}
	
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	
	public String showMessage()
	{
		int todayDate = date.getDayOfMonth();
		
		if(todayDate == 30 || todayDate == 31)
		{
			return "Month is ending, please submit reports.";
		}
		
		else
			return "Continue working as usual";
	}
}
