package com.lucas.javatraining.encapsulationBank;

import java.util.Scanner;

public class Lesson02IfElse {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis:
		//Introdução
		String titulo = "Calculadora de IMC";
		
		//Variáveis usadas:
		float altura, peso, imc;
		
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55-titulo.length())/2) + titulo + " ".repeat((55-titulo.length())/2));
		System.out.println("=".repeat(55) + "\n");
		
		System.out.print("Qual a sua altura?: ");
		altura = teclado.nextFloat();
		
		System.out.print("Qual o seu peso?: ");
		peso = teclado.nextFloat();
		
		imc = peso / (altura * 2);
		
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
		
		teclado.close();
	}
}
