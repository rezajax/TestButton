package app.bidar.testbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.bidar.testbutton.ui.theme.TestButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestButtonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    //Greeting("Android")


                    Scaffold(
                        floatingActionButton = {
                            FloatingActionButton(onClick = { /* ... */ }) {
                                /* FAB content */
                            }
                        },
                        isFloatingActionButtonDocked = true,
                        bottomBar = {
                            BottomAppBar(
                                // Defaults to null, that is, No cutout
                                cutoutShape = MaterialTheme.shapes.small.copy(
                                    CornerSize(percent = 50)
                                )
                            ) {
                                /* Bottom app bar content */
                                MyApp()
                            }
                        }
                    ) {
                        // Screen content
                    }
                }
            }
        }
    }
}

@Preview("Dark Theme")
@Preview("Defult Theme", showBackground = true)
@Composable
fun MyApp() {
    MaterialTheme {
        // Material Components like Button, Card, Switch, etc.
        Column() {
            Button(
                onClick = { /* ... */ },
                // Uses ButtonDefaults.ContentPadding by default
                contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
                )
            ) {
                // Inner content including an icon and a text label
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorite",
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                Text("Like")
            }

            ExtendedFloatingActionButton(
                onClick = { /* ... */ },
                icon = {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Favorite"
                    )
                },
                text = { Text("Like") }
            )
        }



    }
}


/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestButtonTheme {
        Greeting("Android")
    }
}*/
