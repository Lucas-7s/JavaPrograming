/*
 * Programa para treinar Switch Case
 * Calculadora simples
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex04CalculadoraSimples {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Calculadora Simples";
		String operador;
		String mensagem = "";
		Float num1, num2, resultado = null;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) /2 ) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		//entrada
		System.out.print("Digite o primeiro número: ");
		num1 = teclado.nextFloat();
		
		teclado.nextLine();
		
		System.out.print("Digite o operador [+][-][x][/]: ");
		operador = teclado.nextLine();
		
		System.out.print("Digite o segundo número: ");
		num2 = teclado.nextFloat();
		
		//operação
		switch (operador) {
		case "x":
			resultado = num1 * num2;
			break;
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "/":
			if (num2 == 0) {
				mensagem = " (Não é possível dividir por 0).";
			} else {
				resultado = num1 / num2;
			}
			break;
		default:
			mensagem = " (Operador Inválido).";
			break;
		}
		
		//saida
		System.out.println("\n" + num1 + " " +  operador + " " + num2 + " = " + resultado + mensagem);
		
		System.out.println("\n" + "=".repeat(55));
		teclado.close();

	}

}
