package br.com.fiap.calculator;

import java.util.*;

public class CalculoIMC {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Vamos calcular teu IMC?");
		System.out.println("-----------------------");
		System.out.println("Insere teu peso em Kg: ");
		double peso = sc.nextDouble();
		System.out.println("Agora insere tua altura em m: ");
		double altura = sc.nextDouble();
			
		double imc = peso / (altura * altura);
					
		if ((imc >= 18.5) && (imc <= 25)) {
		System.out.println("Parabéns! Está dentro do teu peso ideal! Teu IMC é "+imc);
		} else {
			System.out.println("Atenção! Não está dentro do teu peso ideal! Teu IMC é "+imc);
		}		
		sc.close();
		}	
}