package br.edu.principal;
//Questão 36 - idade média de um grupo de indivíduos
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade, qtd, n;
		double media;
		double soma = 0;
		n = 1;
	    qtd = 0;
	    
	    
	    System.out.println("-> Para acabar o programa digite 0 <-");
	    System.out.println(" ");
	    System.out.print("Digite a idade do 1° idivíduo: ");
	    idade = sc.nextInt();
	    
	    while (idade > 0) {
	        n++;
	        soma = soma + idade;
	        qtd = qtd + 1;
	        System.out.print("Digite a idade do "+n+"° idivíduo: ");
	        idade = sc.nextInt();
	    }
		
		System.out.println(" ");
		media = soma/qtd;
		System.out.println("A média de idade desse grupo de pessoas é: "+media+" anos.");
			
	}


}
