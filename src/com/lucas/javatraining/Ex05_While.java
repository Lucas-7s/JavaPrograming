/* O QUE O PROGRAMA FAZ:
 * Programa para treinar while
 * Conta números pulando números específicos
 */

package com.lucas.javatraining;

public class Ex05_While {

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
			
			if(cc == 2 || cc == 4) {
				continue;
			}
			
			if(cc == 9) {
				break;
			}
			System.out.println(cc);
		}
		
		System.out.println("\n" + "=".repeat(70));

	}

}
