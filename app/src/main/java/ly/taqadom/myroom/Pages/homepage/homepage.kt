package ly.taqadom.myroom.Pages.homepage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import ly.taqadom.myroom.Router.AppNavigater

@Composable
fun homepage(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "homepage")
        Button(onClick = {
            navController.navigate(AppNavigater.loginpage.rout)
            {
                popUpTo(AppNavigater.loginpage.rout){
                    inclusive=true
                }
            }
        },)
        {
            Text(text = "Go To loginpage !!")
        }
    }
}