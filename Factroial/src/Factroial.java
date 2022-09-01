import java.util.Scanner;
class Fact1
{
	int i=1;
	int fact=1;
	public void  factorial()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number=");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+n+"is="+fact);
	}

}
public class Factroial 
{
public static void main(String args[])
{
	Fact1 obj=new Fact1();
	obj.factorial();
}
}



	