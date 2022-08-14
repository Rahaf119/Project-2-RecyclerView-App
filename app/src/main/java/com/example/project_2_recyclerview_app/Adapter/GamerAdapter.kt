package com.example.project_2_recyclerview_app.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Games

class GamerAdapter(
    private val context :Context ,
    private val dataSet : List<Games>
): RecyclerView.Adapter<GamerAdapter.GamerViewHolder>() {

    class GamerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
         val textView : TextView = view.findViewById(R.id.item_txt)
        val imageView:ImageView=view.findViewById(R.id.item_img)
    }//end GamerViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : GamerViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)
        return GamerViewHolder(adapterLayout)
    }// end onCreateViewHolder

    override fun onBindViewHolder(holder: GamerViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)

    }//End onBindViewHolder

    override fun getItemCount(): Int {
       return dataSet.size
    }
}// End class GamerAdapter