/* O QUE O PROGRAMA FAZ:
 * Programa para treinar Estrutura Condicional Encadeada (if, else if, else)
 * Programa que analisa idade obrigatoriedade de votos
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03IdadeVotar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis
		String titulo = "Programa que verifica idade Minima para votar";
		int ano, idade;
		int anoAtual = 2025;
		
		//Intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		System.out.print("Qual o ano de seu nascimento?: ");
		ano = teclado.nextInt();
		
		idade = anoAtual - ano;
		
		System.out.print("\n" + "Sua idade é " + idade);
		
		if(idade < 16) {
			System.out.println(", Você não vota.");
		} else if (idade < 18 || idade > 70) {
			System.out.println(", Você não é obrigado a votar.");
		} else {
			System.out.println(", Você é obrigado a votar.");
		}

		System.out.println("\n" + "=".repeat(55));
		teclado.close();
	}
}
