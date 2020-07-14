package com.loiane.cursojava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {

	public static void main(String[] args) throws ParseException {

		// 1.000,00 - Brasil
		// 1,000.00 - EUA

		Locale en = new Locale("en", "United States");
		NumberFormat nf = NumberFormat.getInstance(en);
		String num = nf.format(100.99);
		System.out.println(num); // 100.99

		Locale br = new Locale("pt", "Brazil");
		nf = NumberFormat.getInstance(br);
		num = nf.format(100.99);
		System.out.println(num); // 100,99

		// MOEDA
		NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());

		String valor = moeda.format(100.99);
		System.out.println(valor); // R$ 100,99

		Currency currency = moeda.getCurrency();
		System.out.println(currency); // BRL

		// PORCENTAGEM
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem); // 9.999%

		porcent.setMaximumIntegerDigits(7);
		porcent.setMinimumIntegerDigits(5);

		porcent.setMaximumFractionDigits(2);
		porcent.setMinimumFractionDigits(1);

		porcentagem = porcent.format(99.987);
		System.out.println(porcentagem); // 09.998,7%

		// ARREDONDAMENTO
		nf = NumberFormat.getInstance();

		nf.setRoundingMode(RoundingMode.UP);
		// para o arredondamento funcionar é preciso configurar as casas decimais
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50)); // 100

		Number num3 = nf.parse("100.00");
		System.out.println(num3.intValue()); // 10000

	}

}
