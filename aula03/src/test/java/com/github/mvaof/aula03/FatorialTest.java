package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;


public class FatorialTest {

	@Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Fatorial.fatorial(-3);
    }

    @Test
    public void testDeFronteira() {
        Assert.assertEquals(1, Fatorial.fatorial(1));
    }

    @Test
    public void testTrivial() {
        Assert.assertEquals(720, Fatorial.fatorial(6));
        Assert.assertEquals(120, Fatorial.fatorial(5));
        Assert.assertEquals(40320, Fatorial.fatorial(8));
        Assert.assertEquals(6, Fatorial.fatorial(3));
        Assert.assertEquals(24, Fatorial.fatorial(4));
        Assert.assertEquals(5040, Fatorial.fatorial(7));
        Assert.assertEquals(479001600, Fatorial.fatorial(12));
}
    @Test
    public void testInstanciar() {
        new Fatorial();
    }

}
