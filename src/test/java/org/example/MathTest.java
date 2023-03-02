package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    MathClass m = new MathClass();
    @Test
    public void testGCF(){
        int gcf = m.GCF(6,12);
        Assert.assertEquals(6, gcf);
    }

    @Test
    public void testAreaRectangle(){
        int a = m.areaRectangle(5,10);
        Assert.assertEquals(50, a);
    }

    @Test
    public void testAreaTriangle(){
        double b = m.areaTriangle(6,6);
        Assert.assertEquals(18.0, b, 0.001);
    }

    @Test
    public void testAreaCircle(){
        double c = m.areaCircle(10);
        Assert.assertEquals(314.159, c, 0.001);
    }

    @Test
    public void factorial(){
        int d = m.factorial(5);
        Assert.assertEquals(120, d);
    }
}
