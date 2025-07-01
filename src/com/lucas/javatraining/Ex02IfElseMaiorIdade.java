package com.lucas.javatraining;

import java.util.Scanner;

public class Ex02IfElseMaiorIdade {

	public static void main(String[] args) {
		
		//Abre a entrada (digitação do usuário) nome teclado
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis
		//cabeçario
		
		int tamanhoEspaco = 70;
		int anoAtual = 2025;
		int idade, anoNascimento;
		String titulo = "Programa que Verifica se é Maior de idade (Ano atual " + anoAtual + ")";
		String espaco = " ".repeat((tamanhoEspaco - titulo.length()) / 2);
		
		//titulo do programa, o cabeçario
		System.out.println("=".repeat(tamanhoEspaco));
		System.out.println(espaco + titulo.toUpperCase() + espaco);
		System.out.println("=".repeat(tamanhoEspaco) + "\n");
		
		//Pega a idade
		System.out.print("Qual o seu ano de nascimento?: ");
		anoNascimento = teclado.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.print("Sua idade é de " + idade + " anos. Você é ");
		
		if (idade < 18) {
			System.out.println("menor de idade.");
		} else {
			System.out.println("maior de idade.");
		}
				
		System.out.println("\n" + "=".repeat(tamanhoEspaco));

				
		//Fecha o teclado
		teclado.close();
	}

}
