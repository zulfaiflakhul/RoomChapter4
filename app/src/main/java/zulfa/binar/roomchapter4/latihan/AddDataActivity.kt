package zulfa.binar.roomchapter4.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_data.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import zulfa.binar.roomchapter4.R

class AddDataActivity : AppCompatActivity() {

    var dbmasyarakat : MasyarakatDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_data)

        dbmasyarakat = MasyarakatDatabase.getInstance(this)

        btn_tambahdata.setOnClickListener {

            GlobalScope.async {

                val nama = et_nama.text.toString()
                val alamat = et_alamat.text.toString()

                val hasil = dbmasyarakat?.masyarakatDao()?.InsertMasyarakat(Masyarakat(null, nama, alamat))

                runOnUiThread {
                    if (hasil != 0.toLong()){
                        Toast.makeText(this@AddDataActivity, "Succes", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this@AddDataActivity, "Failed", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        }
    }
}