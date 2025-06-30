package com.lucas.javatraining;

import java.util.Scanner;

public class Ex01HelloWord {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Hello Word
		System.out.println("Hello Word");
		
		//String
		System.out.print("\nWhat is your full name?: ");
		String name = teclado.nextLine();
		
		//int
		System.out.print("\nHow old are you?: ");
		int age = teclado.nextInt();
		
		//float
		System.out.print("\nWhat is your weight?: ");
		float weigh = teclado.nextFloat();
		
		System.out.println("\nWelcome " + name + " to the practical lessons of the Java programming language");
		System.out.println("You are "+ age + " years old and weigh " +  weigh + " kilograms");
		
		teclado.close();
		
	}

}
