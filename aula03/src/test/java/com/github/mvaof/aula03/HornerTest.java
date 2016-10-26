package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;

public class HornerTest {

	@Test(expected = IllegalArgumentException.class)
	public void ParametroInvalido() throws Exception {
		int[] g = { 5, 6, 7, 8 };
		Horner.horner(3, -1, g);
	}

	@Test
	public void testCasoDeFronteira() {
		int[] g = { 2, 2, 2 };
		Assert.assertEquals(4, Horner.horner(1, 1, g));
	}

	@Test
	public void testCasoTrivial() {
		int[] g = { 2, 3, 5, 9 };
		Assert.assertEquals(19, Horner.horner(1, 3, g));
	}

	@Test
	public void testInstanciar() {
		new Horner();

	}
}
