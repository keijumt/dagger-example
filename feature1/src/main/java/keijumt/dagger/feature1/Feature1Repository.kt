package keijumt.dagger.feature1

import java.util.UUID

interface Feature1Repository {
    fun getItem(): String
}

internal class Feature1RepositoryImpl : Feature1Repository {
    override fun getItem(): String = UUID.randomUUID().toString()
}