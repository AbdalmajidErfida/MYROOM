package ly.taqadom.myroom.Pages.homepage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import ly.taqadom.myroom.Core.Resource.Resource
import ly.taqadom.myroom.Data.Module.StoreModule
import ly.taqadom.myroom.Data.Repository.ProductRepositoryIMP

class HomeViewModel:ViewModel() {
    //////////di/////////////
    val productRepository=ProductRepositoryIMP()
    ////////////////////////
    init {
        getProducts()
    }
    var state = MutableStateFlow<Resource<StoreModule>>(Resource.Loading())
    fun getProducts()
    {
        viewModelScope.launch {
            productRepository.getProducts().onEach {

            }.launchIn(this)
        }
    }
}