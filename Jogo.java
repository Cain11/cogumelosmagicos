package com.thiago;

/********************************
/*  Jogo.java
/*
/*  Início da Classe Jogo para  
/* a implementação do Jogo 2048.
/*
/*******************************/

import java.util.*;

public class Jogo{

	
	public static char leJogada(){
    
    	char jogada;
    	Scanner entrada = new Scanner(System.in);

    	do{
        	System.out.printf("Qual a sua jogada?\n");
        	System.out.printf("a - esquerda\n");
        	System.out.printf("d - direita\n");
        	System.out.printf("s - baixo\n");
        	System.out.printf("w - cima\n");
        	jogada = entrada.next().charAt(0);
    	}while (jogada != 'a' && jogada != 'd' && jogada != 's' && jogada != 'w');
    	
    	Jogada(jogada);
    	return jogada;
	}
	
	public static char Jogada(char jogada) {
		if(jogada == 'a') {
			System.out.println("Fodase mermão");
		}
		
		return jogada;
	}

	public static void main(String args[]){
		Tabuleiro t = new Tabuleiro();
		t.geraNumero();
		t.imprimeTabuleiro(t);
		leJogada();
	}

}

