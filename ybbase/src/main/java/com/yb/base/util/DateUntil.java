package com.yb.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUntil {

	public static boolean isInWeak(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setFirstDayOfWeek(Calendar.MONDAY);// 西方周日为一周的第一天，将周一设为一周第一天
		cal2.setFirstDayOfWeek(Calendar.MONDAY);
		cal1.setTime(date1);
		cal2.setTime(date2);
		int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
		if (subYear == 0)// subYear==0,说明是同一年
		{
			if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
				return true;
		} else if (subYear == 1 && cal2.get(Calendar.MONTH) == 11) // subYear==1,说明cal比cal2大一年;java的一月用"0"标识，那么12月用"11"
		{
			if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
				return true;
		} else if (subYear == -1 && cal1.get(Calendar.MONTH) == 11)// subYear==-1,说明cal比cal2小一年
		{
			if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
				return true;
		}
		return false;
	}
	
	public static Date getFirstDate(Date date){
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String sdate=null;
		sdate=sd.format(date);
		Calendar cal = Calendar.getInstance();
		Date fordate=null;
		try {
			fordate = sd.parse(sdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cal.setTime(fordate);
		int d=0;
		System.out.println(Calendar.DAY_OF_WEEK);
		if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
            d = -6;
        } else {
            d = 2 - cal.get(Calendar.DAY_OF_WEEK);
        }
		cal.add(Calendar.DAY_OF_WEEK, d);
		return cal.getTime();
		
	}
	public static Date addDate(Date date,Integer num){
		Calendar calendar =Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.DATE, num);
		return calendar.getTime();
	}
	
	
	

}
