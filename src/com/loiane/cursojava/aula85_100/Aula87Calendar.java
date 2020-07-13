package com.loiane.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {

		// retorna um "new Calendar();"
		Calendar hoje = Calendar.getInstance(); // singleton

		// java.util.GregorianCalendar[time=1594657498694,areFieldsSet=true,areAllFieldsSet=true,
		// lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/Sao_Paulo",offset=-10800000,
		// dstSavings=0,useDaylight=false,transitions=93,lastRule=null],firstDayOfWeek=1,
		// minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,
		// DAY_OF_MONTH=13,DAY_OF_YEAR=195,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=1,
		// HOUR_OF_DAY=13,MINUTE=24,SECOND=58,MILLISECOND=694,ZONE_OFFSET=-10800000,DST_OFFSET=0]
//		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR); // 2020
		int mes = hoje.get(Calendar.MONDAY); // 6
		int dia = hoje.get(Calendar.DAY_OF_MONTH); // 13
		int hora = hoje.get(Calendar.HOUR_OF_DAY); // 13
		int minutos = hoje.get(Calendar.MINUTE); // 31
		int segundos = hoje.get(Calendar.SECOND); // 35

		System.out.println(ano); // 2020
		System.out.println(mes); // 6
		System.out.println(dia); // 13
		System.out.println(hora); // 13
		System.out.println(minutos); // 31
		System.out.println(segundos); // 35

		// ---------------------------------------

		// Saída formatada

		// Hoje é : 13/07/2020 13:46:01
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia, (mes + 1), ano, hora, minutos, segundos);

		// Adicionando dias na data
		hoje.add(Calendar.DAY_OF_MONTH, 3); // 13 + 3
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); // 16

		// Removendo dias na data
		hoje.add(Calendar.DAY_OF_MONTH, -3); // 16 - 3
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); // 13

	}

}
