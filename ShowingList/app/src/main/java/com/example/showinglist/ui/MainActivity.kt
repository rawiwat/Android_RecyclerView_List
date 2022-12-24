package com.example.showinglist.ui

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.showinglist.R
import com.example.showinglist.adapter.ConversationListAdapter
import com.example.showinglist.model.Conversation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = mutableListOf<Conversation>()

        val contactImage: Drawable? = ContextCompat.getDrawable(this,R.drawable.ic_action_name)
        if (contactImage != null){

            data.add(Conversation(contactImage,"Bill","Kekw",103175))
            data.add(Conversation(contactImage,"Bill","Kekw",103175))
            data.add(Conversation(contactImage,"Bill","Kekw",103175))
            data.add(Conversation(contactImage,"Bill","Kekw",103175))
            data.add(Conversation(contactImage,"Bill","Kekw",103175))
            data.add(Conversation(contactImage,"Bill","Kekw",103175))
            }

        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ConversationListAdapter(data)
        list_view.layoutManager = manager
        list_view.adapter = adapter
    }
}