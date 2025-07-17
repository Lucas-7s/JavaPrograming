/* O QUE O PROGRAMA FAZ:
 * Programa para treinar while
 * Vê entre 7 pessoas quem é maior de idade
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex05MaiorIdade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Programa que verifica pessoas que é maior de idade";
		int cc = 1;
		int idade;
		int cMaiorIdade = 0;
		int anoNascimento;
		int anoAtual = 2025;
		int qtdPessoas;

		//intro
	    System.out.println("-".repeat(70));
	    System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
	    System.out.println("-".repeat(70) + "\n");
	    
	    System.out.print("Quantas pessoas vão ser verificadas?: ");
    	qtdPessoas = teclado.nextInt();
	    
	    //looping entrada de dados
	    while(cc <= qtdPessoas) {
	    	
	    	System.out.print("Digite o ano de nascimento do " + cc + "º integrante: ");
	    	anoNascimento = teclado.nextInt();
	    	
	    	idade = anoAtual - anoNascimento;
	    	
	    	if(idade >= 18) {
	    		cMaiorIdade += 1;
	    	}
	    	
	    	cc++;
	    }
	    
	    //saida
	    System.out.print("\n" + "No grupo de " + (cc-1) + " pessoas, " + cMaiorIdade);
	    
	    //if simples
	    if (cMaiorIdade == 1) System.out.println(" é maior de idade.");
	    else System.out.println(" são maior de idade.");
	    
	    System.out.println("\n" + "-".repeat(70));
	    teclado.close();
	}

}
