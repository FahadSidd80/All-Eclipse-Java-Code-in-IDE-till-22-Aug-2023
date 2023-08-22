//import java.io.*;
import java.util.*;

public class Coding_Questions {

	  

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr a Number : ");
		int N = scanner.nextInt();
		if(1<=N && N<=100){
	           if(N%2!=0){
	                System.out.println("Weird");
	           }else{
	                if(2<=N & N<=5){
	                    System.out.println("Not Weird");
	                }
	                else if(6<=N & N<=20){
	                    System.out.println("Weird");
	                }
	                else {
	                    System.out.println("Not Weird");
	                }
	           }
	            
	        } 
	        
	        


	}

}
