package com.Task;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Firt number");
		double a=sc.nextDouble();
		System.out.println("Enter Second number");
		double b=sc.nextDouble();
		System.out.println("Enter your Operation");
		 String operation=sc.next();
		switch(operation) {
		case "add":{
		     System.out.println(a+b);
		     break;
		}
		
		case "sub":{
			System.out.println(a-b);
			break;
			
		}
		case "multi":{
			System.out.println(a*b);
			break;
		}
		case "div":{
			if(b!=0) {
				System.out.println(a/b);
			}
			else {
				 System.out.println("Error: Division by zero.");
			}
			break;
		}
		  default:
              System.out.println("Invalid operation. Use add, sub, multi, or div.");
		}
		
		
	}
}

