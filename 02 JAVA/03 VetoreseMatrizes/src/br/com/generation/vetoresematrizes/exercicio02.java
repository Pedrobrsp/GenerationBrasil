package br.com.generation.vetoresematrizes;
import java.util.Scanner;
public class exercicio02 {

		public static void main(String[] args) {
	
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	A seguir determinar e imprima a média aritmética dos lançamentos, 
	contabilize e apresente também quantas foram as ocorrências 
	da maior avaliação.*/
			
		Scanner leia = new Scanner(System.in);
		int [] dado = new  int [ 10 ];
		double midia = 0.0 ;
		int  soma = 0 ;
		int  maior = 0 ;
		int  ocorrência = 0 ;
				
		for ( int  i = 0 ; i < 10 ; i ++) {
		System.out.println( "Digite a " + ( i + 1 ) + " pontuação do dado: " );
		dado [ i ] = leia.nextInt ();
		soma = soma + dado [ i ];
		if ( maior < dado [ i ]) {
		maior = dado [ i ];}
		}
		for ( int  i = 0 ; i < 10 ; i ++) {
		if ( maior == dado [ i ]) {
		ocorrência ++;}
		}
		midia = ( soma / 10.0 );
		System.out.println();
		System.out.println( "Essa é a mídia: " + midia );
		System.out.println( "Esse foi o maior número que caiu nos lançamentos: " + maior + " e a  "+ "quantidade de ocorrências do maior foi: " + ocorrência );
				
		leia.close();
		}}
