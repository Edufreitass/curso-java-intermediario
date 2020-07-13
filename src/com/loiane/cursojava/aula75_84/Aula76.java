package com.loiane.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = "Curso ";
		String java = "Java";

		String cursoJava = curso + java;

		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado 2 + 2 = " + (2 + 2); // soma
		System.out.println(resultado2Com2);

		String resultado2Com2_ = "Resultado 2 + 2 = " + 2 + 2; // concatena
		System.out.println(resultado2Com2_);

		String um = String.valueOf(1);
		System.out.println(um); // esse 1 é uma String

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ " Praesent elementum malesuada dolor, ac ultricies orci efficitur in. "
				+ "Donec bibendum aliquam convallis. In a purus vitae libero convallis commodo."
				+ " Nunc iaculis justo est, non placerat nunc laoreet placerat."
				+ " Vivamus nec mauris ut diam scelerisque hendrerit. Phasellus scelerisque tellus metus, "
				+ "quis venenatis velit finibus at. Donec lacinia varius elit. "
				+ "Nulla placerat nisl in sapien euismod, in vulputate nulla facilisis. ";

		System.out.println(concatenacao);

		// dessa forma pode causa impacto na performance do programa
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
		concatenacao2 += " Praesent elementum malesuada dolor, ac ultricies orci efficitur in. ";
		concatenacao2 += "Donec bibendum aliquam convallis. In a purus vitae libero convallis commodo.";
		concatenacao2 += " Nunc iaculis justo est, non placerat nunc laoreet placerat.";
		concatenacao2 += " Vivamus nec mauris ut diam scelerisque hendrerit. Phasellus scelerisque tellus metus, ";
		concatenacao2 += "quis venenatis velit finibus at. Donec lacinia varius elit. ";
		concatenacao2 += "Nulla placerat nisl in sapien euismod, in vulputate nulla facilisis. ";

		System.out.println(concatenacao2);

	}

}
