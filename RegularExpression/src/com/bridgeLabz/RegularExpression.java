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
	public static boolean checkValidPincode(String firstName) {
		String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
		Pattern pattrenObject= Pattern.compile(firstNameRegex);
		
		if(firstName==null) {
			return false;
			
		}
		Matcher matcherObject = pattrenObject.matcher(firstName);
        return matcherObject.matches();
	} 
	public static void main(String[] args) {
		
		System.out.println("----- Name Validator -----");
		
		String firstName ="Bha";
		boolean isfirstName = checkValidPincode(firstName);
		
		if(isfirstName)
			System.out.println(firstName+" is an Valid firstName");
		else
			System.out.println(firstName+" is an Invalid firstName");
	}

}