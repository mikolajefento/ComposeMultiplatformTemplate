package di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import platformModule

fun initKoin(enableNetworkLogs: Boolean = false, appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            appModule(enableNetworkLogs = enableNetworkLogs),
            platformModule(),
        )
    }

// called by iOS...etc
fun initKoin(enableNetworkLogs: Boolean = false) =
    initKoin(enableNetworkLogs = enableNetworkLogs) {}