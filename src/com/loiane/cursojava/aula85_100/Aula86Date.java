package com.loiane.cursojava.aula85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(hoje); // Mon Jul 13 13:18:04 BRT 2020

		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime()); // Milisegundos desde 1 Jan 1970 1594657137338

		System.out.println(hoje.getDate()); // 13

	}

}
