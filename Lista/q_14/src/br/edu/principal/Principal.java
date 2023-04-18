package br.edu.principal;

//Questão 14 - soma dos 50 primeiros pares

public class Principal {
    public static void main(String[] args) {
		
		int soma = 0; 
		int qtd = 0;
		int num = 2;
		
		do {
		    
		   soma = soma + num;
		   num = num + 2;
		   qtd++;
		    
		} while (qtd < 50);
		
		System.out.println("A soma dos 50 primeiros números pares é: "+soma);
	}
}

//Fórmula: Sn = (n / 2) × [2a + (n-1) × d] - n = número, a = número inicial, d = diferença.


