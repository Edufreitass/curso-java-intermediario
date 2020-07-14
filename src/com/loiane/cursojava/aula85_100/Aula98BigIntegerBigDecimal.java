package com.loiane.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntegerBigDecimal {

	public static void main(String[] args) {

		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c); // 0.010000000000000002 (resultado não esperado)

		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c); // 0.01 (resultado esperado)

		BigDecimal bd1 = new BigDecimal("1234567890.098765431");
		BigDecimal bd2 = new BigDecimal("987654321.9876543210");
		// adiçao
		System.out.println(bd1.add(bd2)); // 2222222212.0864197520
		// subtração
		System.out.println(bd1.subtract(bd2)); // 246913568.1111111100
		// multiplicação
		System.out.println(bd1.multiply(bd2)); // 1219326312443225105.9164761456925773510
		// divisao
		System.out.println(bd1.divide(new BigDecimal(2))); // 617283945.0493827155

		BigInteger bi = new BigInteger("10000000000000000000");
		System.out.println(bi);

	}

}
