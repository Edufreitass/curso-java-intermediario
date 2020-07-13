package com.loiane.cursojava.aula75_84;

public class Aula83 {

	public static void main(String[] args) {

		// StringBuffer - ThreadSafe
		System.out.println("StringBuffer");

		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		// forma não performática
		for (String letra : letras) {
			alfabeto += letra;
		}

		System.out.println(alfabeto); // BCDEF

		// forma mais correta
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);
		}

		alfabeto = sb.toString();
		System.out.println(alfabeto); // BCDEF

		alfabeto = new String(sb);
		System.out.println(alfabeto); // BCDEF

		// reverte a String
		System.out.println(sb.reverse()); // FEDCB

		// ---------------------------------------

		// StringBuilder - Não é ThreadSafe
		System.out.println("StringBuilder");

		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}

		alfabeto = sb_.toString();
		System.out.println(alfabeto);

	}

}
