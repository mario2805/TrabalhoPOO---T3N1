package br.edu.principal;
//Quest�o 9 - pontua��es dos funcion�rios tempor�rios em 3 meses

import java.util.*;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int numFunc, numMes;    
        int contFunc, contMes;
        double pontos, totalPontos, maiorPontos, mediaPontos;
        maiorPontos = 0;
        
        numFunc = 1;
        
        for (contFunc = 1; contFunc <= 15; contFunc++){
            numMes = 1;
            totalPontos = 0;
                
                System.out.println(" ");
                System.out.println("-> "+(numFunc++)+"� funcion�rio <-");
                for(contMes = 1; contMes <= 3; contMes++){
                    
                    System.out.print("Digite a quantidade de pontos do funcion�rio no "+(numMes++)+"� m�s: ");
                    pontos = sc.nextDouble();
                    totalPontos = totalPontos + pontos;
                    
                    if(pontos > maiorPontos) {
                        maiorPontos = pontos;
                    }
                    
                }
            
                   
            System.out.println(" ");
            System.out.println("O total de pontos deste funcion�rio foi: "+totalPontos); 
            mediaPontos = totalPontos/3;
            System.out.println("A m�dia de pontos deste funcion�rio foi: "+mediaPontos);
        }
        
        System.out.println(" ");
        System.out.println("A maior pontua��o atingida por um funcion�rio em um m�s foi: "+maiorPontos);
        
	}


	}


