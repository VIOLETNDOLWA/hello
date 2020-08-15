package layout

data class Student(
@seriallized(value"student_id")var stuent:Student:String,
@SerializedName(value "first_name")var firstName:String,
@ SerializedName(value "last_name")var lastName:String,
@ SerializedName(value "email")var email:String,
@SerializedName(value "phone_number")var phoneNumber:String,
@SerializedName (value "imageurl")var imageurl:String,
)
annotation class SerializedName(val value :String)