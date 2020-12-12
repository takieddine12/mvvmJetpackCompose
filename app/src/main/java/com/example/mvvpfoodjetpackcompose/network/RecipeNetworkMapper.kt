package com.example.mvvpfoodjetpackcompose.network

import com.example.mvvpfoodjetpackcompose.domain.model.Recipe
import com.example.mvvpfoodjetpackcompose.domain.util.EntityMapper
import com.example.mvvpfoodjetpackcompose.network.model.RecipeNetworkEntity

class RecipeNetworkMapper : EntityMapper<RecipeNetworkEntity,Recipe> {

    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
                id = entity.pk,
                title = entity.title,
                publisher = entity.publisher,
                featuredImage = entity.featuredImage,
                rating = entity.rating,
                sourceUrl = entity.sourceUrl,
                description = entity.description,
                cookingInstructions = entity.cookingInstructions,
                ingredients = entity.ingredients,
                dateAdded = entity.dateAdded,
                dateUpdated = entity.dateUpdated
        )
    }

    override fun mapToEntity(domainModel: Recipe): RecipeNetworkEntity {
        return  RecipeNetworkEntity(
                pk = domainModel.id,
                title = domainModel.title,
                publisher = domainModel.publisher,
                featuredImage = domainModel.featuredImage,
                rating = domainModel.rating,
                sourceUrl = domainModel.sourceUrl,
                description =  domainModel.description,
                cookingInstructions = domainModel.cookingInstructions,
                ingredients = domainModel.ingredients?: listOf(),
                dateAdded = domainModel.dateAdded,
                dateUpdated = domainModel.dateUpdated
        )
    }

    fun mapToRecipeList(initial : List<RecipeNetworkEntity>) : List<Recipe> {
        return initial.map {
             mapFromEntity(it)
        }
    }
    fun mapToNetworkEntityList(initial: List<Recipe>) : List<RecipeNetworkEntity>{
       return initial.map {
            mapToEntity(it)
       }
    }

}