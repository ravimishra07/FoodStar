package com.ravi.foodstar.data

import com.ravi.foodstar.data.network.FoodRecipesApi
import com.ravi.foodstar.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
// suspend function
    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipe(searchQuery: Map<String, String>): Response<FoodRecipe> {
        return  foodRecipesApi.searchRecipe(searchQuery)
    }
}