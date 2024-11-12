package com.example.tugas_retrofit.network

import com.example.tugas_retrofit.model.Whisky
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("api/auctions_data/")
    fun getAllWhisky() : Call<List<Whisky>>
}