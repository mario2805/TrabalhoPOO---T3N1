package br.edu.principal;
//Quest�o 36 - idade m�dia de um grupo de indiv�duos
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
	    System.out.print("Digite a idade do 1� idiv�duo: ");
	    idade = sc.nextInt();
	    
	    while (idade > 0) {
	        n++;
	        soma = soma + idade;
	        qtd = qtd + 1;
	        System.out.print("Digite a idade do "+n+"� idiv�duo: ");
	        idade = sc.nextInt();
	    }
		
		System.out.println(" ");
		media = soma/qtd;
		System.out.println("A m�dia de idade desse grupo de pessoas �: "+media+" anos.");
			
	}


}
