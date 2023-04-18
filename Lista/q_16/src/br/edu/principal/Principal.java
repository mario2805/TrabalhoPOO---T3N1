package br.edu.principal;
//Questão 16 - soma de pares e multiplicação de ímpares de um intervalo
import java.util.*;

public class Principal {
	
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, mult;
		soma = 0;
		mult = 1;
		
		System.out.print("Digite o 1° número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o 2° número: ");
		num2 = sc.nextDouble();
		
		if (num1 == num2) {
		    if((num1%2) == 0) {
		        soma = soma + num1;
		    }
		    else {
		        mult = mult * num1;
		    }
		}
		
		if (num1 < num2) {
		    for (double i = num1; i <= num2; i++) {
		        if ((i%2) == 0) {
		            soma = soma + i;
		        }  
		        else {  
		            mult = mult * i; 
		        }
		    }  
		}   
		        
		if (num1 > num2) {
		    for (double i = num2; i <= num1; i++) {
		       if ((i%2) == 0) {
		            soma = soma + i;
		        }  
		        else {  
		            mult = mult * i; 
		        } 
		    }
		}        
        
        System.out.println(" ");
        System.out.println("A soma dos números pares desse intervalo, incluindo os números digitados é: "+soma);
        System.out.println("A multiplicaão dos números ímpares desse intervalo, incluindo os números digitados é: "+mult);
	}	
}
