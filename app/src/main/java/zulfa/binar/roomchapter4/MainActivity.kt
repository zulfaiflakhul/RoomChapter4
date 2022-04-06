package zulfa.binar.roomchapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var mDBnew : StudentDataBase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDBnew = StudentDataBase.getInstance(this)

        fab_add.setOnClickListener {
            startActivity(Intent(this, AddStudentActivity::class.java))
        }

        getDataStudent()
    }

    fun getDataStudent() {

        rv_student.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        GlobalScope.launch {
            val listdata = mDBnew?.studentDao()?.getAllStudent()
            runOnUiThread {
                listdata.let {
                    val adapt = AdapterStudent(it!!)
                    rv_student.adapter = adapt
                }
            }
        }
    }
}