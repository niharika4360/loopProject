import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		        String str1;   
		        int count=0;
				Scanner sc=new Scanner(System.in);
			
                
		        System.out.println("The entered string is: "); 
		         str1=sc.nextLine();
		        //Count the characters in the string except space    
		        for(int i = 0; i < str1.length(); i++) 
		        {    
		            if(str1.charAt(i) != ' ')    
		                count++;    
		        }                
		        //Displays the total number of characters in the string    
		        System.out.println("Total number of characters in the string: " + count);    
		    }      
		


	}


