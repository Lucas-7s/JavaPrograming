/* O QUE O PROGRAMA FAZ:
 * Programa para treinar Switch Case
 * Digita a data e ele devolve o mes por escrito
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex04MesPorEscrito {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		//declaração de variáveis
		String titulo = "Programa que tranforma o mes em escrito";
		int mes;
		String mesEscrito;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		//Entrada
		System.out.print("Digite o mês atual: ");
		mes = teclado.nextInt();
		
		switch (mes) {
		case 1:
			mesEscrito = "janeiro";
			break;
		case 2:
			mesEscrito = "fevereiro";
			break;
		case 3:
			mesEscrito = "março";
			break;
		case 4: 
			mesEscrito = "abril";
			break;
		case 5:
			mesEscrito = "maio";
			break;
		case 6:
			mesEscrito = "junho";
			break;
		case 7:
			mesEscrito = "julho";
			break;
		case 8:
			mesEscrito = "agosto";
			break;
		case 9:
			mesEscrito = "setembro";
			break;
		case 10:
			mesEscrito = "outubro";
			break;
		case 11:
			mesEscrito = "novembro";
			break;
		case 12:
			mesEscrito = "dezembro";
			break;
		default:
			mesEscrito = "Incorreto";
			break;
		}
		System.out.println("O mês atual digitado é " + mesEscrito);

		System.out.println("\n" + "=".repeat(55));
		teclado.close();
	}

}
