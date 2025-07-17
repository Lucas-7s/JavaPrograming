/* O QUE O PROGRAMA FAZ:
 * Programa para treinar while
 * Calcula a média entre notas no while
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex05MediaNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Calculadora de média entre notas";
		int qtdNotas = 0;
		float nota;
		float somaNotas = 0;
		float media;
		String sair = "S";
		
	    //intro
	    System.out.println("-".repeat(55));
	    System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
	    System.out.println("-".repeat(55));

	    //looping só é encerrado se digitado algo diferente de s ou S
	    while(sair.equalsIgnoreCase("S")){
	    	qtdNotas++;
	    	System.out.print("\n" + "Digite a " + qtdNotas + "º nota: ");
	    	nota = teclado.nextFloat();
	    	
	    	somaNotas += nota;
	    	
	    	teclado.nextLine();
	    	System.out.print("Deseja inserir mais nota? (S/N): ");
	    	sair = teclado.nextLine();
	    }
	    
	    //resultado
	    media = somaNotas / qtdNotas;
	    System.out.print("\n" + "A média é " + media);
	    
	    if(media >= 7) {
	    	System.out.println(" APROVADO!");
	    } else if (media >= 5) {
	    	System.out.println(" RECUPERAÇÃO!");
	    } else {
	    	System.out.println(" REPROVADO!");
	    }
	    
	    System.out.println("\n" + "-".repeat(55));
	    teclado.close();
	}

}
