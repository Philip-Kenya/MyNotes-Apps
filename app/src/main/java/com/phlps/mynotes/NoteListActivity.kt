package com.phlps.mynotes

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val launchEditNote=Intent(this,MainActivity::class.java)
            startActivity(launchEditNote)
        }
        listItems.layoutManager=LinearLayoutManager(this )
        listItems.adapter=NoteRecyclerAdapter(this, DataManager.notes)

    }

    override fun onResume() {
        super.onResume()
        listItems.adapter?.notifyDataSetChanged()

    }
}