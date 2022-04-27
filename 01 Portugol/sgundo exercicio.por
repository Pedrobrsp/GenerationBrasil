programa
{
//João, homem de bem, comprou um microcomputador para controlar o rendimento diário
//de seu trabalho. 



//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
//regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
//excedente. 

//João precisa que você faça um sistema que leia a variável P (peso de tomates) e
//verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
//da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
//ZERO.
			
			inclua biblioteca Matematica -->mat
			funcao inicio()
	{
//essas sao as variaveis		
		//letra E na Variavel de excesso 
		//letra P Peso de tomates
			cadeia p, pagar multa
			real quilos, 
		


//variavel = p (peso dos tomates)
//erifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
//da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
//ZERO.

		escreva("Informe a quantidade de quilos: ")
		leia(quilos)

		

		se (quilos>= 50*4 )  {
			escreva("Voce tem uma multa de R$4 reais por quilo: " )
		}
		
		
		senao ("A pasegem esta dentro do padrão" mat.arredondar (media,0))
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */