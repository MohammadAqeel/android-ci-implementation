package com.app.shared.domain

interface SharedDomainRepository {

    fun getDataList(): List<String>

    fun postData(): Boolean

    fun deleteData(): Boolean
}
