package br.com.generation.aula01;
import java.util.Scanner;
public class exercicio05 {

			public static void main(String[] args) {
					
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média 
 final deste aluno. Considerar que a média é ponderada e que o peso 
 das notas é: 2,3 e 5, respectivamente. */
			
			Scanner input = new Scanner(System.in);
			double notaa,notab,notac;
				
				
			System.out.println("Digite o nome do aluno: \n");
			String nomeAluno = input.nextLine();
				
			System.out.println("Digite a primeira nota: \n");
			notaa = input.nextDouble();
				
			System.out.println("Digite a segunda nota: \n");
			notab = input.nextDouble();
				
			System.out.println("Digite a terceira nota: \n");
			notac = input.nextDouble();
				
				
			double p1;
			p1 = (notaa*0.2);
			
			double p2;
			p2 = (notab * 0.3);
	
			double p3;
			p3 = (notac * 0.5);
			
			double media;
			media = ((p1+p2+p3)/3);
				
			if(media >= 5){
					System.out.println(nomeAluno+", sua média é: "+media+", você está aprovado \n");
			}else if(media >=5 && media < 7){
					System.out.println("voce esta de recuperacao");
				
			}else {
					System.out.println(nomeAluno+",sua média é: "+media+", você está reprovado\n");
			}}}
