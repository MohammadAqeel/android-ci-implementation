package com.app.shared.domain

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class GetDataListUseCaseTest {

    private class FakeRepository(private val data: List<String>) : SharedDomainRepository {
        override fun getDataList(): List<String> = data
        override fun postData(): Boolean = true
        override fun deleteData(): Boolean = true
    }

    @Test
    fun `returns empty list when repository is empty`() {
        val useCase = GetDataListUseCase(FakeRepository(emptyList()))
        assertTrue(useCase().isEmpty())
    }

    @Test
    fun `removes blank entries`() {
        val useCase = GetDataListUseCase(FakeRepository(listOf("a", "", "  ", "b")))
        assertEquals(listOf("a", "b"), useCase())
    }

    @Test
    fun `trims and sorts entries`() {
        val useCase = GetDataListUseCase(FakeRepository(listOf(" cherry", "apple ", "banana")))
        assertEquals(listOf("apple", "banana", "cherry"), useCase())
    }
}
