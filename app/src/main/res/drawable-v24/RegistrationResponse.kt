

package ke.co.hello

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import layout.SerializedName
import layout.Student

data class RegistrationResponse(
    @SerializedName("message") var message: String,
    ("student") var student: Student : : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        TODO("student")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int)
    parcel.writeString(message)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RegistrationResponse> {
        override fun createFromParcel(parcel: Parcel): RegistrationResponse {
            return RegistrationResponse(parcel)
        }

        override fun newArray(size: Int): Array<RegistrationResponse?> {
            return arrayOfNulls(size)
        }
    }
} Parcelab= Unit