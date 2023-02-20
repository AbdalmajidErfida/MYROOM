package ly.taqadom.myroom.Data.Module


import com.google.gson.annotations.SerializedName

data class StoreModule(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("products")
    val products: List<Product>,
    @SerializedName("skip")
    val skip: Int,
    @SerializedName("total")
    val total: Int
)