package br.com.generation.aula01;
import java.util.Scanner;
public class exercicio02 {

		public static void main(String[] args) {

		/*2. Faça um sistema que leia a idade de uma pessoa expressa
		em dias e mostre-a expressa em anos, meses e dias.*/
	
		int dias;
		int anosDias,mes;
		int Dia;
			
		Scanner leia = new Scanner(System.in);//Crt+shft+o
			
		System.out.println("Informe sua idade em Dias");
		dias = leia.nextInt();
			
		anosDias = dias / 365;
		mes =  anosDias / 30;
			
			
		System.out.println("Sua idade em anos é: " + anosDias);
		System.out.println( mes  + " :Mes");
			
		}}
