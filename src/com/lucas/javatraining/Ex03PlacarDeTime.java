/* O QUE O PROGRAMA FAZ:
 * Programa para treinar Estrutura Condicional Encadeada (if, else if, else)
 * Programa que Verifica Placar de Gols e Determina a vitória
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03PlacarDeTime {

	public static void main(String[] args) {

		//habilita entrada
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Programa que Verifica Placar de Times em Disputa";
		String nomeTime1, nomeTime2;
		int golsT1, golsT2;
		
		//intro
		System.out.println("=".repeat(70));
		System.out.println(" ".repeat((70 - titulo.length())/2) + titulo.toUpperCase() + " ".repeat((70 - titulo.length())/2));
		System.out.println("=".repeat(70) + "\n");
		
		//entrada nomes times
		System.out.print("Qual o nome do 1º time?: ");
		nomeTime1 = teclado.nextLine();
		
		System.out.print("Qual o nome do 2º time?: ");
		nomeTime2 = teclado.nextLine();
		
		//entrada gols times
		System.out.print("\n" + "Qual a quantia de gols do Time " + nomeTime1 + "?: ");
		golsT1 = teclado.nextInt();
		
		System.out.print("Qual a quantia de gols do Time " + nomeTime2 + "?: ");
		golsT2 = teclado.nextInt();
		
		//saida resultado
		if(golsT1 > golsT2) {
			System.out.printf("\n" + "Resultado: %s Venceu!" + "\n\n" + "Placar: %s %d x %d %s", nomeTime1, nomeTime1, golsT1, golsT2, nomeTime2);
		} else if (golsT1 == golsT2) {
			System.out.printf("\n" + "Resultado: Empate" + "\n\n" + "Placar: %s %d x %d %s", nomeTime1, golsT1, golsT2, nomeTime2);
		} else {
			System.out.printf("\n" + "Resultado: %s Venceu!" + "\n\n" + "Placar: %s %d x %d %s", nomeTime2, nomeTime1, golsT1, golsT2, nomeTime2);
		}
		
		System.out.println("\n\n" + "=".repeat(70));
		teclado.close();
	}

}
