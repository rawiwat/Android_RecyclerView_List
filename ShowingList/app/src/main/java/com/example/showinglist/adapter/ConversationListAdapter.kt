package com.example.showinglist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.showinglist.R
import com.example.showinglist.model.Conversation
import kotlinx.coroutines.NonDisposableHandle.parent

class ConversationListAdapter(val data: MutableList<Conversation>): RecyclerView.Adapter<ConversationListAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
    val image: ImageView = view.findViewById(R.id.convo_image)
    val name: TextView = view.findViewById(R.id.convo_name)
    val message: TextView = view.findViewById(R.id.convo_text)
    val time: TextView = view.findViewById(R.id.convo_time)
        }
    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.conversation_layout,parent,false)

        return ViewHolder(viewGroup)
        }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.message.text = data[position].message
        holder.name.text = data[position].name
        holder.time.text = data[position].time.toString()
        holder.image.setImageDrawable(data[position].image)
    }
}