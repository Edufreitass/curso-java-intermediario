package com.loiane.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();

		System.out.println(tz); // sun.util.calendar.ZoneInfo[id="America/Sao_Paulo",offset=...

//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso : fusos) {
//			System.out.println(fuso); // America/Sao_Paulo
//		}

		// configurar fuso horario padrão
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");

		System.out.println(tzSP.getDisplayName()); // Horário Padrão de Brasília
		System.out.println(tzSP.getID()); // America/Sao_Paulo

		// convertendo um horario
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(agora.getTime()));

		Calendar agoraSP = Calendar.getInstance(tzSP); // 13/07/2020 17:27
		System.out.println(agoraSP.getTimeZone()); // sun.util.calendar.ZoneInfo[id="America/Sao_Paulo",offset=..
		System.out.println(sdf.format(agoraSP.getTime())); // 13/07/2020 17:27

		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
		System.out.println(sdf.format(agoraSP.getTime()));

	}

}
