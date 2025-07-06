/* O QUE O PROGRAMA FAZ:
 * Programa para treinar condicional simples
 * Calcula a média entre duas notas com if e if, else
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex02_If_Else {

	
	public static void main(String args[]) {

	//Introdução
	String titulo = "Calculadora de Nota";
				
	//Variáveis usadas:
	float altura, peso, imc;
				
	System.out.println("=".repeat(55));
	System.out.println(" ".repeat((55-titulo.length())/2) + titulo.toUpperCase() + " ".repeat((55-titulo.length())/2));
	System.out.println("=".repeat(55) + "\n");
	System.out.println("Estrutura Condicional Simples\n");
			
	//EX Condicional Simples
	Scanner teclado = new Scanner(System.in);
	System.out.print("Digite a Primeira Nota: ");
	Float n1 =  teclado.nextFloat();
	System.out.print("Digite a Segunda Nota: ");
	Float n2 =  teclado.nextFloat();
	Float m = (n1 + n2) / 2;
	System.out.print("\nA sua média foi: " + m);
	if (m > 9){
		System.out.print("Parabéns!!!");
	 }
	  
	System.out.println("\n\n" + "#".repeat(55) + "\n");
	//##############################################################
	 
	//EX Condicional Composta
	System.out.println("Estrutura Condicional Composta\n");
	System.out.print("Digite a Primeira Nota: ");
	Float nota1 =  teclado.nextFloat();
	System.out.print("Digite a Segunda Nota: ");
	Float nota2 =  teclado.nextFloat();
	Float media = (nota1 + nota2) / 2;
	System.out.println("\nA sua média foi: " + media);
	if (media > 7){
		System.out.print("Parabéns!!!");
		} else{
	       System.out.print("Reprovado!!!");
	    }
	        
	System.out.print("\n\n" + "=".repeat(55));
	teclado.close();
	  }
}

