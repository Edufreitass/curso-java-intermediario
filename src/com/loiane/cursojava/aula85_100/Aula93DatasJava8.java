package com.loiane.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

	public static void main(String[] args) {

		// Data

		// data - yyyy MM dd
		LocalDate agora = LocalDate.now();
		System.out.println(agora); // 2020-07-13

		System.out.println(LocalDate.of(2020, 8, 10)); // 2020-08-10
		System.out.println(LocalDate.parse("2020-08-10")); // 2020-08-10

		// adiciona 30 dias
		System.out.println(agora.plusDays(30)); // 2020-08-12

		// substrai 30 dias
		System.out.println(agora.minusDays(30)); // 2020-06-13

		// diminui 1 mes da data de hoje(13/07/2020)
		System.out.println(agora.minus(1, ChronoUnit.MONTHS)); // 2020-06-13

		// dia da semana atual
		System.out.println(agora.getDayOfWeek()); // MONDAY

		// dia do mes atual
		System.out.println(agora.getDayOfMonth()); // 13

		// dia do ano atual
		System.out.println(agora.getDayOfYear()); // 195

		// verifica se é um ano bissexto
		System.out.println(agora.isLeapYear()); // 2020 = true

		// ---------------------------------------

		// Hora

		// hora formato ISO
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora); // 17:59:48.653288800

		System.out.println(LocalTime.of(20, 18)); // 20:18
		System.out.println(LocalTime.parse("20:18")); // 20:18

		// adiciona 60 min a partir da hora atual (17:59)
		System.out.println(hAgora.plusMinutes(60)); // 18:59:48.653288800

		// diminui 40 min da hora atual
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES)); // 17:19:48.653288800

		// hora atual
		System.out.println(hAgora.getHour()); // 17

		// ---------------------------------------

		// Data e Hora

		// data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto); // 2020-07-13T22:25:06.962789

		System.out.println(LocalDateTime.of(2020, 8, 10, 13, 30, 47));
		System.out.println(LocalDateTime.parse("2020-01-27T22:30:19"));

		// adiciona 20 anos a partir da data atual
		System.out.println(agoraCompleto.plusYears(20)); // 2040-07-13T22:26:07.435587600

		// ---------------------------------------

		// TimeZone(fuso horário)

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso); // America/Sao_Paulo

		// retorna todos os fusos(zonas horarias)
		Set<String> fusos = ZoneId.getAvailableZoneIds();
//		for (String f : fusos) {
//			System.out.println(f);
//		}

		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2020-01-27T22:30:19"), sp);
		System.out.println(zdt); // 2020-01-27T22:30:19-03:00[America/Sao_Paulo]
		System.out.println(ZonedDateTime.parse("2020-01-27T22:30:19-03:00[America/Sao_Paulo]")); // 2020-01-27T22:30:19-03:00[America/Sao_Paulo]

		// ---------------------------------------

		// Offset

		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt); // 2020-07-13T23:49:19.944150500+02:00

		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate); // 2020-07-13T23:49:19.956
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp)); // 2020-07-13T23:49:19.956

	}

}
