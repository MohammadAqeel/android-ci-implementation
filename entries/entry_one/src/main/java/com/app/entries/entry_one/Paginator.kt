package com.app.entries.entry_one

class Paginator<T>(private val items: List<T>, private val pageSize: Int) {

    init {
        require(pageSize > 0) { "pageSize must be positive" }
    }

    /** Total number of pages; 0 when there are no items. */
    val pageCount: Int
        get() = (items.size + pageSize - 1) / pageSize

    /** Returns the items on the zero-based [page], or an empty list if out of range. */
    fun page(page: Int): List<T> {
        if (page !in 0 until pageCount) return emptyList()
        val from = page * pageSize
        return items.subList(from, minOf(from + pageSize, items.size))
    }
}
