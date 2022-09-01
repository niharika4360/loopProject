import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		//Enter the Number for Table which you want to print
		System.out.print("Enter the number: ");       
		int number=sc.nextInt();  
		//Execute the for loop 10 times for the table
		for(int i=1; i <= 10; i++)  
		{  
		//print the table for the entered number      
		System.out.println(number+" * "+i+" = "+number*i);  
		}
	}

}
