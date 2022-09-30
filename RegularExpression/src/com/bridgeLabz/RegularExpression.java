/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Admin
 *
 */
public class RegularExpression {

	/**
	 * UC3 - Email validator
	 */
	public static boolean validate(String pattern, String text) {
		return Pattern.compile(pattern).matcher(text).matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Regex");
			String pattern = "^[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";

			Scanner input = new Scanner(System.in);
			System.out.print("Enter email: ");

			String email = input.next();

			boolean isValid = validate(pattern, email);

			if (isValid) {
				System.out.println("It's a valid email");
			} else {
				System.out.println("It is not a valid email");
			}
		}
}