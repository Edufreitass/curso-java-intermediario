package com.loiane.cursojava.aula85_100;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 100));

		Random aleatorio = new Random();

		System.out.println(aleatorio.nextInt());

		// colocando limite, (100 + 1) para considerar o 100 também
		System.out.println(aleatorio.nextInt(100 + 1));

	}

}
