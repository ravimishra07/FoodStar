package com.ravi.foodstar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ravi.foodstar.databinding.RecipesRowLayoutBinding
import com.ravi.foodstar.models.FoodRecipe
import com.ravi.foodstar.models.Result
import com.ravi.foodstar.util.RecipesDiffUtil

class RecipesAdapter : RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {

    private var recipes = emptyList<Result>()

    class MyViewHolder(private val binding: RecipesRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(result: Result){
                binding.result = result
                binding.executePendingBindings()
            }

        companion object{
            fun from(parent: ViewGroup):MyViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RecipesRowLayoutBinding.inflate(layoutInflater, parent, false)
                return  MyViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentRecipe = recipes[position]
        holder.bind(currentRecipe)

    }

    override fun getItemCount(): Int {
        return recipes.size
    }
    fun setData(newData: FoodRecipe){
        val recipeDiffUtil = RecipesDiffUtil(recipes,newData.results)
        val diffUtilResult  = DiffUtil.calculateDiff(recipeDiffUtil)
        recipes = newData.results
        diffUtilResult.dispatchUpdatesTo(this)
    }
}