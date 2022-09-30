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
	 * UC4 - Mobile Number validator
	 */
	static boolean validate(String pattern, CharSequence num) {
		return Pattern.compile(pattern).matcher(num).matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Regex");
			String pattern ="^(91)[-.+]{1}[1-9]{1}[0-9]{9}$";

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please Enter mobile number:");

			CharSequence num = scanner.next();

			boolean isValid = validate(pattern, num);

			if (isValid) {
				System.out.println("It's Valid Mobile Number");
			} else {
				System.out.println("It is not a valid mobile number");
			}
		}
}