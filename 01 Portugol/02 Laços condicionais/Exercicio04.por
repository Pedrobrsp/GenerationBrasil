programa
{

	inteiro num
			
	funcao inicio(){

	escreva("Entre com um número: ")
	leia(num)

	se(num == 0){
		escreva("Número neutro")
	}
	senao se(num%2==0 e num>0){
		escreva("É par... e positivo")
	}
	senao se(num%2==0 e num<0){
		escreva("É par... e negativo")
	}
	senao se(num%2!=0 e num>0){
		escreva("É impar... e positivo")
	}		
	senao{
		escreva("É impar... e negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */