package com.app.shared.data

class InMemoryDataSource {

    private val items = linkedSetOf<String>()

    /** Stores [item]. Returns false if the item already exists. */
    fun add(item: String): Boolean = items.add(item)

    /** Removes [item]. Returns false if the item was not present. */
    fun remove(item: String): Boolean = items.remove(item)

    /** Returns all items in insertion order. */
    fun getAll(): List<String> = items.toList()

    fun clear() = items.clear()
}
