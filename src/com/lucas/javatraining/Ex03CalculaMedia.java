/* Exercício
 * Cálculo de Média e Frequência
 * Calcular a média de duas notas e o percentual de presença do aluno,
 * determinando se ele está aprovado, em recuperação ou reprovado.
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex03CalculaMedia {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declaração de variáveis
		String titulo = "Programa de Calculo de Média:";
		Double nota1, nota2, mediaNota, presenca, numeroAulas, faltas, presencaMin;
		
		//intro
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase() );
		System.out.println("=".repeat(55) + "\n");
		
		//entrada
		System.out.print("Qual a Nota 1: ");
		nota1 = teclado.nextDouble();
		
		System.out.print("Qual a Nota 2: ");
		nota2 = teclado.nextDouble();
		
		System.out.print("\n" + "Qual a quantidade de aulas mistradas: ");
		numeroAulas = teclado.nextDouble();
		
		System.out.print("Qual a quantidade de faltas: ");
		faltas = teclado.nextDouble();
		
		//calculo
		mediaNota = (nota1 + nota2) / 2;
		presencaMin = numeroAulas / 2; //minimo 50% de presença
		presenca =   ((numeroAulas - faltas) / numeroAulas) * 100;
		
		//saida
		if(mediaNota >= 7 && faltas <= presencaMin ) {
			System.out.println("\n" + "Aprovado! Média: " + mediaNota + " Presença: " + presenca + "%");
		} else if (mediaNota >= 5 && faltas <= presencaMin || mediaNota >= 5 && faltas > presencaMin) {
			System.out.println("\n" + "Recuperação! Média: " + mediaNota + " Presença: " + presenca + "%");
		} else {
			System.out.println("\n" + "Reprovado! Média: " + mediaNota + " Presença: " + presenca + "%");
		}
		
		System.out.println("\n" + "=".repeat(55));
		teclado.close();
	}
}
