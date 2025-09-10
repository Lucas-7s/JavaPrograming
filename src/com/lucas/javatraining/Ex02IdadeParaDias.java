/* Exercício
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex02IdadeParaDias {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String titulo = "Prgrama: Idade Em Dias";
		int dia, mes, ano;
		int resultado;
		
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) + "\n");
		
		System.out.print("Digite o dia do seu nascimento: ");
		dia = teclado.nextInt();
		
		System.out.print("Digite o mês do seu nascimento: ");
		mes = teclado.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		ano = teclado.nextInt();
		
		resultado = ano * 365;
		resultado += mes * 30;
		resultado += dia;
		
		System.out.println("\nResultado: " + resultado + " dias de vida");
		
		System.out.println("\n" + "=".repeat(50));

	}

}

