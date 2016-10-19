package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;



public class SomatorioTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Somatorio.somatoria(-1);
    }

    @Test
    public void testCasoTrivial() {
       Assert.assertEquals((1/2 + 1/5), Somatorio.somatoria(2));
    }
    @Test
    public void testInstanciar() {
        new Somatorio();
    }

}
