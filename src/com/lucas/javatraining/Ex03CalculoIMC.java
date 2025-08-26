/* Exercício
 * Calculadora de IMC
 * Calcular o Índice de Massa Corporal (IMC) a partir da altura e peso informados,
 * classificando o resultado separadamente para homens e mulheres.
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03CalculoIMC {
	public static void main(String[] args) {
		
		//Abre a entrada (digitação do usuário) nome teclado
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis:
		//Introdução
		String titulo = "Calculadora de IMC";
		//Variáveis usadas:
		float altura, peso, imc;
		
		//Intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55-titulo.length())/2) + titulo.toUpperCase() + " ".repeat((55-titulo.length())/2));
		System.out.println("=".repeat(55) + "\n");
		
		//Armazena altura na variável
		System.out.print("Qual a sua altura?: ");
		altura = teclado.nextFloat();
		
		//Armazena peso na variável
		System.out.print("Qual o seu peso?: ");
		peso = teclado.nextFloat();
		
		//Calculo IMC
		imc = peso / (altura * 2);
		
		//Devolve a saida com base no resultado do calculo IMC
		//IMC calculado para Homens
		System.out.print("\nIMC Homem: ");
		if(imc <= 20) {
			System.out.println("Abaixo do Normal");
		} else if (imc <= 24.9) {
			System.out.println("Normal");
		} else if (imc <= 29.9) {
			System.out.println("Obesidade Leve");
		} else if (imc <= 39.9) {
			System.out.println("Obesidade Moderada");
		} else {
			System.out.println("Obesidade Mórbida");
		}
		
		//IMC calculado para Mulheres
		System.out.print("IMC Mulher: ");
		if(imc <= 19) {
			System.out.println("Abaixo do Normal");
		} else if (imc <= 23.9) {
			System.out.println("Normal");
		} else if (imc <= 28.9) {
			System.out.println("Obesidade Leve");
		} else if (imc <= 38.9) {
			System.out.println("Obesidade Moderada");
		} else {
			System.out.println("Obesidade Mórbida");
		}
		
		System.out.println("\n" + "=".repeat(55) + "\n");
		
		//Fncerramento do teclado
		teclado.close();
	}
}
