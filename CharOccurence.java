package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		String S1 = "welcome to class";
		char search = 'c';
		int count =0;
		for(int i=0;i<S1.length();i++) {
			if(search==S1.charAt(i))
				count++;
	
		}
		
		System.out.println("No.of "+search+" is "+count);
	}
	

}
