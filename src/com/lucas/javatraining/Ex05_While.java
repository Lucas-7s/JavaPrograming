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
			
			//condição, pula a contagem do 2 e 4
			if(cc == 2 || cc == 4) {
				continue;
			}
			
			//encerra antes da hora, no 20
			if(cc == 20) {
				System.out.print(cc + ".");
				break;
			}
			
			//saida
			System.out.print(cc);
			//if simplificado
			if(cc >= 1)	System.out.print(", ");
		}
		
		System.out.println("\n" + "\n" + "=".repeat(70));

	}

}
