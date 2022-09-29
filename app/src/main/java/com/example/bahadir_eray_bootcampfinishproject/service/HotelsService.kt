package com.example.bahadir_eray_bootcampfinishproject.service

import com.example.bahadir_eray_bootcampfinishproject.data.model.hotels.HotelsModel
import com.example.bahadir_eray_bootcampfinishproject.service.HotelsAPI.Companion.API_HOST
import com.example.bahadir_eray_bootcampfinishproject.service.HotelsAPI.Companion.API_KEY
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class HotelsService {

    private val BASE_URL = "https://hotels4.p.rapidapi.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(HotelsAPI::class.java)

    fun getHotels(): Single<List<HotelsModel>> {
        return api.getData(API_HOST, API_KEY)
    }
}