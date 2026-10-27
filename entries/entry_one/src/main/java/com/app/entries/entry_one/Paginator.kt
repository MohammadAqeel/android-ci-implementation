package com.app.entries.entry_one

class Paginator<T>(private val items: List<T>, private val pageSize: Int) {

    /** Total number of pages; 0 when there are no items. */
    val pageCount: Int
        get() = TODO("Not yet implemented")

    /** Returns the items on the zero-based [page], or an empty list if out of range. */
    fun page(page: Int): List<T> = TODO("Not yet implemented")
}
