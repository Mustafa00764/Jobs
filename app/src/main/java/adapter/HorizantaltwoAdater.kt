package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xr.jobs.R
import model.Horizantaltwo

 class HorizantaltwoAdater(var list: ArrayList<Horizantaltwo>): RecyclerView.Adapter<HorizantaltwoAdater.HorizantaltwoViewholder>() {



     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizantaltwoViewholder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizantal_two,parent,false)
         return HorizantaltwoViewholder(view)
     }

     override fun getItemCount() = list.size


     override fun onBindViewHolder(holder: HorizantaltwoViewholder, position: Int) {
         val horizantaltwo = list[position]
         holder.apply {
             tvbigtexttwo.text = horizantaltwo.bigtexttwo
             tvminitexttwo.text = horizantaltwo.minitexttwo

         }
     }
     class HorizantaltwoViewholder(view: View): RecyclerView.ViewHolder(view){
         val tvbigtexttwo = view.findViewById<TextView>(R.id.tv_big_text_two)
         val tvminitexttwo = view.findViewById<TextView>(R.id.tv_mini_text_two)

     }
 }