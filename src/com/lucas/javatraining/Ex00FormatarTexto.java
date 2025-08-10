/* Exercício
 * Formatar Texto como Título
 * Ler um texto digitado pelo usuário e converter cada palavra para o formato "Título",
 * onde a primeira letra é maiúscula e as demais minúsculas.
 */


package com.lucas.javatraining;

import java.util.Scanner;

public class Ex00FormatarTexto {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//declaração de variáveis
		String titulo = "Programa: Converte Texto Em Formato Titulo";
		String texto;
		
		//intro
		System.out.println("=".repeat(50));
		System.out.println(" ".repeat((50 - titulo.length())/2) + titulo.toUpperCase());
		System.out.println("=".repeat(50) + "\n");
		
		System.out.print("Digite o texto: ");
		texto = teclado.nextLine();
		texto = paraTitulo(texto);
		
		System.out.println("\n" + texto);
		
		System.out.println("\n" + "=".repeat(50));
		teclado.close();
	}
	
	public static String paraTitulo(String texto) {
		String[] palavras = texto.toLowerCase().split(" ");
		StringBuilder resultado = new StringBuilder();
		
		for (String palavra : palavras) {
            if (palavra.length() > 0) {
                resultado.append(Character.toUpperCase(palavra.charAt(0)))
                         .append(palavra.substring(1))
                         .append(" ");
            }
        }
        return resultado.toString().trim();
	}
}
