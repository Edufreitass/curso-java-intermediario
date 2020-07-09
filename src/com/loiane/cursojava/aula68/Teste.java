package com.loiane.cursojava.aula68;

public class Teste {

	/*
	 * Isso aqui
	Thread t1 = new Thread(thread1);
	t1.start();
	   É a mesma coisa que isso aqui, porem passado dentro do construtor
	Thread t = new Thread(this);
	t.start();
	*/
	
	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);

		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);

		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

	}

}
