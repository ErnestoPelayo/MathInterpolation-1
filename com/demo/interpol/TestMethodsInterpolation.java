package com.demo.interpol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMethodsInterpolation {

    @Test
    public void testLagrange() {
        double t = 9;
        Vector<Double> xx = new Vector<Double>();
        xx.addElement(6.0);
        Vector<Double> yy = new Vector<Double>();
        yy.addElement(7.0);
        Lagrange instance = new Lagrange();
        double expResult = 7.0;
        double result = instance.testLagrange(t, xx, yy);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testCubicSpline() {
        double t = 2;
        Vector<Double> xx = new Vector<Double>();
        xx.addElement(1.1);
        xx.addElement(2.2);
        xx.addElement(3.3);
        xx.addElement(4.4);

        Vector<Double> yy = new Vector<Double>();
        yy.addElement(1.1);
        yy.addElement(2.2);
        yy.addElement(3.3);
        yy.addElement(4.4);

        CubicSpline instance = new CubicSpline();
        double expResult = 2.0;
        double result = instance.testCubicSpline(t, xx, yy);
        assertEquals(expResult, result, 0.0);

    }

}
