package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;


public class CalculoDePiTest {
	@Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        CalculoDePi.pi(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(4.0, CalculoDePi.pi(1), 0.00001d);
        Assert.assertEquals((4/1 - 4/3 + 4/5), CalculoDePi.pi(3));
}
    @Test
    public void testInstanciar() {
        new CalculoDePi();
    }

}
