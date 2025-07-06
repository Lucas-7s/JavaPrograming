/* DESAFIO
 * Gerar um script Java que leia o Nome da Pessoa e mostre na tela, juntamente com uma mensagem de Boas Vindas.
 * Programa para treinar entrada e saida simples
 */

package com.lucas.javatraining;

import java.util.Scanner;

public class Ex01PraticaEntradaSaida {

	public static void main(String[] args) {
		
		//habilita entrada usuario
		Scanner teclado = new Scanner(System.in);		
		
		//entrada
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		//saida
		System.out.printf("\n" + "Olá %s seja Bem Vindo!", nome);
		
		//fecha entrada usuario
		teclado.close();
	}

}
