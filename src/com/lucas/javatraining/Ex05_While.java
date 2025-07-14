/* O QUE O PROGRAMA FAZ:
 * Programa para treinar while
 * Conta números até 20
 */

package com.lucas.javatraining;

public class Ex05_While {

	public static void main(String[] args) {

		//declaração de variáveis
		int cc;
		String titulo = "Programa que Conta Numero de 1 a 50";
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(70) + "\n");
		
		cc = 0;
		
		while (cc <= 50) {
			cc ++;
			
			if(cc == 2 || cc == 4) {
				continue;
			}
			
			if(cc == 21) {
				break;
			}
			System.out.print(cc + ", ");
		}
		
		System.out.println("\n" + "\n" + "=".repeat(70));

	}

}
