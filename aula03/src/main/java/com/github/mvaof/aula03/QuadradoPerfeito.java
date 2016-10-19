/**
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.mvaof.aula03;

/**
 * Classe que implementa o Quadrado Perfeito.
 */
public class QuadradoPerfeito {

	    /**
	     * Serviço que verifica se um número é um quadrado perfeito.
	     * @param k número a ser verificado.
	     * @throws IllegalArgumentException para k menor que 1.
	     * @return true se o número for quadrado perfeito, senão false.
	     */

	    public static boolean quadradoPerfeito(int k){
	        if (k < 1) {
	            throw new IllegalArgumentException("k deve ser maior ou igual a 1");
	        }

	        int i = 1;
	        int q = 1;
	        while (q < k){
	            i = i + 2;
	            q = q + i;
	        }

	        return q == k;
	    }
	
}
