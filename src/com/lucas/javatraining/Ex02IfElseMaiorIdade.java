/*
 * Programa para treinar condicional composta (if e else)
 * Pede data de nascimento e calcula a idade (ano base do programa 2025)
*/

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex02IfElseMaiorIdade {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis
		//intro
		int tamanhoEspaco = 70;
		int anoAtual = 2025; // ano atual base do programa
		String titulo = "Programa que Verifica se é Maior de idade (Ano atual " + anoAtual + ")";
		String espaco = " ".repeat((tamanhoEspaco - titulo.length()) / 2);
		//outras variáveis
		int idade, anoNascimento;
		
		//intro
		System.out.println("=".repeat(tamanhoEspaco));
		System.out.println(espaco + titulo.toUpperCase() + espaco);
		System.out.println("=".repeat(tamanhoEspaco) + "\n");
		
		//entrada do usuario
		System.out.print("Qual o seu ano de nascimento?: ");
		anoNascimento = teclado.nextInt();
		
		//calculo
		idade = anoAtual - anoNascimento;
		
		//saida
		System.out.print("Sua idade é de " + idade + " anos. Você é ");
		
		//verifica se é menor ou maior de idade com resultado do calculo
		if (idade < 18) {
			System.out.println("menor de idade.");
		} else {
			System.out.println("maior de idade.");
		}
				
		System.out.println("\n" + "=".repeat(tamanhoEspaco));
	
		teclado.close();
	}

}
