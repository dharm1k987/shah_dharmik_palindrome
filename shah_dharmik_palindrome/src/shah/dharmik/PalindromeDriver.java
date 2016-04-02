package shah.dharmik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This driver class implements a palindrome class and tests many words
 * 
 * @author D. Shah
 * @version 1.0
 */
public class PalindromeDriver {

	public static void main(String[] args) {		

		long start = System.currentTimeMillis();
		String dir = System.getProperty("user.dir");		
		String fileName = dir + "\\words.txt";
		ArrayList<String> palindromeList = new ArrayList<String>();
		String longest = "";
		File x = new File(fileName);
		ArrayList<String> words = new ArrayList<String>();

		try {
			Scanner inFile = new Scanner(x);

			while (inFile.hasNextLine()) {
				String a = inFile.nextLine();
				words.add(a);
				if (Palindrome.isPalindrome(a)) {
					palindromeList.add(a);
				}
			}

			for (String aPalindrome : palindromeList) {
				if (aPalindrome.length() >= longest.length()) {
					longest = aPalindrome;
				}
			}

			System.out.print("Palindrome Checker \n ********** \n");
			System.out.printf("There are %d words to check.\n", words.size());
			System.out.printf("There are %d palindromes.\n",
					palindromeList.size());
			System.out.print("The palindromes are: ");
			for (String aPalindrome : palindromeList) {
				System.out.print(aPalindrome + " ");
			}

			long end = System.currentTimeMillis();
			System.out.printf("\nThis task took %d ms.\n", end - start);
			System.out.printf(
					"The longest palindrome is %s and it is %d letters.",
					longest, longest.length());

			inFile.close();

		} catch (FileNotFoundException e) {
			
			if (x.isDirectory()){
				System.out.println(fileName + " is a directory.");
				int numFiles = x.listFiles().length;
				System.out.printf("The directory has %d files.", numFiles);				
			} else {
			System.out.printf("Error. The file \"%s\" cannot be found.", x);
		}

	}

	}
}
