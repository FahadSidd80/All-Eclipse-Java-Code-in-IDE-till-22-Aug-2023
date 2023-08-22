import java.io.*;
import java.util.*;
public class Basic_Java_GFG {
	
	
	

	public static void main(String[] args) throws IOException
	{
		
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
//		System.out.print("Enetr a string : ");
//		String s = br.readLine();
//		System.out.println("You enterd a String  : " + s);
		
		
//		BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enetr a number : ");
//		int n = Integer.parseInt(brr.readLine());
//		System.out.println("Your number is : " + n);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please entered a Name ");
//		String name = sc.nextLine();
//		System.out.println("you entered a string " + name);
//		System.out.println("Please eneter  age : ");
//		int age = sc.nextInt();
//		System.out.println("You entered a number :  " + age);
//		System.out.println("please eneter maks ");
//		float marks = sc.nextFloat();
//		System.out.println("You entered a marks : " + marks);
		
//		
//		Scanner scn = new Scanner (System.in);
//		System.out.println("Please enter a number :");
//		int num = scn.nextInt();
//		if(num>0)
//		{
//			if(num%2==0)
//			{
//				System.out.print("Even ");
//			}
//			else 
//			{
//				System.out.print("Odd ");
//			}
//			System.out.println("Positive");
//		}
//		else if (num<0)
//		{
//			if(num%2==0)
//			{
//				System.out.print("Even ");
//			}
//			else 
//			{
//				System.out.print("odd ");
//			}
//			System.out.println("Negative");
//		}
//		else 
//		{
//			System.out.println("Number is Zero");
//		}
//
		
//		int n= 5;
//		if(n%3==0)
//		{
//
//			System.out.println("Hello !");
//			
//			 if(n%5==0)
//			    {
//			    	System.out.println("Bye !!");
//			    }
//
//		}
//		
		
		System.out.println("Please enter number ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input !!");
			return;
		}
		System.out.println((n*(n+1))/2);
	
	} 


}
