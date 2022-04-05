package zulfa.binar.roomchapter4.latihan

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Masyarakat(
    @PrimaryKey(autoGenerate = true)
    var id : Int?,

    @ColumnInfo(name = "nama")
    val nama : String,

    @ColumnInfo(name = "alamat")
    val alamat : String
) : Parcelable
