package com.loiane.cursojava.aula71;

public class MinhaThreadSoma implements Runnable {

	private String nome;
	private int[] nums;
	// instância estática
	private static Calculadora calc = new Calculadora();

	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
		// Thread t = new Thread(this, nome);
		// t.start();
	}

	@Override
	public void run() {

		System.out.println(this.nome + " iniciada");

		int soma = calc.somaArray(nums);

		System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);

		System.out.println(this.nome + " terminada");

	}

}
