package com.lucas.javatraining.encapsulationBank;

import java.util.Scanner;

public class BankAccontPrivate {

	public static double abrirConta(String tipoConta) {
		if (tipoConta == "conta corrente") {
			return 50;
		} else if (tipoConta == "conta poupanca") {
			return 150;	
		} else {
			return 0;
		}
		
	}
	
	public static void fecharConta() {
		
	}
	
	public static void depositar() {
		
	}
	
	public static void sacar() {
		
	}
	
	public static void pagarMensalidade() {
		
	}
	
	public final static void clearConsole(){
		
		for (int i = 0; i < 50; i++) System.out.println();
	}
}

