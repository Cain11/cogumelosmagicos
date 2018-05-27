package com.thiago;

/**************************************
/*  Tabuleiro.java
/*
/*  Início da Classe Tabuleiro para 
/* a implementação do Jogo 2048.
/*
/*************************************/
import java.util.*;

public class Tabuleiro{

	int matriz[][]; 
	int pontuacao;
	
	Tabuleiro(){
		matriz = new int[4][4];
		pontuacao = 0;
	}

	public void geraNumero(){
    	
		for(int x = 0;x<2;x++) {
			int pos, i, j;
	    	Random ran = new Random();
	    
	    	do{
	        	pos = ran.nextInt(16);;
	        	i = pos / 4;
	        	j = pos % 4;
	    	}while (matriz[i][j] != 0);
	    
	    	matriz[i][j] = 2;
		}
    	
	}


	public void imprimeTabuleiro(Tabuleiro t){
    
    	System.out.printf("Pontuação %d\n", pontuacao);
    	for (int i = 0; i < 4; i++) {
        	System.out.printf("|");
        	for (int j = 0; j < 4; j++) {
            	System.out.printf("%d\t|", matriz[i][j]);
        	}
        	System.out.printf("\n");
    	}
	}
	
	//CONTINUAR


}
