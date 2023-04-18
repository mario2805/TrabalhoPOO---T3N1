package br.edu.principal;
//Questão 17 - intervalos crescentes ou decrescentes
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, media;
		double soma = 0;
		int qtd = 0;
		int qtdPares = 0;
		
		System.out.print("Digite o 1° número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o 2° número: ");
		num2 = sc.nextDouble();
		
		System.out.println(" ");
		
		if (num1 == num2) {
		    System.out.println("Números iguais.");
		}
		
		if (num1 < num2) {
		    for (double i = num1; i <= num2; i++) {
		        soma = soma + i;
		        qtd = qtd + 1;
		    }
		media = soma/qtd;
		System.out.println("O intervalo é crescente, portanto a média dos números do intervalo é: "+media);
		}
		
		if (num1 > num2) {
		    for (double i = num2; i <= num1; i++) {
		        if ((i%2) == 0) {
		            qtdPares = qtdPares + 1;
		        }
		    }
		System.out.println("O intervalo é decrescente, portanto a quatidade de números pares do intervalo é: "+qtdPares);    
		}
		
	}
	

}
