package ly.taqadom.myroom.Router

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ly.taqadom.myroom.Pages.homepage.homepage
import ly.taqadom.myroom.Pages.loginpage.loginpage

@Composable
fun Router() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppNavigater.loginpage.rout){
        composable(route = AppNavigater.loginpage.rout){
            loginpage(navController)
        }
        composable(route = AppNavigater.homepage.rout){
            homepage(navController)
        }
    }
}