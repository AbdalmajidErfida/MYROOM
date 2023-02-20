package ly.taqadom.myroom.Data.Repository

import kotlinx.coroutines.flow.Flow
import ly.taqadom.myroom.Core.Resource.Resource
import ly.taqadom.myroom.Data.Module.StoreModule

interface ProductRepository {
    suspend fun getProducts():Flow<Resource<StoreModule>>

}