package com.galacticai.hotrebooter

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.galacticai.hotrebooter.ui.theme.HotRebooterTheme
import kotlinx.coroutines.runBlocking

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "dataStore")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val c = LocalContext.current
            val navController = rememberNavController()

            var state by remember { mutableStateOf(false) }

            MaterialTheme {
                Scaffold(bottomBar = {
                    Navigation(controller = navController)
                }) { scaffoldPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "neutral",
                        modifier = Modifier.padding(scaffoldPadding)
                    ) {
                        composable("neutral") {
                            Text("Neutral page, go to the other page to test hot reboot problem",
                                Modifier.fillMaxSize().padding(20.dp))
                        }
                        composable("hotrebooter") {
                            Scaffold { scaffoldPadding2 ->
                                Surface(modifier = Modifier.padding(scaffoldPadding2)) {
                                    LazyColumn {
                                        runBlocking {
                                            c.dataStore.data.collect { preferences ->
                                                val key = booleanPreferencesKey("state")
                                                if (preferences[key] != null)
                                                    state = preferences[key]!!
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Navigation(controller: NavHostController) {
    val navBackStackEntry by controller.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Surface(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.padding(10.dp),
    ) {
        NavigationBar {
            for (screen in Screen.entries) {
                val label =screen.route
                NavigationBarItem(
                    selected = currentRoute == screen.route,
                    icon = { Icon(screen.icon, contentDescription = label) },
                    label = { Text(label) },
                    onClick = {
                        controller.navigate(screen.route) {
                            popUpTo(controller.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                )
            }
        }
    }
}

enum class Screen(val route: String, val icon: ImageVector) {
    Neutral("neutral", Icons.Rounded.Home),
    HotRebooter("hotrebooter", Icons.Rounded.Warning)
}