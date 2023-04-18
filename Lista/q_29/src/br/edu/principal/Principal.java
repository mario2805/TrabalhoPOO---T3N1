package br.edu.principal;
//Quest�o 29 - poupan�as de Carlos e Jo�o
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    Double salJoao = 0.0;
	    Double salCarlos = 0.0;
	    int meses = 0;
	    
	    System.out.print("Digite o sal�rio de Carlos: ");
	    salCarlos = sc.nextDouble();
	    salJoao = salCarlos / 3;
	    System.out.println("Ent�o, o sal�rio de Jo�o �: "+salJoao);
	    
	    while (salJoao < salCarlos) {
	        salCarlos = salCarlos + (salCarlos * 2/100);
	        salJoao = salJoao + (salJoao * 5/100);
	        meses++;
	    }
	    
	    System.out.println("Ap�s "+meses+" meses, Jo�o ter� o mesmo valor ou mais do que Carlos na poupan�a.");
	  
	}


}
