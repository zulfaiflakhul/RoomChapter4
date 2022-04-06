package zulfa.binar.roomchapter4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_student.view.*

class AdapterStudent(val listdata: List<Student>) : RecyclerView.Adapter<AdapterStudent.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterStudent.ViewHolder {
        val viewitem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)
        return ViewHolder(viewitem)
    }

    override fun onBindViewHolder(holder: AdapterStudent.ViewHolder, position: Int) {
        holder.itemView.tv_idStudent.text = listdata[position].id.toString()
        holder.itemView.tv_namaStudent.text = listdata[position].nama
        holder.itemView.tv_emailStudent.text = listdata[position].email
    }

    override fun getItemCount(): Int {
        return listdata.size
    }
}