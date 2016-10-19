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
public class CalculoDePi {

	/**
	 * Serviço que calcula o valor de PI através de uma somatória de termos.
	 * 
	 * @param n número de precisão do valor.
	 * @throw IllegalArgumentException se n menor que 1.
	 * @return valor de PI.
	 */

	public static int pi(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("n invalido");
		}

		int s = -1;
		int d = -1;
		int p = 0;
		for (int i = 1; i <= n; i++) {
			d = d + 2;
			s = -1 * s;
			p = p + 4 * s / d;
		}

		return p;
	}

}
