package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Farhan G. on 13/03/22.
 */
interface ApiService {
    @GET("list")
    fun getList(): Call<ListTourismResponse>
}