package com.app.entries.entry_one

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class PaginatorTest {

    private val items = (1..10).toList()

    @Test
    fun `pageCount rounds up`() {
        assertEquals(4, Paginator(items, 3).pageCount)
        assertEquals(2, Paginator(items, 5).pageCount)
    }

    @Test
    fun `pageCount is zero for empty list`() {
        assertEquals(0, Paginator(emptyList<Int>(), 3).pageCount)
    }

    @Test
    fun `page returns correct slice`() {
        val paginator = Paginator(items, 3)
        assertEquals(listOf(1, 2, 3), paginator.page(0))
        assertEquals(listOf(10), paginator.page(3))
    }

    @Test
    fun `page out of range returns empty list`() {
        val paginator = Paginator(items, 3)
        assertTrue(paginator.page(4).isEmpty())
        assertTrue(paginator.page(-1).isEmpty())
    }
}
