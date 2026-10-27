package com.app.shared.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class InMemoryDataSourceTest {

    private lateinit var dataSource: InMemoryDataSource

    @Before
    fun setUp() {
        dataSource = InMemoryDataSource()
    }

    @Test
    fun `starts empty`() {
        assertTrue(dataSource.getAll().isEmpty())
    }

    @Test
    fun `add stores items in insertion order`() {
        assertTrue(dataSource.add("first"))
        assertTrue(dataSource.add("second"))
        assertEquals(listOf("first", "second"), dataSource.getAll())
    }

    @Test
    fun `add rejects duplicates`() {
        dataSource.add("item")
        assertFalse(dataSource.add("item"))
        assertEquals(listOf("item"), dataSource.getAll())
    }

    @Test
    fun `remove deletes existing item`() {
        dataSource.add("item")
        assertTrue(dataSource.remove("item"))
        assertTrue(dataSource.getAll().isEmpty())
    }

    @Test
    fun `remove returns false for missing item`() {
        assertFalse(dataSource.remove("missing"))
    }

    @Test
    fun `clear removes everything`() {
        dataSource.add("a")
        dataSource.add("b")
        dataSource.clear()
        assertTrue(dataSource.getAll().isEmpty())
    }
}
