package br.com.generation.orientaçao.objeto;

public class Exercicio01 {

	public static void main(String[] args) {
		
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
			 
		double nome;
		double dataDeNacimento;
		double CPF;
		double cadastro;
		double extrato;
		double compras;
			
		void registro () {
					
		cadastro = "\nNome completo: " + nome + "\nCPF: " + CPF + "\nData de nascimento: " + dataDeNacimento;   
		System.out.println("O seu cadastro completo é: " + "\n"+cadastro);
		}
		void compras() {
		extrato = compras + extrato;
		System.out.println("\nSeu extrato é: R$" + extrato);

		}}}
