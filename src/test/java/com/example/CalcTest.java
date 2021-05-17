package com.example;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public  class CalcTest {
    
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        int ret = calc.add(1, 2);
        assertThat(ret, CoreMatchers.is(3));
    }
}
