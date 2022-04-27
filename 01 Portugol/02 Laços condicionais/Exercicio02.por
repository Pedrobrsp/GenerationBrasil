programa {

	funcao inicio() {

	real numeroHorasTrabalhadas, qtdeHoraExtra, salario, horaExtra = 0.0

	escreva("Digite o número de horas trabalhadas: ")
	leia(numeroHorasTrabalhadas) //60

	se(numeroHorasTrabalhadas > 220){
	qtdeHoraExtra = numeroHorasTrabalhadas - 220
	horaExtra = qtdeHoraExtra * 20.00
	salario = 220.0 * 10.0

	escreva("\nSalario Normal: " + salario)
	escreva("\nValor das horas extras: " + horaExtra)
	escreva("\nSalário Total: " , (salario + horaExtra))
	}
	senao{
	qtdeHoraExtra = 0.0
	salario = numeroHorasTrabalhadas * 10.0

	escreva("\nSalario Normal: " + salario)
	escreva("\nValor das horas extras: " + horaExtra)
	escreva("\nSalário Total: " , (salario + horaExtra))
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