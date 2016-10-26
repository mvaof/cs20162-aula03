package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;

public class RestoDaDivisaoTest {

	@Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroNegativo() throws Exception {
        RestoDaDivisao.Mod(-8,2);
        
    }
	@Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroNegtivo() throws Exception{
		RestoDaDivisao.Mod(8,-2);
	}
	@Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroZero() throws Exception {
		RestoDaDivisao.Mod(10,0);
	}
	

    @Test
    public void testCasoTrivial() {
    Assert.assertEquals(2, RestoDaDivisao.Mod(5, 3)); 
    Assert.assertEquals(3, RestoDaDivisao.Mod(8, 5)); 
    Assert.assertEquals(1, RestoDaDivisao.Mod(3, 2));
    
    }
    @Test
    public void testInstanciar() {
        new RestoDaDivisao();
    }

}
