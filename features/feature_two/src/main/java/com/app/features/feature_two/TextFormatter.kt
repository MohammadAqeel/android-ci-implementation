package com.app.features.feature_two

class TextFormatter {

    /** Capitalizes the first letter of every word, e.g. "hello world" -> "Hello World". */
    fun capitalizeWords(text: String): String =
        text.split(" ").joinToString(" ") { word -> word.replaceFirstChar { it.uppercaseChar() } }

    fun reverse(text: String): String = text.reversed()

    /** Case-insensitive palindrome check that ignores non-alphanumeric characters. */
    fun isPalindrome(text: String): Boolean {
        val normalized = text.filter { it.isLetterOrDigit() }.lowercase()
        return normalized == normalized.reversed()
    }
}
