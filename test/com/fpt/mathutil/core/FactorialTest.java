/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mathutil.core;

import org.junit.Assert;
import org.junit.Test;          // JUnit 4



/**
 *
 * @author TanNV
 */
public class FactorialTest {
    @Test // biến một hàm đi kèm anotation này thành hàm main()
    public void checkFactorialGivenRightArgumentReturnsWell(){
        long expected = 120;
        long actual = MathUtils.getFactorial(5);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtils.getFactorial(6));
        Assert.assertEquals(1, MathUtils.getFactorial(0));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtils.getFactorial(-5); // phải ném ra ngoại lệ thì mới đúng 
    }
}
