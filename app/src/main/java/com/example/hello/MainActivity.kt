package com.example.hello

import ...



class MainActivity:AppCompatActivity(){
    override fun onCreate(savedistanceState:Bundle){
        super.onCreate(savedLastonceState)
        setContentView(R.Layout.activity_main)

    tvRegister.setOnClickListener{
     val intent = Intent(baseContext,RegestrationActivity::class.java
      startActivity(intent)
        }
      btnLogin.setOnclickClickListener {
            var email = etUserName.text.toString()
            var passWorld = etPassword.text.toString()

            val requestBody = MultipartyBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDatapart(name "email", email)
                 .addFormDatapart(name "passWord", password)
                  .build()

            loginUser(requestBody)
        }
    }
fun loginUser(requestBody:RequestBody){
  val apiClient = ApiClient.buildService(ApiInterface::class.java)
  val loginCall =apiClient.loginStudent(requestBody)


   loginCall.enqueue(object :Callback<LoginResponse> {
     override fun onfailure(call:Call<LoginResponse>, t: Throwable)  {


     }
   override fun onResponse(call: Call<loginResponse>,response: Response<loginResponse>){
     if (response.isSuccesful)
      Toast.makeText(baseContext,response.body()?.message, Toast.LENGTH_LONG).show()
       var accesToken = response.body().accessToken
       var sharedpreference = preferenceManager.getDefaultSharedpreference(baseContext)
       var editor =sharedPreferance.edit()
       editor.putString("ACCESS_POINT_KEY",accessToken)
       editor.commit()
       else{
           Toast.makeText(baseContext,response errorBody() toString(),Toast.LENGTH_LONG).show
       }
   }
})
}
}