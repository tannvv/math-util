/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.mathutil.core;

/**
 *
 * @author TanNV
 */
public class MathUtils {
    public static long getFactorial(int n){
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("N must be 0-20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
  
    
}
