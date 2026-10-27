package com.app.features.feature_two

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TextFormatterTest {

    private val formatter = TextFormatter()

    @Test
    fun `capitalizeWords capitalizes each word`() {
        assertEquals("Hello World", formatter.capitalizeWords("hello world"))
        assertEquals("", formatter.capitalizeWords(""))
    }

    @Test
    fun `reverse reverses text`() {
        assertEquals("cba", formatter.reverse("abc"))
        assertEquals("", formatter.reverse(""))
    }

    @Test
    fun `isPalindrome detects palindromes`() {
        assertTrue(formatter.isPalindrome("racecar"))
        assertTrue(formatter.isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun `isPalindrome rejects non palindromes`() {
        assertFalse(formatter.isPalindrome("android"))
    }
}
