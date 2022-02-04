package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int range =6;
		int F1=1;
		int Fact =1;
		int Factorial = 1;
		int a=1;
		
		for (int i=1; i<=range; i++) {
			Fact = F1*i;
			F1 = Fact;
			Factorial = Fact*1;	
			
		}
			
		System.out.println("Factorial of "+ range +" is "+ Factorial);
			
	
	}

}
