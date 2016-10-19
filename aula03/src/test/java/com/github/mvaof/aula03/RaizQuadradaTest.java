package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;

public class RaizQuadradaTest {


    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        RaizQuadrada.raizQuadrada(-1, 5);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(3, RaizQuadrada.raizQuadrada(9, 2));
        Assert.assertEquals(9, RaizQuadrada.raizQuadrada(81, 3));
        Assert.assertEquals(5, RaizQuadrada.raizQuadrada(25, 2));
        Assert.assertEquals(6, RaizQuadrada.raizQuadrada(36, 6));
        Assert.assertEquals(2, RaizQuadrada.raizQuadrada(4, 56));
        Assert.assertEquals(6, RaizQuadrada.raizQuadrada(40, 56));
        Assert.assertEquals(3, RaizQuadrada.raizQuadrada(9, 56));
}
    @Test
    public void testInstanciar() {
        new RaizQuadrada();
    }
}
