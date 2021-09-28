/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author TanNV
 */
 @RunWith (value = Parameterized.class)
public class AdvancedFactorialTest {
    @Parameters
    public static Object[][] initData(){
        return new Integer[][]{
            {0,1},{1,1},{2,2},{3,6},{4,24}
        }; 
    }
    
    @Parameter(value = 0)
    public int input;
     @Parameter(value = 1)
    public long expected;
     
    @Test
    public void testFactorial(){
        assertEquals(expected, MathUtils.getFactorial(input));
    }
   
    
}
