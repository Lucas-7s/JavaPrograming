/*
 * Programa para treinar Estrutura Condicional Encadeada
 * Pega 2 notas e calcula a média com resposta personalizada
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03IfElseEncadeado {

	public static void main(String[] args) {
		
		//intro
		String titulo = "Programa que Calcula média";
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) / 2) + titulo.toUpperCase() + " ".repeat((55 - titulo.length()) /2));
		System.out.println("=".repeat(55) + "\n");
		
		//Abilita a entrada usuário
		Scanner teclado = new Scanner(System.in);
		
		//entrada das notas
		System.out.print("Digite a nota 01: ");
		String nota1 = teclado.nextLine(); //recebo como string para depois converter pra float, para poder receber tanto . quanto , sem dar erro
		nota1 = nota1.replace(",", "."); 
		
		System.out.print("Digite a nota 02: ");
		String nota2 = teclado.nextLine();
		nota2 = nota2.replace(",", "."); 
		
		
		//calculo
		float media = (Float.parseFloat(nota1) + Float.parseFloat(nota2)) / 2;
		 
		//saida
		System.out.print("\n" + "A média é: " + media + " Resultado: ");
		
		//saida personalizada conforme a média. Condicional composta
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		System.out.println("=".repeat(55));
		teclado.close();
	}

}
