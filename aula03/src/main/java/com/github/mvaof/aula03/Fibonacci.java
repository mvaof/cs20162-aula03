/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;

/**
 * Implementa a sequência de Fibonacci.
 * 
 * @author Marcus
 */
public class Fibonacci {
	/**
	 * Serviço que calcula o número da sequência de fibonnaci dada a posição.
	 * 
	 * @param n
	 *            Posição do número na sequência, sendo a primeira zero.
	 * @return o número desejado da sequência.
	 * @throws IllegalArgumentException
	 *             Se a psoição n for menor que zero.
	 */

	public static int fibonacci(int n) {
		int a = 0;
		int c = 1;
		if (n < 0) {
			throw new IllegalArgumentException("A posição do número na função deve ser maior que zero");
		}
		if (n == 0 || n == 1) {
			return n;
		}
		int i = 2;
		int t;
		while (i <= n) {
			t = c;
			c = c + a;
			a = t;
			i = i + 1;
		}

		return c;
	}

}
