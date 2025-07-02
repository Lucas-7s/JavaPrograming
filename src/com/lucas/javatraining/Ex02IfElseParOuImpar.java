/*
 * Programa para treinar condicional composta (if e else)
 * Verifica se o número digitado é par ou impar
*/

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex02IfElseParOuImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaracao de variaveis
		String titulo = "Programa que verifica se é par ou impar"; //Intro
		int num; //entrada
		
		//Intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase() + " ".repeat((55 - titulo.length())/2));
		System.out.println("=".repeat(55) + "\n");
		
		//entrada
		System.out.print("Digite um número Inteiro: ");
		num = teclado.nextInt();
		
		//confere se o resultado da divisão por 2 é 0, caso seja o número é par
		if (num % 2 == 0) {
			System.out.print("O número " + num + " é Par");
		} else {
			System.out.print("O número " + num + " é Impar");
		}

	}

}
