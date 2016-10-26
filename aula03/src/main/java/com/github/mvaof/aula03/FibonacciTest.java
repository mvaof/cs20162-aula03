package com.github.mvaof.aula03;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

	@Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroNegativo() throws Exception {
        Fibonacci.fibonacci(-1);
	}
	
    @Test
    public void testCasoTrivial() {
    Assert.assertEquals(0, Fibonacci.fibonacci(0)); 
    Assert.assertEquals(1, Fibonacci.fibonacci(1)); 
    Assert.assertEquals(1, Fibonacci.fibonacci(2));
    
    }
    @Test
    public void testInstanciar() {
        new Fibonacci();
    }

}
