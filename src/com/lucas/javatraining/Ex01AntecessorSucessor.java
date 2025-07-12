/* 
 * Faça um programa que leia no teclado um número inteiro e mostre na tela o seu antecessor e seu sucessor
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex01AntecessorSucessor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Programa que Pede um valor e mostra o anterior e sucessor";
		int num, numAntecessor, numSucessor;
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70));
		
		System.out.print("Digitre um número inteiro: ");
		num = teclado.nextInt();
		
		numAntecessor = num - 1;
		numSucessor = num +1;
		
		//saida
		System.out.println("Digitou: " + num  + "\n" + "Antecessor:" + numAntecessor  + "\n" + "Sucessor: " + numSucessor);
		
		System.out.println("\n" + "=".repeat(70));
		teclado.close();

	}

}
