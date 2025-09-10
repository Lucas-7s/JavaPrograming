/* Exercício
 * Informar um saldo e imprimir o saldo com reajuste de 1%
 */

package com.lucas.javatraining;

public class Ex02SaldoReajuste {

	public static void main(String[] args) {

		//Declaração de variáveis
		String titulo = "Reajuste de Saldo";
		double saldo = 1225.50;
		double reajuste = 0.01; // 1% do valor total do saldo
		double porcentagem = reajuste * 100;
		double saldoReajuste;
		
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) + "\n");
		
		saldoReajuste = saldo + (saldo * reajuste);
		
		//Saida
		System.out.printf("Valor do Reajuste:  %.0f%% \n\n", porcentagem);
		
		System.out.printf("Saldo Anterior: R$ %.2f \n", saldo);
		System.out.printf("Saldo com Reajuste: R$ %.2f \n", saldoReajuste);
		
		System.out.println("\n" + "=".repeat(50));

	}

}
