package com.ravi.foodstar.models


import com.google.gson.annotations.SerializedName
import com.ravi.foodstar.models.ExtendedIngredient

data class Result(
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int,
    @SerializedName("cheap")
    val cheap: Boolean,

    @SerializedName("dairyFree")
    val dairyFree: Boolean,

    @SerializedName("extendedIngredients")
    val extendedIngredients: List<ExtendedIngredient>,

    @SerializedName("glutenFree")
    val glutenFree: Boolean,

    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("license")
    val license: String,
    @SerializedName("likes")
    val likes: Int,
    @SerializedName("lowFodmap")
    val lowFodmap: Boolean,

    @SerializedName("occasions")
    val occasions: List<String>,
    @SerializedName("preparationMinutes")
    val preparationMinutes: Int,
    @SerializedName("pricePerServing")
    val pricePerServing: Double,
    @SerializedName("sourceName")
    val sourceName: String,
    @SerializedName("sourceUrl")
    val sourceUrl: String,

    @SerializedName("spoonacularSourceUrl")
    val spoonacularSourceUrl: String,
    @SerializedName("summary")
    val summary: String,

    @SerializedName("title")
    val title: String,
    @SerializedName("unusedIngredients")
    val unusedIngredients: List<Any>,
    @SerializedName("usedIngredientCount")
    val usedIngredientCount: Int,
    @SerializedName("usedIngredients")
    val usedIngredients: List<Any>,
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean,

    )