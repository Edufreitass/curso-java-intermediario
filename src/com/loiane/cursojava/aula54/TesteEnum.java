package com.loiane.cursojava.aula54;

import com.loiane.cursojava.aula54.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;

		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(8, 7, 2020, DiaSemana.TERCA);
		System.out.println(data);

		Formulario form = new Formulario();
		form.setNome("Eduardo");
		form.setGenero(Genero.MASCULINO);
		System.out.println(form);

		Genero gen = Genero.MASCULINO;
		System.out.println(gen.getValor());

	}

}
