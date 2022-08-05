package com.tulsi.notesapp.api

import com.tulsi.notesapp.model.UserRequest
import com.tulsi.notesapp.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface api {

    @POST("")
    suspend fun  signup(@Body userRequest: UserRequest):Response<UserResponse>

    @POST("")
    suspend fun  singin(@Body userRequest: UserRequest):Response<UserResponse>

}