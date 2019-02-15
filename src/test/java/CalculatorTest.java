/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hassuni
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int n1 = 2;
        int n2 = 3;
        int expected = 5;
        int actual = c.add(n1, n2);
        assertEquals(expected, actual);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int n1 = 4;
        int n2 = 2;
        int expected = 2;
        int actual = c.sub(n1, n2);
        assertEquals(expected, actual);
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @Test
    public void testMul() {
        Calculator c = new Calculator();
        int n1 = 4;
        int n2 = 2;
        int expected = 8;
        int actual = c.mul(n1, n2);
        assertEquals(expected, actual);
    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv() throws ArithmeticException {
        Calculator c = new Calculator();
        int n1 = 4;
        int n2 = 2;
        int expected = 2;
        int actual = c.div(n1, n2);
        assertEquals(expected, actual);
    }
    
}
