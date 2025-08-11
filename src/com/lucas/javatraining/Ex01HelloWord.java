/* Exercício
 * Hello World com Entrada de Dados
 * Exibir uma mensagem "Hello World" e solicitar ao usuário seu nome, idade e peso,
 * exibindo as informações formatadas na tela.
 */

package com.lucas.javatraining;

//biblioteca utilizada para entrada do usuário
import java.util.Scanner;

public class Ex01HelloWord {

	public static void main(String[] args) {
		//Abre a entrada (digitação do usuário) nome teclado
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
		double weigh = teclado.nextFloat();
		
		//use print, println, prinf
		System.out.println("\nWelcome " + name + " to the practical lessons of the Java programming language");
		System.out.printf("You are %d years old and weigh %.2f o kilograms", age, weigh);
		
		teclado.close();
		
	}

}
