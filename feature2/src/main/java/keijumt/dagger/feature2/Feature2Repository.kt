package keijumt.dagger.feature2

import java.util.UUID

interface Feature2Repository {
    fun getItem(): String
}

internal class Feature2RepositoryImpl : Feature2Repository {
    override fun getItem(): String = UUID.randomUUID().toString()
}