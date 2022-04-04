package zulfa.binar.roomchapter4

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface StudentDao {

    @Insert
    fun insertStudent(student: Student) : Long
}