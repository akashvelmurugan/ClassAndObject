package com.classandobject;

import java.util.Scanner;

public class AdditionAndSubtraction {
	Scanner scanner = new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();

	
	public void add() {
		int additin=a+b;	
		System.out.println("'A' and 'B' addition value :"+additin);

	}
	public void subtraction() {
		int subtraction=a-b;
		System.out.println("'A' and 'B' subtration value :"+subtraction);		
	}


}
