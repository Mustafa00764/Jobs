package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xr.jobs.R
import model.Horizantal

class HorizantalAdapter(var list: ArrayList<Horizantal>):RecyclerView.Adapter<HorizantalAdapter.HorizantalViewholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizantalViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizantal,parent,false)
        return  HorizantalViewholder(view)
    }

    override fun getItemCount() = list.size



    override fun onBindViewHolder(holder: HorizantalViewholder, position: Int) {
        val horizantal = list[position]
        holder.apply {
            tvbigtext.text = horizantal.bigtext
            tvminitext.text = horizantal.minitext

        }


    }
    class HorizantalViewholder(view: View):RecyclerView.ViewHolder(view){
        val tvbigtext = view.findViewById<TextView>(R.id.tv_big_text)
        val tvminitext = view.findViewById<TextView>(R.id.tv_mini_text)

    }
}