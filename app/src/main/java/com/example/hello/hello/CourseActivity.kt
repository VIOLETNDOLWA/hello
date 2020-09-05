

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.telecom.Call
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.row_courses_item.*
import retrofit2.Response
import javax.security.auth.callback.Callback

data class Courses(val course_id: Int, val course_name: String, val course_code: Int, val instructor:String, val description:String)
//data class Courses(val course_id: Int, val course_name: String, val course_code: Int, val instructor:String, val description:String)

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        rvCourses.LayoutManager = LinearLayoutManager(baseContext)
        val coursesRecyclerViewAdapter = CoursesRecyclerViewAdapter(coursesList = listOf(
            fetchCourses()

                    Courses(20,"Design",57,"Jane","Creativity"),
            Courses(10,"Kotlin",101,"John","Android Development"),
            Courses(25,"Python",102,"James","Databases"),
            Courses(64,"Html/Css",103,"Jeff","Web Development"),
            Courses(17,"Javascript",104,"Purity","React"),
            Courses(20,"Navigating",105,"Veronica","Navigation"),
            Courses(19,"Product Design",107,"Barre","Drafting"),
            Courses(37,"Entreprenuership",108,"Kelly ","Finance"),
            Courses(50,"Hardware Electronics",109,"Barre","Arduino")
    }
    fun fetchCourses() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
        val accessToken = sharedPreferences.getString("ACCESS_TOKEN_KEY", "")

        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val coursesCall = apiClient.getCourses("Bearer " + accessToken)
        coursesCall.enqueue(object : Callback<CoursesResponse> {
            override fun onFailure(call: Call<CoursesResponse>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
            }

            ))
            rvCourses.adapter=CoursesRecyclerViewAdapter
            override fun onResponse(
                call: Call<CoursesResponse>,
                response: Response<CoursesResponse>
            ) {
                if (response.isSuccessful) {
                    var courseList = response.body()?.courses as List<Course>
                    var coursesAdapter = CoursesRecyclerViewAdapter(courseList)
                    rvCourses.layoutManager = LinearLayoutManager(baseContext)
                    rvCourses.adapter = coursesAdapter
                } else {
                    Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                        .show()
                }
            }
        })
    }

}
