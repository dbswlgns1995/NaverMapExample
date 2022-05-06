package com.jihoonyoon.navermapexample

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/e1fd0b28-9eb9-4ce2-adec-28c67a969aef")
    fun getHouseList(): Call<HouseDto>
}