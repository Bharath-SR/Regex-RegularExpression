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
	 * UC7 - Password validator 3
	 */
static boolean validate(String pattern, String text) {
		
		return Pattern.compile(pattern).matcher(text).matches();
	}

	public static void main(String[] args) {
		System.out.println("welcome to Password Validator");
			String pattern ="^[0-9]{1}[a-zA-Z0-9]{8,}$";

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please Enter password:");

			String  password= scanner.next();

			boolean isValid = validate(pattern, password);

			if (isValid) {
				System.out.println("It's a valid password .");
			} else {
				System.out.println("It is not a valid password");
			}
		}
}