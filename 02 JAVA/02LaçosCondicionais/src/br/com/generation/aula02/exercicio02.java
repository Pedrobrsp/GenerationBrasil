package br.com.generation.aula02;
import java.util.Scanner;
public class exercicio02 {

		public static void main(String[] args) {		
			
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
		Scanner leia = new Scanner(System.in);
		
		int  a , b , c ;
		
		System.out.println( "Digite o primeiro numero: " );
		a = leia.nextInt ();
		System.out.println( "Digite o segundo numero: " );
		b = leia.nextInt ();
		System.out.println( "Digite o terceiro numero: " );
		c = leia.nextInt ();	
		
		if ( a < b ) {
		if ( b < c) {
				
		System.out.println(a+"-"+b+"-"+c);
		}}}}