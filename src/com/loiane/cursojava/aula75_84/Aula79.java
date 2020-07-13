package com.loiane.cursojava.aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		
		// indexOf
		
		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf('x')); // -1 não existe
		System.out.println(banana.indexOf('b')); // 0
		System.out.println(banana.indexOf('a')); // 1
		
		System.out.println(banana.indexOf(ana)); // 1
		
		// ---------------------------------------
		
		// lastIndexOf
		
		System.out.println(banana.lastIndexOf('a')); // 5
		System.out.println(banana.lastIndexOf(ana)); // 3
		
		// ---------------------------------------

		// contains
		
		System.out.println(banana.contains(ana)); // true
		System.out.println(banana.contains("ceu")); // false
		
	}
	
}
