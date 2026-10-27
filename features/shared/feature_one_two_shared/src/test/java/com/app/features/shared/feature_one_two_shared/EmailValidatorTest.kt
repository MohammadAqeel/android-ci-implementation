package com.app.features.shared.feature_one_two_shared

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    private val validator = EmailValidator()

    @Test
    fun `accepts valid emails`() {
        assertTrue(validator.isValid("user@example.com"))
        assertTrue(validator.isValid("first.last@sub.domain.org"))
    }

    @Test
    fun `rejects missing at sign`() {
        assertFalse(validator.isValid("userexample.com"))
    }

    @Test
    fun `rejects missing domain or tld`() {
        assertFalse(validator.isValid("user@"))
        assertFalse(validator.isValid("user@example"))
    }

    @Test
    fun `rejects blank and whitespace`() {
        assertFalse(validator.isValid(""))
        assertFalse(validator.isValid("user name@example.com"))
    }
}
