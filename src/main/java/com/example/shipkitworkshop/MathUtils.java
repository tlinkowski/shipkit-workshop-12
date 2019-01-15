package com.example.shipkitworkshop;

/**
 * This class is for math operations.
 */
public class MathUtils {

    /**
     * This method check is it possible to build triangle from arguments.
     * @param a a width of first side
     * @param b a width of second side
     * @param c a width if 3th side
     * @return true if you can build triangle, false otherwise.
     */
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }

    /**
     * This method check is it possible to build triangle from arguments.
     * @param a a width of first side
     * @param b a width of second side
     * @param c a width if 3th side
     * @return true if you can build triangle, false otherwise.
     */
    public static boolean isTriangle(float a, float b, float c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }
}
