package br.com.generation.orienta�ao.objeto;

public class Exercicio01 {

	public static void main(String[] args) {
		
	/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/
			 
		double nome;
		double dataDeNacimento;
		double CPF;
		double cadastro;
		double extrato;
		double compras;
			
		void registro () {
					
		cadastro = "\nNome completo: " + nome + "\nCPF: " + CPF + "\nData de nascimento: " + dataDeNacimento;   
		System.out.println("O seu cadastro completo �: " + "\n"+cadastro);
		}
		void compras() {
		extrato = compras + extrato;
		System.out.println("\nSeu extrato �: R$" + extrato);

		}}}
