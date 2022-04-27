programa
{
	
	funcao inicio()
	{
		inteiro meses, dias, anos, idade

		escreva(" Quantos dia:")
		leia(dias)


		anos = (dias/365)
		meses = (dias/30)
		dias = (30*365-dias)
		
		escreva("Sua idade em anos é " ,anos, " anos")
		escreva("\nSua idade em meses é ", meses, " meses")
		escreva("\nSua idade em dias é ", dias, " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 178; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */