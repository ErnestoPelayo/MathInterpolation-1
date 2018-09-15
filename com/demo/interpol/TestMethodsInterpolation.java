package com.demo.interpol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMethodsInterpolation {

    @Test
    public void testLagrange() {
        double t = 9;
        Vector<Double> xx =new Vector<Double> ();
        xx.addElement(6.0);
        Vector<Double> yy = new Vector<Double>();
        yy.addElement(7.0);
        Lagrange instance = new Lagrange();
        double expResult = 7.0;
        double result = instance.calculateResult(t, xx, yy);
        assertEquals(expResult, result, 0.0);

    }

}
