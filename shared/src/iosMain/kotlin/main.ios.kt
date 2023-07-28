import androidx.compose.ui.window.ComposeUIViewController
import io.ktor.client.engine.darwin.Darwin
import org.koin.dsl.module
actual fun platformModule() = module {
    single { Darwin.create() }
}

fun MainViewController() = ComposeUIViewController { App() }