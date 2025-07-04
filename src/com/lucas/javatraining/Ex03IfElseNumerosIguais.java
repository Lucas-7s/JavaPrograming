/*
 * Programa para treinar condicional composta (if e else)
 * Verifica as condições de dois números (qual é maior, qual é menor)
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03IfElseNumerosIguais {

	public static void main(String[] args) {
		
		//permite entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		//intro
		String titulo = "Programa que verifica as condições de dois números";
		//entrada
		int num1,num2;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase() + " ".repeat((55 - titulo.length())/2));
		System.out.println("=".repeat(55) + "\n");
		
		//entrada
		System.out.print("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		//saida
		if(num1 > num2) {
			System.out.println("\n" + "O número " + num1 + " é maior que " + num2);
		} else if (num1 == num2) {
			System.out.println("\n" + "O número " + num1 + " é igual a " + num2);
		} else {
			System.out.println("\n" + "O número " + num1 + " é menor que " + num2);
		}

		System.out.print("\n" + "=".repeat(55));
		teclado.close();
	}

}
