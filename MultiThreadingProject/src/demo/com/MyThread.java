/*Q.1 Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers in run())Set their name and prorities.
*/
package demo.com;
class MyThread1 extends Thread{
	//override run method
	public void run()
	{
		int number=10;
		//print even number
	      for(int i= 1; i<= number; i++)
	      {
	         if(i % 2 == 0)
	         {
	            System.out.print(Thread.currentThread().getName()+" "+i + "\n");
	         }
	      }
	      //print odd number
	      for(int i = 1; i <= number; i++)
	      {
	         if(i % 2 == 1)
	         {
	            System.out.print(Thread.currentThread().getName()+" "+i + "\n");
	         }
	      }
	 }
}
public class MyThread 
{
	public static void main(String args[]) 
	{
	//creating two objects 
	 MyThread1 th1=new MyThread1();
	  MyThread1 th2=new MyThread1();
	  //set name
	  th1.setName("thread1");
	  th1.setName("thread2");
	  //set priority
	  th1.setPriority(5);
	  th2.setPriority(10);
	  //start executing thread
	  th1.start();
	  th2.start();

    }
}