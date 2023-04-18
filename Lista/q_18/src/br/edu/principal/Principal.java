package br.edu.principal;
//Quest�o 18 - verificar se um n�mero � primo
import java.util.*;

public class Principal {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int num = 0;
	    int qtd = 0;
	    
	    System.out.print("Digite um n�mero inteiro maior que 1: ");
	    num = sc.nextInt();
	    
	    if (num > 1) {
	        for (int i = 1; i<=num; i++) {
	            if ((num % i) == 0) {
	                qtd++;
	            }
	        }
	        
	        if (qtd > 2) {
	            System.out.println("Esse n�mero N�O � primo");
	        } 
	        
	        else if (qtd == 2) {
	            System.out.println("Esse n�mero � primo");
	        }
	        
	    } 
	    
	    else {
	        System.out.println("Voc� digitou um n�mero inv�lido");
	    }	    
	}
}
