package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		// javadoc:
		// https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html

		// dd/MMM/yyyy = 10/ago/2020 14:32:25 PM BRT
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a z");

		Calendar data = new GregorianCalendar(2020, 7, 10, 14, 32, 25);

		System.out.println(sdf.format(data.getTime()));

		Date hoje = new Date();

		System.out.println(sdf.format(hoje));

		// uma data para string
		String d = sdf.format(hoje);

		// convertendo uma String para data
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";

		// uma string para data
		try {
			Date minhaDateEmDate = sdf1.parse(minhaData);

			System.out.println(minhaDateEmDate);

			System.out.println(sdf.format(minhaDateEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
