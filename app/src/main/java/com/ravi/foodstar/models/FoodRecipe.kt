package com.ravi.foodstar.models

import com.google.gson.annotations.SerializedName
import com.ravi.foodstar.models.Result

data class FoodRecipe(
    @SerializedName("results")
    val results: List<Result>
)