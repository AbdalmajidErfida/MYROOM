package ly.taqadom.myroom.Core.Api

import ly.taqadom.myroom.Core.Constance.AppConstant
import ly.taqadom.myroom.Data.Module.StoreModule
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {
    @GET(AppConstant.endPointProducts)
    //suspend fun getProduct():Response<StoreModule>
}