package br.com.generation.aula02;
import java.util.Scanner;
public class exercicio01 {

		public static void main(String[] args) {

//1- Faça um programa que recebe três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		int  x , maior , cont ;
		maior = 0 ;
		cont = 0 ;
		
		while ( cont <= 2 ) {
		System.out.println( "Digite o valor de x: " );
		x = leia.nextInt();
		cont = cont + 1 ;
		if ( x > maior ) {
			maior = x ;
			}
		}
		System.out.println( "Esse é o maior número: " + maior );

		}}



