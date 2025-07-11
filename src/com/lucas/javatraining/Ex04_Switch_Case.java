/* O QUE O PROGRAMA FAZ:
 * Programa para treinar Switch Case
 * Programa que analisa Quantidade de Pernas
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex04_Switch_Case {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis
		String titulo = "Programa que analisa Quantidade de Pernas";
		int pernas;
		String tipo;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");

		System.out.print("Qual a quantidade de pernas?: ");
		pernas = teclado.nextInt();
		
		System.out.print("Possui " + pernas + " pernas, então é ");
		
		switch (pernas){
			case 1:
				tipo = "saci";
				break;
			case 2:
				tipo = "bipede";
				break;
			case 4:
				tipo = "quadrupede";
				break;
			case 8:
				tipo = "aranha";
				break;
			default:
				if(pernas >= 30 && pernas <= 382) {
					tipo = "sentopeia";
				} else {
					tipo = "ET";
				}
				break;
		}
		System.out.println(tipo);
		
		System.out.println("\n" + "=".repeat(55));
		teclado.close();
	}
}
