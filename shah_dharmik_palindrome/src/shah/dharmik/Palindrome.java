package shah.dharmik;

/**
 * This class implements a palindrome checker
 * 
 * @author D. Shah
 * @version 1.0
 */
public class Palindrome {

	/**
	 * The method checks to see a word is a palindrome
	 * 
	 * @param word
	 *            - this is the String which will be checked
	 * @return true or false depending on the outcome
	 */
	public static boolean isPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);

		if (word.toString().equals(sb.reverse().toString())) {
			return true;
		}

		return false;

	}

}
