package com.algorithm.problems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message_Demonstration_Regex {
	static final String REGEX_NAME = "<<name>>";
	static final String REGEX_FULLNAME = "<<full name>>";
	static final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	static final String REGEX_DATE = "01/01/2016";
	
	static String message;
	
	public static void customize_message(String input_string) {
		Pattern pattern1 = Pattern.compile(REGEX_NAME);
		Matcher matcher1 = pattern1.matcher(input_string);	
		message = matcher1.replaceAll("Nikhil");                 //matching and replacing name
		
		Pattern pattern2 = Pattern.compile(REGEX_FULLNAME);
		Matcher matcher2 = pattern2.matcher(message);
		message = matcher2.replaceAll("Nikhil Sundarasetty");       //matching and replacing full name
		
		Pattern pattern3 = Pattern.compile(REGEX_MOBILE_NO);
		Matcher matcher3 = pattern3.matcher(message);
		message = matcher3.replaceAll("9398359637");           //matching and replacing mobile number
		
		/** Getting present date **/
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime localDate = LocalDateTime.now();
		
		Pattern pattern4 = Pattern.compile(REGEX_DATE);             //matching and replacing date with present date.
		Matcher matcher4 = pattern4.matcher(message);
		message = matcher4.replaceAll(date.format(localDate));
		System.out.println(message);
	}
	
	/** Main method **/
	public static void main(String[] args) {
		String input_string = "Hello <<name>>, We have your full name as <<full name>> in our system. Your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification. Thank you BridgeLabz 01/01/2016.";
		customize_message(input_string);
	}
}
