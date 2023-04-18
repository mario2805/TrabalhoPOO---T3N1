package br.edu.principal;
//Questão 29 - poupanças de Carlos e João
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    Double salJoao = 0.0;
	    Double salCarlos = 0.0;
	    int meses = 0;
	    
	    System.out.print("Digite o salário de Carlos: ");
	    salCarlos = sc.nextDouble();
	    salJoao = salCarlos / 3;
	    System.out.println("Então, o salário de João é: "+salJoao);
	    
	    while (salJoao < salCarlos) {
	        salCarlos = salCarlos + (salCarlos * 2/100);
	        salJoao = salJoao + (salJoao * 5/100);
	        meses++;
	    }
	    
	    System.out.println("Após "+meses+" meses, João terá o mesmo valor ou mais do que Carlos na poupança.");
	  
	}


}
