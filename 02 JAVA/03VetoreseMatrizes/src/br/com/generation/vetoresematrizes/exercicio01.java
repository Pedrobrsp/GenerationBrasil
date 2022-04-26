package br.com.generation.vetoresematrizes;
import java.util.Scanner;
public class exercicio01 {

	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação
	de uma atividade e o escreva em seguida. Encontre após a maior 
	pontuação e a apresente.  */
	
	public static void main(String[]arg) 	
{		
        Scanner ler = new Scanner(System.in);
        int a, b, c,d,e, maior;
        System.out.println("Digite o numero 1: ");
        a  = ler.nextInt();
        System.out.println("Digite o numero 2: ");
        b  = ler.nextInt();
        System.out.println("Digite o numero 3: ");
        c  = ler.nextInt();
        System.out.println("Digite o numero 4: ");
        d  = ler.nextInt();
        System.out.println("Digite o numero 5: ");
        e  = ler.nextInt();
        
        if(a>b && a>c ) {
            maior = a;
        }
        else if(b>a && b>c) {
            maior = b;
        }
        else {
            maior = c;
        }
        System.out.println("O maior numero é: " + maior);
		}}