package br.com.generation.aula02;
import java.util.Scanner;
public class exercicio04 {

	/* Fa�a um programa em que permita a entrada de um n�mero 
	 qualquer e exiba se este n�mero � par ou �mpar. 
	 Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 se for �mpar exiba o n�mero elevado ao quadrado. */
	
	public  static  void  main ( String [] args ) {
			
	double valor;	
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println( "Digite um numero: " );
	valor = leia.nextDouble();
	
	if ( valor % 2 == 0 ) {
	System.out.println( "Este n�mero � par" );
		
	valor = Math.sqrt (valor);
		
	System.out.println( "A raiz quadrada desse n�mero �" + valor );
		
	} else {
	System.out.println( "Este n�mero � �nico" );
		
	valor = Math.sqrt(valor);
		
	System.out.println( "Este n�mero elevado ao quadrado � " + valor );
		
	} if ( valor == 0 ) {
		
	}
		System.out.println( "Valor neutro!" );
	}}