package br.edu.principal;
//Questão 9 - pontuações dos funcionários temporários em 3 meses

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
                System.out.println("-> "+(numFunc++)+"° funcionário <-");
                for(contMes = 1; contMes <= 3; contMes++){
                    
                    System.out.print("Digite a quantidade de pontos do funcionário no "+(numMes++)+"° mês: ");
                    pontos = sc.nextDouble();
                    totalPontos = totalPontos + pontos;
                    
                    if(pontos > maiorPontos) {
                        maiorPontos = pontos;
                    }
                    
                }
            
                   
            System.out.println(" ");
            System.out.println("O total de pontos deste funcionário foi: "+totalPontos); 
            mediaPontos = totalPontos/3;
            System.out.println("A média de pontos deste funcionário foi: "+mediaPontos);
        }
        
        System.out.println(" ");
        System.out.println("A maior pontuação atingida por um funcionário em um mês foi: "+maiorPontos);
        
	}


	}


