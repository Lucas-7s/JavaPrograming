/*
 * Programa para treinar Estrutura Condicional Encadeada
 * Programa que Verifica o status do tanque (Se cheio, se meio ou se reserva)
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03IfElseBombaCombustivel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Programa que Verifica o status do tanque E Avisa Se Precisa Reabastecer";
		float tanque;
		
		//intro
		System.out.println("=".repeat(75));
		System.out.println(" ".repeat((75 - titulo.length())/2) + titulo.toUpperCase() + " ".repeat((75 - titulo.length())/2));
		System.out.println("=".repeat(75) + "\n");

		//entrada
		System.out.print("Qual a quantidade de litros no tanque: ");
		tanque = teclado.nextFloat();
		
		//saida
		System.out.print("Resultado: ");
	    
		if(tanque < 10) {
			System.out.println("Está na reserva. Abasteça urgente!");
		} else if (tanque <= 50) {
			System.out.println("Está com meio tanque");
		} else {
			System.out.println("Está com tanque cheio ou quase cheio!");
		}
		
		System.out.println("\n" + "=".repeat(75));
		teclado.close();
	}

}
