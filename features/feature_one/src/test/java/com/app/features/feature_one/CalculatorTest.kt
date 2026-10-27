package com.app.features.feature_one

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `add returns sum`() {
        assertEquals(5, calculator.add(2, 3))
        assertEquals(-1, calculator.add(2, -3))
    }

    @Test
    fun `subtract returns difference`() {
        assertEquals(-1, calculator.subtract(2, 3))
        assertEquals(10, calculator.subtract(7, -3))
    }

    @Test
    fun `multiply returns product`() {
        assertEquals(6, calculator.multiply(2, 3))
        assertEquals(0, calculator.multiply(0, 42))
    }

    @Test
    fun `divide returns integer quotient`() {
        assertEquals(3, calculator.divide(7, 2))
        assertEquals(-4, calculator.divide(-8, 2))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `divide by zero throws`() {
        calculator.divide(1, 0)
    }
}
