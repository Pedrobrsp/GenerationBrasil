package br.com.generation.aula02;
import java.util.Scanner;
public class exercicio03 {

		public static void main(String[] args) {

	/*  Faça um programa que receba a idade de uma pessoa e 
		mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto 	*/
				
		Scanner ler = new Scanner(System.in);
			
		int idade;
			
		String infantil, juvenil, adulto;
			
		System.out.println("Digite sua idade");
		idade = ler.nextInt();

		if ( idade >= 10 && idade <= 14 ){
		System.out.println( "Você está na categoria infantil" );} 
		if ( idade >= 15 && idade <= 17 ){
		System.out.println( "Você está na categoria Juvenil." );}
		if ( idade >= 18 && idade <= 25 ) {
		System.out.println( "Você está na categoria adulto" );}
		else {
		System.out.println( "Idade fora da categoria." );
			
		ler.close();			
		}}}
