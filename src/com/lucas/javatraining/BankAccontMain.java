package com.lucas.javatraining;

import java.util.Scanner;

public class BankAccontMain {

	public static void main(String[] args) {
		int spacingSize = 55;
		String pularLinha =  "\n" + "=".repeat(spacingSize) + "\n";
		
		Interface.Intro(spacingSize);
		Interface.Menu1();
		System.out.println(pularLinha);
		Interface.Menu2(0);
    }
	
	//=================================================================
	
	public class Interface {

		public static void Intro(int spacingSize) {
			//declaração de variáveis
	        String title, spacing, intro;
	        
	        //Interface no Console - Boas Vindas
	        title = "Bem vindo ao Banco Java";
	        spacing = " ".repeat((spacingSize - title.length())/2);
	        System.out.print("=".repeat(spacingSize) + "\n"
	                        + spacing + title.toUpperCase() + spacing + "\n"
	                        + "=".repeat(spacingSize) + "\n");
		}
		
		//=================================================================
		
	    public static double Menu1() {
	    	//declaração de variáveis
	    	String escolha;
	    	double saldoMenu1 = 0;
	        
	        Scanner teclado = new Scanner(System.in);


	        //Login ou criar conta
	        System.out.print("[1] Acessar\n"
	                                        + "[2] Criar uma Conta Corrente (Premio: R$ 50,00)\n"
	                                        + "[3] Criar uma Conta Poupança (Premio: R$ 150,00)\n"
	                                        + "Qual a sua escolha?: ");

	        do {
	            escolha = teclado.nextLine();
	            if(!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3")) {
	                System.out.print("Valor incorreto, esperado um número de 1 à 3: ");
	            }
	        } while(!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3"));

	        switch (escolha) {
	        case "1":
	            System.out.println("OK");
	        case "2":
	        	saldoMenu1 = BankAccontPrivate.abrirConta("conta corrente");
			case "3":
				saldoMenu1 = BankAccontPrivate.abrirConta("conta poupanca");
	        }

	        teclado.close();
	        return saldoMenu1;
	    }
	    
	    //=================================================================
	    
	    public static void Menu2(double saldoMenu2) {
            System.out.printf("Obrigado por abrir uma Conta Poupança conosco \nSaldo atual: R$ %.2f", saldoMenu2);
	    }
	}

}
