/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;
/**
 * Classe que implementa a raiz quadrada.
 *  @author Marcus
 */

public class RaizQuadrada {

	    /**
	     * Serviço que calcula a raiz de um número.
	     * @param n primeiro número inteiro.
	     * @param i segundo número inteiro.
	     * @throws IllegalArgumentException para n menor que 1.
	     * @return Raiz do número.
	     */

	    public static int raizQuadrada(int n, int i){
	        if (n < 1) {
	            throw new IllegalArgumentException("n deve ser maior que 1");
	        }

	        int r = 1;
	        while (i >= 0) {
	            r = (r + n / r) / 2;
	            i = i - 1;
	        }

	        return r;
	}
}
