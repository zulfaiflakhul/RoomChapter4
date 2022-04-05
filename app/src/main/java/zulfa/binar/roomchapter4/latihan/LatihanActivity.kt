package zulfa.binar.roomchapter4.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan.*
import zulfa.binar.roomchapter4.R

class LatihanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan)

        btn_tambah.setOnClickListener {
            startActivity(Intent(this, AddDataActivity::class.java))
        }
    }
}