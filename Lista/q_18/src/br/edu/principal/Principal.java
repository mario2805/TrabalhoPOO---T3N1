package br.edu.principal;
//Questão 18 - verificar se um número é primo
import java.util.*;

public class Principal {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int num = 0;
	    int qtd = 0;
	    
	    System.out.print("Digite um número inteiro maior que 1: ");
	    num = sc.nextInt();
	    
	    if (num > 1) {
	        for (int i = 1; i<=num; i++) {
	            if ((num % i) == 0) {
	                qtd++;
	            }
	        }
	        
	        if (qtd > 2) {
	            System.out.println("Esse número NÃO É primo");
	        } 
	        
	        else if (qtd == 2) {
	            System.out.println("Esse número É primo");
	        }
	        
	    } 
	    
	    else {
	        System.out.println("Você digitou um número inválido");
	    }	    
	}
}
