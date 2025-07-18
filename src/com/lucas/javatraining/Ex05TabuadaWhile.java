/* O QUE O PROGRAMA FAZ:
 * Programa para treinar while
 * tabuada com while
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex05TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Tabuada com while";
		int tabuada;
		int c = 1;
		
	    //intro
	    System.out.println("-".repeat(55));
	    System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
	    System.out.println("-".repeat(55) + "\n");
	    
	    System.out.print("Tabuada do número: ");
	    tabuada = teclado.nextInt();
	    System.out.println("");
	    
	    while(c <= 10) {
	    	
	    	int resultado;
	    	resultado = tabuada * c;
	    	
	    	System.out.println(tabuada + " x " + c + " = " + resultado);
	    	c++;
	    	
	    }
	    
	    System.out.println("\n" + "-".repeat(55));
	    teclado.close();

	}

}
