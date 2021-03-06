package com.example.mvvpfoodjetpackcompose.network.model

import com.google.gson.annotations.SerializedName

data class RecipeNetworkEntity(

    @SerializedName("pk")
    val pk : Int? = null,
    @SerializedName("title")
    val title : String? = null,
    @SerializedName("publisher")
    val publisher : String? = null,
    @SerializedName("featuredImage")
    val featuredImage : String? = null,
    @SerializedName("rating")
    val rating : Int? = null,
    @SerializedName("sourceUrl")
    val sourceUrl : String? = null,
    @SerializedName("description")
    val description : String? = null,
    @SerializedName("cookingInstructions")
    val cookingInstructions : String? = null,
    @SerializedName("ingredients")
    val ingredients : List<String>? = null,
    @SerializedName("dateAdded")
    val dateAdded : String? = null,
    @SerializedName("dateUpdated")
    val dateUpdated : String? = null,


)