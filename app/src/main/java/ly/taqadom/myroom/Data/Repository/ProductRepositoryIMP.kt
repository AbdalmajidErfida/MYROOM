package ly.taqadom.myroom.Data.Repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ly.taqadom.myroom.Core.Api.ProductApi
import ly.taqadom.myroom.Core.Constance.AppConstant.baseURl
import ly.taqadom.myroom.Core.Resource.Resource
import ly.taqadom.myroom.Data.Module.StoreModule
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProductRepositoryIMP:ProductRepository {
    override suspend fun getProducts(): Flow<Resource<StoreModule>> {
        //////////////DI///////////////
        var server = Retrofit.Builder().baseUrl(baseURl)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(ProductApi::class.java)
        ///////////////DI//////////////
        return flow {
      val result = server.getProduct()

        }
    }
}