programa
{	

     funcao inicio(){
     
     real ip

     escreva("Leia o índice de poluição: ")
     leia(ip)

        se(ip>=0.05 e ip<=0.25){
        escreva("Índice aceitável...")
	}
        senao se(ip>0.25 e ip<=0.3){
	escreva("Notifique as empresas do primeiro grupo...")
	}
     senao se(ip>0.3 e ip<0.4){
     escreva("Notifique as empresas do primeiro e segundo grupo...")
    }
     senao se(ip>0.4 e ip<=0.5){
     escreva("Todos os grupos de empresas devem ser notificados...")
    }
     senao{
     escreva("Índice sem classificação...")
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */