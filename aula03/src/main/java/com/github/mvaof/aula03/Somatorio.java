/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;

/**
 * Implementação do cálculo do Somatório Elementar.
 * @author Marcus
 */

public class Somatorio {
	  /**
     * Calcula a soma de um grande número de termos.
     * @param n múmero inteiro.
     * @throws IllegalArgumentException se n menor que 1.
     * @return soma do termo.
     */

    public static int somatoria(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 1");
        }

        int s = 0;
        for (int i = 1; i <= n ; i++) {
            int d = 1 + (i * i);
            s = s + 1 / d;
        }

        return s;
}
}
