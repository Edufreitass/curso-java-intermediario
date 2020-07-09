package com.loiane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("Hello %s", "Olá, Mundo!"); // %s - concatena String
		System.out.println();
		System.out.printf("Hello %S", "Olá, Mundo!"); // %S - passa a String para CAIXA ALTA
		System.out.println();
		System.out.printf("%c", 'a'); // %c - imprime um caractere em caixa baixa
		System.out.println();
		System.out.printf("%C", 'a'); // %C - imprime um caractere em CAIXA ALTA
		
		System.out.printf("%n"); // %n - pula linha
		
		int valor = 123456789;
		System.out.printf("%d", valor); // %d - representa numeros inteiros
		
		System.out.println();
		
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante); // %f - representa numeros de ponto flutuante
		
		System.out.println();
		
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo); // %20s - insere um espaço inicial (alinhamento a esquerda) de 20 caracteres,
		
		System.out.println();
		
		System.out.printf("%-20s", olaMundo); // %-20s - insere um espaço no final (alinhamento a direita) de 20 caracteres.
		
		System.out.println();
		
		System.out.printf("%+d", valor); // "%+d - imprime o + ou - na frente do valor
		
		System.out.println();
		
		System.out.printf("%015d", valor); // %015d - o valor tem que possuir 15 digitos e para completar sera utilizado o 0(zero).
		
		System.out.println();
		
		System.out.printf("%,d", valor); // %,d - separa as casas decimais por virgula
		
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2); // % d - caso o numero seja negativo, imprime o valor com o sinal de negativo e se for positivo, o sinal nao aparece
		
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante); // %.3f - configura 3 casas decimais apos o ponto de separação das casas decimais
		
		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante); // R$%10.2f - a saída será = R$      3.15
		
		System.out.println();
		
		testeMaisCompleto();
		
	}
	
	private static void testeMaisCompleto() {
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}
		
		// java.util.Formater;
		
	}
	
}
