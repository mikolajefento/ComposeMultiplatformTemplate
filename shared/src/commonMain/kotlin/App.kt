import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun App() {
    MaterialTheme {
        Scaffold {
            Text(text = "Hello World")
        }
    }
}