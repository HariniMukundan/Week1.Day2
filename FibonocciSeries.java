package week1.day2;

public class FibonocciSeries {
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int range =8;
		int sum = 0;

		for (int i=1; i<=range;i++) {
		sum= n1+n2;
		n1=n2;
		n2=sum;
		System.out.println(sum);
		
							
		}
	}

}
