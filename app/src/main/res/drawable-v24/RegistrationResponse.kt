

package ke.co.hello

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class RegistrationResponse(
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student : Parcelab= Unit