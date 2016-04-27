package io.AlejandroLondono;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alejandrolondono on 4/27/16.
 */
public class CalculatorSpec {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        int expectedSum=4;
        int actualSum=calculator.sum(2,2);
        assertEquals("the expected value should be 2", expectedSum, actualSum);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int expectedValue = 0;
        int actualValue = calculator.subtract(2,2);
        assertEquals("the expected value should be 0", expectedValue, actualValue);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int expectedProduct=15;
        int actualProduct= calculator.multiply(3,5);
        assertEquals("the expected value should be 15", expectedProduct, actualProduct);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int expectedQuotient=20;
        int actualQuotient=calculator.divide(100,5);
        assertEquals("The expected value should be 20", expectedQuotient, actualQuotient);
    }
}
