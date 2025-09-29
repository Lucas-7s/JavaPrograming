package com.lucas.javatraining;
import java.util.Scanner;

public class Ex00Nome {
	
	public static void main(String[] args) {
		
        // Criando um scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome digitado

        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo Java!");

        scanner.close(); // Fecha o scanner (boa prática)
    }
}

