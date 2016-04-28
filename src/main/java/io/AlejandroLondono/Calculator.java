package io.AlejandroLondono;

/**
 * Created by alejandrolondono on 4/27/16.
 */
public class Calculator {
//    this method returns the sum of two values, order does not value.
    public int sum(int value1, int value2){
        return value1+value2;
    }

// add subtract multiply and divide
    public int subtract(int value1, int value2){
        return value1 - value2;
    }

//    multiply returns the product of two values. order does not matter
    public int multiply(int value1, int value2){
        return value1 * value2;
    }

//    this divide function returns a quotient based on two argument values. order matters value one is divided by v2
    public int divide(int value1, int value2){
        return value1/value2;
    }
}
