/* O QUE O PROGRAMA FAZ:
 * Programa para treinar Estrutura Condicional Encadeada (if, else if, else)
 * Classifica por idade
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03ClassificaPorIdade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis
		String titulo = "Programa que classifica por idade";
		int idade;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		//entrada
		System.out.print("Qual a idade para classificar?: ");
		idade = teclado.nextInt();
		
		//saida
		if(idade <= 7) {
			System.out.println("Infantil A");
		} else if (idade <= 11) {
			System.out.println("Infantil B");
		} else if (idade <= 15) {
			System.out.println("Juvenil A");
		} else if (idade <= 17) {
			System.out.println("Juvenil B");
		} else {
			System.out.println("Adulto");
		}

		System.out.println("\n" + "=".repeat(55));
		teclado.close();
	}

}
