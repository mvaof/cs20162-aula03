/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;

/**
 * Implementa o Resto da Divisão de um inteiro.
 * 
 * @author Marcus
 */
public class RestoDaDivisao {
	/**
	 * Serviço que calcula o resto da divisão inteira.
	 * 
	 * @param x
	 *            dividendo da operação.
	 * @param y
	 *            divisor da operação.
	 * @return Resto da divisão inteira.
	 * @throws IllegalArgumentException
	 *             Se o parâmetro y for menor que 0 ou o arâmetro x menor ou
	 *             igual a 0.
	 */

	public static int Mod(int x, int y) {
		if (y <= 0 || x < 0) {
			throw new IllegalArgumentException("o parâmetro y deve ser maior ou igual a 0 e x deve ser maior que 0");
		}
		int s = x;
		while (y <= s) {
			s -= y;
		}
		return s;
	}

}
