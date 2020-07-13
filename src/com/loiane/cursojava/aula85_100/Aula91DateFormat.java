package com.loiane.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {

		// Data para String

		Date hoje = new Date();

		System.out.println(hoje); // Mon Jul 13 16:53:41 BRT 2020

		System.out.println(Locale.getDefault()); // pt_BR

		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado); // 13/07/2020 16:58

		// mudando o Locale

		// caso necessite mudar o Locale padrao da maquina atual ou do servidor]
//		Locale.setDefault(new Locale("en_US"));
//		Locale.setDefault(new Locale("en", "United States"));

//		hojeFormatado = DateFormat.getInstance().format(hoje);
//		System.out.println(hojeFormatado); // 2020-07-13 16:58

		// outros metodos de formatação de acordo com o Locale

		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado); // 17:02:01

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado); // 13 de jul de 2020 - dd/MMM/yyyy

		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado); // 13 de jul de 2020 17:05:08

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado); // 17:06

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado); // 17:06:48

		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado); // 17:06:48 BRT

		// misturando o formato da data e hora

		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado); // 13 de jul de 2020 17:10

		// ---------------------------------------

		// String para Data

		String data = "10/08/2020 13:30";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate); // Mon Aug 10 13:30:00 BRT 2020

			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate); // java.util.GregorianCalendar[time...

			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
