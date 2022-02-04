package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		
		String word1 = "amma";
		String revword ="";
		
		for(int i=word1.length()-1; i>=0; i--)
			
		{revword=revword+word1.charAt(i);
			}
		System.out.println(revword);
		if(word1.equalsIgnoreCase(revword)) 
			System.out.println("word1 is a palindrome");
		else System.out.println("word1 not apalindrome"); 
		}
	}

