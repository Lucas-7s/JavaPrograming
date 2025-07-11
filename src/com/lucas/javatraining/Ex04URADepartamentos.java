/* O QUE O PROGRAMA FAZ:
 * Programa para treinar Switch Case
 * Sistema URA - escolha de departamentos
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex04URADepartamentos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Programa URA - Lista Departamentos";
		String setor;
		int escolha;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length()) /2 ) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");		
		
		//Apresentação das Informações
		System.out.println("Digite qual departamento deseja falar: ");
	    System.out.println("1 = Comercial;");
	    System.out.println("2 = Financeiro;");
	    System.out.println("3 = Sac;");
	    System.out.println("4 = Entregas;");
	    System.out.println("5 = Outros assuntos;" + "\n");
	    
	    System.out.print("Escolha: ");
	    escolha = teclado.nextInt();
	    
	    switch (escolha) {
	    case 1:
	    	setor = "comercial";
	    	break;
	    case 2:
	    	setor = "financeiro";
	    	break;
	    case 3:
	    	setor = "sac";
	    	break;
	    case 4:
	    	setor = "entregas";
	    	break;
	    default:
	    	setor = "outros";
	    	break;
	    }
	    
	    System.out.println("\n" + "Vamos te transferir para o departamento " + setor);
	    
	    System.out.println("\n" + "=".repeat(55));
		
		teclado.close();

	}

}
