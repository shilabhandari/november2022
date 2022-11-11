package methods;

import java.util.Scanner;

public class MyMethods {

	public static void main(String[] args) {

		//System.out.println( add2numbers(2,3) );
		
		/*
		  int z = add2numbers('t', "omorrow");
		int a = add2numbers('g', "oof");
		System.out.println(z+a);
		
		}
		
		 public static int add2numbers(char tomorrow, String hello ) {
	 System.out.println(tomorrow+hello);
	 return 99;
	 
 } 
	*/
		
// public static int add2numbers(int x , int y) {
	// System.out.println(x+y);
	// return 98;

 //int ad2number2(int x, int y ) = 99
	
	
	Scanner ui =new Scanner(System.in);
	
	System.out.println("What operation would you like to do: add or sub");
	
		String opt = ui.next();
		
		if(opt.equalsIgnoreCase("add")) {
			System.out.println("Your result: "+ add(8,4));
		}
		else if(opt.equalsIgnoreCase("sub")) {
			System.out.println("Your result: "+ sub(8,4));
			
		}
		else {
			System.out.println("Wrong input");
		}
		
	}
	public static int add(int a, int b){
		return a+b;
	}
		public static int sub(int a, int b){
			return a-b;
			
	}













}