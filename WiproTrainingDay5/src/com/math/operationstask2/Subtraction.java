package com.math.operationstask2;
import java.util.Scanner;
public class Subtraction {
	static public void main(String... pra) {
		try (Scanner tin = new Scanner(System.in)) {
			System.out.println("Enter first number:");
			int a=tin.nextInt();
			System.out.println("Enter second number:");
			int b=tin.nextInt();
			System.out.print("The subtraction of "+a+" and "+b+" is: "+(a-b));
		}
	}
}
