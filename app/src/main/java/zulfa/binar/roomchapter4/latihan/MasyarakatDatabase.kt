package zulfa.binar.roomchapter4.latihan

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import zulfa.binar.roomchapter4.StudentDataBase

@Database(entities = [Masyarakat::class], version = 1)
abstract class MasyarakatDatabase : RoomDatabase () {

    abstract fun masyarakatDao() : MasyarakatDao

    companion object {
        private var INSTANCE: MasyarakatDatabase? = null
        fun getInstance(context: Context): MasyarakatDatabase? {
            if (INSTANCE == null) {
                synchronized(MasyarakatDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        MasyarakatDatabase::class.java, "Masyarakat.db"
                    ).build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}