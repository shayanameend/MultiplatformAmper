package di

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.dsl.module

val dataModule = module {
  single {
    val json = Json { ignoreUnknownKeys = true }
    HttpClient {
      install(ContentNegotiation) {
        // TODO Fix API so it serves application/json
        json(json, contentType = ContentType.Application.Json)
      }
    }
  }
}

val viewModelModule = module {}

fun initKoin() {
  startKoin {
    modules(
      dataModule,
      viewModelModule,
    )
  }
}