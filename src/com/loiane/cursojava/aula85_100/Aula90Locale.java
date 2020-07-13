package com.loiane.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		// Formato de datas
		// Brasil: dd/MM/yyyy - 02/01/2000
		// EUA: MM/dd/yyyy - 01/fev/2000

		// Formato de valores
		// Brasil: 1.000,02
		// EUA: 1,000.02

		// Locale padrão da máquina
		Locale locale = Locale.getDefault();
		System.out.println(locale); // pt_BR

		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc : locales) {

			System.out.println("Nome: " + loc.getDisplayName()); // português (Brasil)
			System.out.println("Código da língua: " + loc.getLanguage()); // pt
			System.out.println("Língua: " + loc.getDisplayLanguage()); // português
			System.out.println("Cod País: " + loc.getCountry()); // BR
			System.out.println("País: " + loc.getDisplayCountry()); // Brasil

			System.out.println("******************");

		}

		Locale br = new Locale("pt", "BR");
		System.out.println(br); // pt_BR

		// força o Locale padrão do sistema
		Locale.setDefault(br);
		System.out.println(Locale.getDefault()); // pt_BR

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d)); // R$ 5.000.000.000,00

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d)); // $5,000,000,000.00

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d)); // 5.000.000.000,00 €

	}

}
