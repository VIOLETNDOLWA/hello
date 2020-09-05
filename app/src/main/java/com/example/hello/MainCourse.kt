package ke,co.hello
import androidx.annotion.NonNull
import androidx..room.Entity
import androidx.room.primarKey
import com,google.gson,annotation,SerializedName


@Entity(tableName = "course")
data class Course (
    @Primarly @NonNull @SerializeName(value: "Course_id")var CourseId: String
    @Primarly @NonNull @SerializeName(value: "Course_name")var CourseName: String
    @Primarly @NonNull @SerializeName(value: "Course_code")var CourseCode: String
    @Primarly @NonNull @SerializeName(value: "instructor")var instructor: String
    @Primarly @NonNull @SerializeName(value: "description")var Coursedescription: String




)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_course)
    }
}
