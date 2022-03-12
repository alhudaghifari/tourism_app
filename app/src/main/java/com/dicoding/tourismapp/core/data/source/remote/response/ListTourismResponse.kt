package com.dicoding.tourismapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Farhan G. on 13/03/22.
 */
data class ListTourismResponse(

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String,

    @field:SerializedName("places")
    val places: List<TourismResponse>
)