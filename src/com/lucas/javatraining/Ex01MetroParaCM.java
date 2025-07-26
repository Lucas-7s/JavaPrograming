/* Exercicio
 * Crie um programa que leia um valor em metro e mostre eleconvertido em centímetros e milímetros.
 */


package com.lucas.javatraining;

import java.util.Scanner;

public class Ex01MetroParaCM {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração das variáveis
		String titulo = "Programa: Digite em Metro para Converter em CM e MM";
		int metro, cm, mm;
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length()) / 2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		System.out.print("Digite em Metro: ");
		metro = teclado.nextInt();
		
		cm = metro * 100;
		mm = metro * 1000;
		System.out.println("\n" + cm + " cm");
		System.out.println(mm + " mm");
		
		System.out.println("\n" + "=".repeat(70));
		teclado.close();
	}
}
