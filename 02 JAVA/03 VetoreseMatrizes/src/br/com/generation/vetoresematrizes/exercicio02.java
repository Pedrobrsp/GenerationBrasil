package br.com.generation.vetoresematrizes;
import java.util.Scanner;
public class exercicio02 {

		public static void main(String[] args) {
	
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
	Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
	A seguir determinar e imprima a m�dia aritm�tica dos lan�amentos, 
	contabilize e apresente tamb�m quantas foram as ocorr�ncias 
	da maior avalia��o.*/
			
		Scanner leia = new Scanner(System.in);
		int [] dado = new  int [ 10 ];
		double midia = 0.0 ;
		int  soma = 0 ;
		int  maior = 0 ;
		int  ocorr�ncia = 0 ;
				
		for ( int  i = 0 ; i < 10 ; i ++) {
		System.out.println( "Digite a " + ( i + 1 ) + " pontua��o do dado: " );
		dado [ i ] = leia.nextInt ();
		soma = soma + dado [ i ];
		if ( maior < dado [ i ]) {
		maior = dado [ i ];}
		}
		for ( int  i = 0 ; i < 10 ; i ++) {
		if ( maior == dado [ i ]) {
		ocorr�ncia ++;}
		}
		midia = ( soma / 10.0 );
		System.out.println();
		System.out.println( "Essa � a m�dia: " + midia );
		System.out.println( "Esse foi o maior n�mero que caiu nos lan�amentos: " + maior + " e a  "+ "quantidade de ocorr�ncias do maior foi: " + ocorr�ncia );
				
		leia.close();
		}}
