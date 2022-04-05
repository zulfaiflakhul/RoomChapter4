package zulfa.binar.roomchapter4.latihan

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface MasyarakatDao {

    @Insert
    fun InsertMasyarakat(masyarakat: Masyarakat) : Long
}