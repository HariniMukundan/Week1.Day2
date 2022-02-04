package week1.day2;

public class PrintReverseEvenWords {

	public static void main(String[] args) {
		
		String str = "My Name Is Harini";
		String a[] = str.split(" ");
		
		for(int i=0;i<a.length;i++)
				{
			System.out.print(a[i]+" ");
			
				}
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--)
		{
			if (i%2==0)
			System.out.print(a[i]+" ");
		}
	
	
	}

}
