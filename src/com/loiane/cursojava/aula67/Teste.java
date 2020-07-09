package com.loiane.cursojava.aula67;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("Thread #1", 600); // 0,6s
		// thread.start();

		MinhaThread thread2 = new MinhaThread("Thread #2", 900); // 0,9s

		MinhaThread thread3 = new MinhaThread("Thread #3", 500); // 0,5s

	}

}
