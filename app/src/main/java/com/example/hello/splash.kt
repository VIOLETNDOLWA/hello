package com.example.hello

import ...

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val sharedPreferences = preferenceManager.getDefaultSharedpreference(baseContext)
        val accesToken =sharedpreerences.getString("ACCESS_TOKEN_KEY" "")

        if (accessToken.isNullorEmpty()) {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }else {
            val intent = Intent(baseContext,CourseActivity::class.java)
            startActivity(intent)
        }
    }
}