package com.app.features.shared.feature_one_two_shared

class EmailValidator {

    private val emailRegex = Regex("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")

    /** Returns true for addresses of the form local@domain.tld with no whitespace. */
    fun isValid(email: String): Boolean = emailRegex.matches(email)
}
