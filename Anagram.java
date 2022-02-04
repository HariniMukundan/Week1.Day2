package week1.day2;

import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		
		String Word1 = "racks";
		String Word2 = "craks";
		
		if (Word1.length()!= Word2.length()) {
			System.out.println("The Word1 and Word2 are not Anagram");
		}
		else {
			char[] String1=Word1.toCharArray();
			char[] String2=Word2.toCharArray();
			
			Arrays.sort(String1);
			Arrays.sort(String2);
			
			if (Arrays.equals(String1,String2)==true) {
				System.out.println("Strings are Anagram");
			}
			else {
				System.out.println("Strings are not Anagram");
			}
		}
	}
	

}
