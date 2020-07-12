package com.loiane.cursojava.aula71;

public class Calculadora {

	private int soma;

	// synchronized = sincronizar, ou seja, apenas uma thread pode acessar esse metodo por vez
	public synchronized int somaArray(int[] array) {

		soma = 0;

		for (int i = 0; i < array.length; i++) {

			soma += array[i];

			// exibe a thread atual que está sendo acessada
			System.out.println("Executando a soma " + Thread.currentThread().getName() +
					" somando o valor " + array[i] + " com total de " + soma);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		return soma;

	}

}
