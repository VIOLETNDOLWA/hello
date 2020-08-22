package com.example.hello

import com.google.gson.annotations.SerializedName
import layout.SerializedName

data class LoginResponse(
    @SerializedName("access_token") var accessToken: String,
    @SerializedName("message") var message: String
)

