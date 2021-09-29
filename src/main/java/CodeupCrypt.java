public class CodeupCrypt {
	public static double version;

	public static String hashPassword(String input){
		String output = "";
		for(int i = 0; i < input.length(); i++)
			switch (Character.toLowerCase(input.charAt(i))) {
				case 'a' -> output += 4;
				case 'e' -> output += 3;
				case 'i' -> output += 1;
				case 'o' -> output += 0;
				case 'u' -> output += 9;
				default -> output += Character.toLowerCase(input.charAt(i));
		}
		return output;
	}

	public static boolean checkPassword(String hash, String original) {
		return hash.equals(hashPassword(original));
	}
}
