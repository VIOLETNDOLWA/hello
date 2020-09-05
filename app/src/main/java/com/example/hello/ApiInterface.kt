package com.example.hello

import com.example.Hello.RegistrationResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
@@ -10,6 +11,7 @@ interface ApiInterface {
    @POST("register")

    fun registerStudent(@Body requestBody: RequestBody): Call<RegistrationResponse>
    abstract fun getCourses(s: String): Any
}
