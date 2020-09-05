package ke.co.hello.database


import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import androidx.room.RoomDatabase
import ke.co.hello.models.Course

@Database(entities = arrayOf(Course::class), version = 1)
abstract class HelloDatabase: RoomDatabase() {
    abstract fun courseDao(): CourseDao
}