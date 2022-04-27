programa
{

	funcao inicio()
	{
	real custoFabrica, custoConsumidor, distribuidor
		
	escreva("Entre com o custo de Fábrica: ")
	leia(custoFabrica)

	distribuidor = custoFabrica + (custoFabrica*0.28)//custo Fabrica + porcentagem distribuidor
	custoConsumidor = distribuidor + (distribuidor*0.45)//custo distribuidor + impostos

	escreva("Custo do consumidor: " + custoConsumidor)
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