package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xr.jobs.R
import model.Vertical

class VerticalAdapter(var list:ArrayList<Vertical>):RecyclerView.Adapter<VerticalAdapter.VerticalViewholder>() {
    class VerticalViewholder(view: View):RecyclerView.ViewHolder(view){
        val vibor = view.findViewById<TextView>(R.id.tv_vibor)
        val green_text1 = view.findViewById<TextView>(R.id.tv_green_text1)
        val grye_text1 = view.findViewById<TextView>(R.id.tv_grey_text1)
        val money1 = view.findViewById<TextView>(R.id.tv_money1)
        val money2 = view.findViewById<TextView>(R.id.tv_money2)
        val grye_text2 = view.findViewById<TextView>(R.id.tv_grey_text2)
        val grye_text3 = view.findViewById<TextView>(R.id.tv_grey_text3)
        val green_text2 = view.findViewById<TextView>(R.id.tv_green_text2)
        val hello = view.findViewById<TextView>(R.id.tv_hello)
        val text_in_oval1 = view.findViewById<TextView>(R.id.tv_text_in_oval1)
        val text_in_oval2 = view.findViewById<TextView>(R.id.tv_text_in_oval2)
        val text_in_oval3 = view.findViewById<TextView>(R.id.tv_text_in_oval3)
        val black_text2 = view.findViewById<TextView>(R.id.tv_black_text2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical,parent,false)
        return VerticalViewholder(view)
    }

    override fun getItemCount()=list.size



    override fun onBindViewHolder(holder: VerticalViewholder, position: Int) {
        val vertical = list[position]
        holder.apply {
            vibor.text = vertical.vibor
            green_text1.text = vertical.green_text1
            green_text2.text = vertical.green_text2
            grye_text1.text = vertical.grye_text1
            grye_text2.text = vertical.grey_text2
            grye_text3.text = vertical.grey_text3
            money1.text = vertical.money1
            money2.text = vertical.money2
            hello.text = vertical.hello
            text_in_oval1.text = vertical.text_in_oval1
            text_in_oval2.text = vertical.text_in_oval2
            text_in_oval3.text = vertical.text_in_oval3
            black_text2.text = vertical.black_text2


        }
    }
}