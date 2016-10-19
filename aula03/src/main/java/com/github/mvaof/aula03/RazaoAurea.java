/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;

/**
 * Implementa a Razão-Áurea.
 *  @author Marcus
 */
public class RazaoAurea {
	
		    /**
	     * Serviço que calcula a Razão-Áurea.
	     * @param t1 entrada do primeiro numero.
	     * @param t2 entrada do segundo numero.
	     * @param fator Precisão do calculo.
	     * @return Resultado da Razão-Áurea).
	     * @throws IllegalArgumentException se o valor de n1, n2 ou fator for menor que 0.
	     */

	    public static double razaoAurea(int n1, int n2, int fator){
	        if (n1 < 1 || n2 < n1 || fator < 1) {
	            throw new IllegalArgumentException("t1, t2 ou fator invalido");
	        }
	        double tc = n2;
	        double ta = n1;
	        int i = 0;
	        while ( i <= fator) {
	            tc = tc + ta;
	            ta = tc -ta;
	            i = i + 1;
	        }
	        return tc/ta;
	}

}
