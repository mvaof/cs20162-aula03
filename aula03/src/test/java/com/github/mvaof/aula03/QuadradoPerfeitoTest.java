package com.github.mvaof.aula03;



import org.junit.Assert;
import org.junit.Test;

public class QuadradoPerfeitoTest {

	    @Test(expected = IllegalArgumentException.class)
	    public void testParamentroInvalido() throws Exception {
	        QuadradoPerfeito.quadradoPerfeito(-1);
	    }

	    @Test
	    public void testCasoTrivial() {
	        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(26));
	        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(25));
	        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(36));
	        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(49));
	        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(41));
	        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(28));
	        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(89));
	        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(100));
	        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(289));
	    }
	    @Test
        public void testInstanciar() {
            new QuadradoPerfeito();
        }
	}


