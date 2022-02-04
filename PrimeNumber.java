package week1.day2;

public class PrimeNumber {
			
			public static void main(String[] args) {
				int i;
				int range = 13;
				boolean flag=false;
				
				for(i=2; i<=range/2; i++) {
					
					if(range%i==0) {
						System.out.println( range  +"  is not a prime number");
						
						flag=true;
						break;
					
					}
						if(flag==true) {
							
						System.out.println( range +"  is a prime number");	
							
						}
						
					}
			
							
		}

}
