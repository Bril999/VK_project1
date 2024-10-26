package org.dc.brildmitry.vk_project1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton
    private val adapter = MyAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycle_view)
        recyclerView.adapter = adapter
        fab = findViewById(R.id.fab)
        fab.setOnClickListener {
            adapter.addItems(adapter.itemCount + 1)
            recyclerView.smoothScrollToPosition(adapter.itemCount)
        }
        if (savedInstanceState != null) {
            val positions = savedInstanceState.getIntegerArrayList("positions")
            if (positions != null) {
                adapter.setItems(positions)
            }
        } else {
            adapter.setItems(listOf())
        }
        
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val positions = adapter.getItemPositions()
        outState.putIntegerArrayList("positions", positions)
    }
}
