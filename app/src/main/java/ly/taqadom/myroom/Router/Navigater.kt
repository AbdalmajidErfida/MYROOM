package ly.taqadom.myroom.Router

sealed class AppNavigater(val rout:String){
    object loginpage:AppNavigater("loginpage")
    object homepage:AppNavigater("homepage")
}
