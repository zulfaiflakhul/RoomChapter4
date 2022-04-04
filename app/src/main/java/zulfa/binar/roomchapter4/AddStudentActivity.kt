package zulfa.binar.roomchapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_student.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class AddStudentActivity : AppCompatActivity() {

    var dbstudent : StudentDataBase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        dbstudent = StudentDataBase.getInstance(this)

        btn_savestudent.setOnClickListener {

            GlobalScope.async {

                val nama = et_namastudent.text.toString()
                val email = et_emailstudent.text.toString()

                val hasil = dbstudent?.studentDao()?.insertStudent(Student(null, nama, email))

                runOnUiThread {
                    if (hasil != 0.toLong()){
                        Toast.makeText(this@AddStudentActivity, "Succes", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@AddStudentActivity, "Failed", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }
}