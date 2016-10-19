/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.mvaof.aula03;

/**
 * Implementação do cálculo do Valor de PI.
 * 
 * @author Marcus
 */
public class Fatorial {
	/**
	 * Calcula o fatorial
	 * @para n número inteiro.
	 * @throws IllegalArgumentException para n menor que 1.
	 * @return fatorial.
	 */

	public static int fatorial(int i2) {
		if (i2 < 1) {
			throw new IllegalArgumentException("n tem q ser maior ou igual a 1");
		}

		int f = 1;
		for (int i = 2; i <= i2; i++) {
			f = f * i;
		}

		return f;
	}

}
