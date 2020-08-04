package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

	public static void main(String[] args) {

		try {
			diferencaDataAteJava7();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("---------");

		diferencaDataJava8();

		System.out.println("---------");

		diferencaDataJava8ComTempo();

		System.out.println("---------");

		diferencaDataJava8ComChronoUnit();

	}

	// Diferença entre datas no Java 7 utilizando Date ou Calendar
	public static void diferencaDataAteJava7() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("01/01/2020");
		Date segundaDt = sdf.parse("01/02/2020");

		// Retorna a diferença em milisegundos(ms) entre as datas
		long diffEmMil = Math.abs(segundaDt.getTime() - primeiraDt.getTime());

		// Retorna a diferença em dias entre as datas
		long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);

		// Transforma a diferença em ms para dias
		// segundo=1000ms * minuto=60seg * hora=60min * dia=24h
		int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24));

		System.out.println(diff);
		System.out.println(dias);

	}

	// Diferença entre datas no Java 8
	public static void diferencaDataJava8() {

		LocalDate data1 = LocalDate.of(2020, 01, 01);
		LocalDate data2 = LocalDate.of(2020, 02, 10);

		// Diferença entre as datas
		Period periodo = Period.between(data1, data2);

		// Diferença entre dias
		int dias = periodo.getDays();

		// Diferença entre meses
		int meses = periodo.getMonths();

		// Diferença entre anos
		int anos = periodo.getYears();

		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);

	}

	// Diferença entre datas no Java 8 com tempo
	public static void diferencaDataJava8ComTempo() {

		LocalDateTime data1 = LocalDateTime.of(2020, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2020, 1, 1, 8, 30);

		Duration duracao = Duration.between(data1, data2);
		// Diferença entre as horas
		long diff = duracao.toHours();

		System.out.println(diff);

	}

	// Diferença entre datas no Java 8 utilizando o Enum ChronoUnit
	public static void diferencaDataJava8ComChronoUnit() {

		LocalDateTime data1 = LocalDateTime.of(2020, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2020, 1, 1, 8, 30);

		// Diferença entre horas
		long diff = ChronoUnit.HOURS.between(data1, data2);
		// Diferença entre dias
		long diffDias = ChronoUnit.DAYS.between(data1, data2);

		System.out.println(diff);
		System.out.println(diffDias);

	}

}
