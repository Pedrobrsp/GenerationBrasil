package br.com.generation.aula01;
import java.util.Scanner;
public class exercicio01 {

		public static void main(String[] args) {
		
	/*1. Faça um sistema que leia a idade de uma pessoa 
	expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/
		
		int anos, meses, dias;
		int idadeEmDias;
		Scanner leia = new Scanner (System.in);//Ctrl+shift+o	
		
		System.out.println("Digite sua idade em Anos:");
		anos = leia.nextInt();
		System.out.println("Digite os meses:");		
		meses = leia.nextInt();
		System.out.println("Digite os dias");
		dias = leia.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias é: "+idadeEmDias);	

		}}