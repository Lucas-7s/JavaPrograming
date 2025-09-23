/* Exercício
* Acabamos de sofrer o dissidio anual na empresa e esse ano o mesmo será de 15%.
* Faça um algoritmo em java que leia o nome do colaborador e seu salário atual, aplique 15% de reajuste de dissídio e
* mostre na tela o seu novo salário e valor de acrescimo.
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex04DissidioAnual {
	public static void main(String[] args) {
		
		//biblioteca de entrada de dados Scanner
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		int dissidio = 15;
		String titulo = "Calculo de Dissidio Anual (ano atual " + dissidio + "%)";
		String nome;
		double salarioAtual, salarioNovo, valorAcrecimo;
		
		//introdução
		System.out.println("=".repeat(55));
		System.out.println(" ".repeat((55 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(55) + "\n");

		//entrada de dados
		System.out.print("Qual o nome do colaborador?\ncolaborador: ");
		nome = teclado.nextLine();
		System.out.print("Qual o salário mensal? \nSalário: R$ ");
		salarioAtual = teclado.nextDouble();
		
		//calculo
		valorAcrecimo = salarioAtual * 0.15;
		salarioNovo = salarioAtual + valorAcrecimo;
		
		//saida
		System.out.printf("Valor de Acréscimo: R$ %.2f\n", valorAcrecimo);
		System.out.printf("Salário Novo: R$ %.2f\n", salarioNovo);
		
		//rodapé
		System.out.println("\n" + "=".repeat(55));
		
		//fecha biblioteca de entrada de dados
		teclado.close();
	}

}
