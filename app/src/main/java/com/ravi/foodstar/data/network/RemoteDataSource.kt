package com.ravi.foodstar.data.network

import com.ravi.foodstar.data.FoodRecipesApi
import com.ravi.foodstar.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
   suspend fun getRecipes(queries:Map<String,String>): Response<FoodRecipe> {
       return foodRecipesApi.getRecipes(queries)
    }
}