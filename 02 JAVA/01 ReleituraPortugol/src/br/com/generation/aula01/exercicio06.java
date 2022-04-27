package br.com.generation.aula01;
import java.util.Scanner;
public class exercicio06 {

				public static void main(String[] args) {
	
	/*Construa um programa em c que, tendo como dados de entrada dois pontos 
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
	A fórmula que efetua tal cálculo é:  */

				Scanner leia = new Scanner(System.in);
				 
				double  x1 , y1 , x2 , y2 ;
				
				System.out.println( "Digite o valor do ponto x1:\n" );
				x1 = leia.nextDouble();
				
				System.out.println( "Digite o valor do ponto y1:\n" );
				y1 = leia.nextDouble();
				
				System.out.println( "Digite o valor do ponto x2:\n" );
				x2 = leia.nextDouble();
				
				System.out.println( "Digite o valor do ponto y2:\n" );
				y2 = leia.nextDouble();
				//calculando a potencia do x1
				 double potx1  = 1 ;
				potx1 = potx1 * x1 ;
				//calculando a potencia do y1
				double poty1 = 1 ;
				poty1 = poty1 * y1 ;
				//calculando a potencia do x2
				double  potx2  = 1 ;
				potx2 = potx2 * x2 ;
				//calculando a potencia do y2
				double  poty2 = 1 ;
				poty2 = poty2 * y2 ;

				
	}

}
