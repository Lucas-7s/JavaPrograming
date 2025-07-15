/* O QUE O PROGRAMA FAZ:
 * Programa para treinar while
 * Conta números pulando números específicos
 */

package com.lucas.javatraining;

public class Ex05NumerosPar {

	public static void main(String[] args) {

		//declaração de variáveis
		int cc;
		String titulo = "Programa que Conta números pulando números específicos";
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70));
		
		cc = 0;
		
		while (cc<= 12) {
			cc ++;
			
			if (cc == 2) {
				continue;
			}
			if (cc == 10) {
				break;
			}
		}
		
		System.out.println("\n" + "=".repeat(70));

	}

}
