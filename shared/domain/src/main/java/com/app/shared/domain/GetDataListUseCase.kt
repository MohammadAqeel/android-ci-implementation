package com.app.shared.domain

class GetDataListUseCase(private val repository: SharedDomainRepository) {

    /** Returns the repository data with blank entries removed, trimmed and sorted alphabetically. */
    operator fun invoke(): List<String> = TODO("Not yet implemented")
}
