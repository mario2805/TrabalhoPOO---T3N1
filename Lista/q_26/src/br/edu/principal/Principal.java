package br.edu.principal;
//Quest�o 26 - cinco primeiros m�ltiplos de 3


public class Principal {
	public static void main(String[] args) {
		int qtd = 0;
		int num = 1; //botei int por mera est�tica(n�o aparecer o ponto).
		
		System.out.println("Os cinco primeiros m�ltiplos de 3 depois do zero s�o: ");
		while (qtd < 5) {
		    if ((num%3) == 0) {
		        System.out.println(num);
		        qtd++;
		    }
		    
		num++; 
		}
	}


}
