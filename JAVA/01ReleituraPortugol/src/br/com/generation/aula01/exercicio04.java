package br.com.generation.aula01;
import java.util.Scanner;

 		public class exercicio04 {
	 
	 /*Escreva  um sistema que leia tr�s n�meros inteiros e positivos(A, B, C)
	 e calcule a seguinte express�o: D= R+S, onde R=(A+B)� , D= R+S.
										 2		  S=(B+C)� */
	 	public  static  void  main ( String [] args ) {
		
		Scanner leia = new Scanner(System.in);
	
		int  basea , baseb , basec , r , s , d ;
		
		System.out.println( "Insira o primeiro valor: " );
		basea = leia.nextInt ();
		System.out.println( "Insira o segundo valor: " );
		baseb = leia.nextInt ();
		System.out.println( "Insira o terceiro valor: " );
		basec = leia.nextInt ();
		
		//fazendo a potencia do valor a
		basea = basea * basea ;
		//fazendo a pot�ncia do valor b
		baseb = baseb * baseb ;
		//fazendo a potencia do valor c
		basec = basec * basec ;
		//calculando a expressao do r
		r = ( basea + baseb );
		//calculando a expressao dos s
		s = ( baseb + basec );
		//calculando a expressao do d
		d = (( r + s )/ 2 );
		System.out.println( "\n esse � o valor de D: " + d + "\n" );

	 	}}
