package br.com.generation.aula01;
import java.util.Scanner;
public class exercicio03 {

		public static void main(String[] args) {
	
	/*3. Fa�a um sistema que leia o tempo de dura��o de um evento 
	em uma f�bricaexpressa em segundos e mostre-o expresso em
	horas, minutos e segundos.*/
		
		Scanner leia = new Scanner(System.in);
		
		int segundos;
		double hora,min,seg;
		
		System.out.println("Digite a dura��o em segundos");
		segundos = leia.nextInt();
		
		hora = segundos / 60 / 60;
		min = segundos / 60;
		seg = min / 60;
		System.out.println( hora + " = Horas");
		System.out.println(min + " = Minutos");
		System.out.println( seg + " = Segundos");		
		}}
