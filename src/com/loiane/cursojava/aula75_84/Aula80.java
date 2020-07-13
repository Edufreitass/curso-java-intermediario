package com.loiane.cursojava.aula75_84;

public class Aula80 {

	public static void main(String[] args) {

		// substring

		String teste = "Isso é um teste.";

		System.out.println(teste); // Isso é um teste.
		System.out.println(teste.substring(10)); // teste.
		System.out.println(teste.substring(10, 15)); // teste

		// ---------------------------------------

		// concat

		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); // ola + mundo
		System.out.println(olaMundo); // olá mundo

		// ---------------------------------------

		// replace

		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos); // e s p a ç o

		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos); // espaço

		// ---------------------------------------

		// trim

		String nome = " meu nome é: ";
		System.out.println(nome);
		// esse método remove todos os espaços sobrando antes e depois da String
		System.out.println(nome.trim()); // meu nome é:

	}

}
