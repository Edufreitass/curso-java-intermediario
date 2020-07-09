package com.loiane.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String... args) {

		Contato contato = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		int valor = 10;

		System.out.println("****** Valores originais ****** ");

		System.out.println(contato); // contato 1
		System.out.println(valor); // 10

		System.out.println("****** Exemplo 1 ****** ");

		testePassagemValorReferencia(valor, contato);

		System.out.println(contato); // contato 1
		System.out.println(valor); // 10

		System.out.println("****** Exemplo 2 ****** ");

		testePassagemValorReferencia2(valor, contato);

		System.out.println(contato);
		System.out.println(valor);
	}

	public static void testePassagemValorReferencia(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-0987", "contato2@email.com");
	}

	public static void testePassagemValorReferencia2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato " + novoValor);
	}

}
