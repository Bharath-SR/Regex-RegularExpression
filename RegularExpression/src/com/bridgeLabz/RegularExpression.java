/**
 * 
 */
package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Admin
 *
 */
public class RegularExpression {

	/**
	 * @param args
	 */
	public static boolean checkValidPincode(String lastName) {
		String lastName1= "^[A-Z]{1}[A-Za-z]{2,}$";
		Pattern pattrenObject= Pattern.compile(lastName1);
		
		if(lastName1==null) {
			return false;
			
		}
		Matcher matcherObject = pattrenObject.matcher(lastName);
        return matcherObject.matches();
	}
	public static void main(String[] args) {
		
		System.out.println("LastName: ");
		
		String lastName ="Se";
		boolean islastName = checkValidPincode(lastName);
		
		if(islastName)
			System.out.println(lastName+" is an Valid lastName");
		else
			System.out.println(lastName+" is an Invalid Name");
		
		
		
	}

}