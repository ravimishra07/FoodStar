package com.ravi.foodstar.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ravi.foodstar.models.FoodRecipe
import com.ravi.foodstar.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}