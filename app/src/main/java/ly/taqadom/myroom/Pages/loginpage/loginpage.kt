package ly.taqadom.myroom.Pages.loginpage

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import ly.taqadom.myroom.Router.AppNavigater

@Composable
fun loginpage(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "loginpage")
        Button(onClick = {
            navController.navigate(AppNavigater.homepage.rout){
                popUpTo(AppNavigater.loginpage.rout){
                    inclusive=true
                }
            }
        },)
        {
            Text(text = "Go To  homepage !!")
        }
    }
    }
