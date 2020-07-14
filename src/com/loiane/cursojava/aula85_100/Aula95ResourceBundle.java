package com.loiane.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

	public static void main(String[] args) {

//		Locale.setDefault(new Locale("en", "BR"));
		System.out.println("Locale atual " + Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Olá: " + rb.getString("hello"));
		System.out.println("Mundo: " + rb.getString("world"));

	}

}
