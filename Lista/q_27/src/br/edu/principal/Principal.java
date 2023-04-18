package br.edu.principal;
//Questão 27 - calcular área de um triângulo
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
	    
	    Double base = 0.0;
	    Double altura = 0.0; 
	    Double area = 0.0;
	    Scanner sc = new Scanner(System.in);
	    
	    while (base <= 0) {
	        System.out.print("Digite a base do triângulo: ");
	        base = sc.nextDouble();
	    }
	    
	    while (altura <= 0) {
	        System.out.print("Digite a altura do triângulo: ");
	        altura = sc.nextDouble();
	    }
	    
	    System.out.println(" ");
	    area = (base * altura)/2;
	    System.out.println("A área do triângulo é: "+area);
	}


}
