package ly.taqadom.myroom.Core.Resource

sealed class Resource<T>()
{
    class  Loading<T> :Resource<T>()
    class Success<T>(var data:T):Resource<T>()
    class Error<T>(var massage:String):Resource<T>()
}
