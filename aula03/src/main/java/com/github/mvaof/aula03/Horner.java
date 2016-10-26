/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;

/**
 * Implementa a Regra de Horner para avaliação de polinômios.
 * 
 * @author Marcus
 */
public class Horner {
	/**
	 * Serviço que calcula a raiz de um polinômio. 
	 * @param x primeiro parâmetro.
	 * @param g segundo parâmetro.
	 * @param []a vetor de números inteiros
	 * @return raiz do polinômio.
	 * @throws IllegalArgumentException se g for menor que 1. 
	 */

	public static int horner(int x, int g, int []a) {
		if (g < 1){
            throw new IllegalArgumentException("g deve ser maior ou igual a 1.");
        }

        int p = a[g];
        for (int i = g - 1; i >= 0; i--){
            p = p * x + a[i];
        }

        return p;
}

}
