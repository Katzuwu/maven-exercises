import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey! Let's play a game. Give me a string, and I'll do some fun stuff with it.");
		String userString = sc.nextLine();
		System.out.println("The string you entered is: " + "\"" + userString + "\"");
		System.out.println(tellsIfStringIsNumberOrNot(userString));
		System.out.println("Your string with inverted case is: " + StringUtils.swapCase(userString));
		System.out.println("Your string reversed is: " + StringUtils.reverse(userString));
	}

	public static String tellsIfStringIsNumberOrNot(String str){
		if(!StringUtils.isNumeric(str))
			return "\"" + str + "\""+ " is not a number.";
		else
			return "\"" + str + "\"" +  " is a number";
	}
}
