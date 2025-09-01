package com.lucas.javatraining;

import java.util.Scanner;

public class Ex02DobroETriplo {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int dobro;
		int triplo;
		String titulo = "Programa que Dobra e Triplique o Valor Passado";
		
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");
		
		System.out.print("Digite um número: ");
		num = teclado.nextInt();
		
		dobro = num * 2;
		triplo = num * 3;
		
		System.out.println("Dobro: " + dobro);
		System.out.println("Triplo: " + triplo);
		
		System.out.println("\n" + "=".repeat(55));
		teclado.close();
	}

}
