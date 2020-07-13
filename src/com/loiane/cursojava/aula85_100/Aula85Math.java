package com.loiane.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {

		// Função para potência

		// potencia
		System.out.println(Math.pow(2, 3)); // 2 * 2 * 2 = 8.0

		// ---------------------------------------

		// Funções para arredondamento

		// arredondamento acima de 4.5
		System.out.println(Math.round(4.7)); // arredonda pra 5
		// arredondamento abaixo de 4.5
		System.out.println(Math.round(4.4)); // arredonda pra 4

		// arredonda pra cima sempre
		System.out.println(Math.ceil(4.7)); // arredonda pra 5.0
		// arredonda pra cima sempre
		System.out.println(Math.ceil(4.4)); // arredonda pra 5.0

		// arredonda pra baixo sempre
		System.out.println(Math.floor(4.7)); // arredonda pra 4.0
		// arredonda pra baixo sempre
		System.out.println(Math.floor(4.4)); // arredonda pra 4.0

		// ---------------------------------------

		// Função para gerar número aleátorio

		// gera número aleatorio de 0 a 100
		System.out.println(Math.round(Math.random() * 100));

		// ---------------------------------------

		// Funções trigonométricas

		// seno de 30
		System.out.println(Math.sin(Math.toRadians(30))); // 0,5

		// coseno de 1
		System.out.println(Math.cos(Math.toRadians(1))); // 1

		// tangente de 45
		System.out.println(Math.tan(Math.toRadians(45))); // 1

	}

}
