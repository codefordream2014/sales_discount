package com.eric.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
	public static String decimalFormat(double d){
		DecimalFormat df= (DecimalFormat) NumberFormat.getInstance();
		df.setMinimumFractionDigits(2);
		df.setMaximumFractionDigits(2);
		return df.format(d);
	}
}
