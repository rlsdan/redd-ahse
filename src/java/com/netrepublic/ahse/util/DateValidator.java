package com.netrepublic.ahse.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {

	public Boolean isValid(String date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		format.setLenient(false);
		try {
			format.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
		} 

	}

}