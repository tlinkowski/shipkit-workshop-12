package com.example.shipkitworkshop;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathUtilsTest {

    @Test
    public void shouldCreateTriangle() {
        assertTrue(MathUtils.isTriangle(3, 4, 5));
    }

    @Test
    public void shouldNotCreateTriangle() {
        assertFalse(MathUtils.isTriangle(3, 4, 10));
    }

}
