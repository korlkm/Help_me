package com.example.help_me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.VERTICAL

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var recyclerView2: RecyclerView
    private lateinit var viewAdapter2: RecyclerView.Adapter<*>
    private lateinit var viewManager2: RecyclerView.LayoutManager
    private var list = mutableListOf<ListAdapterHorizontal>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profile: ImageView = findViewById(R.id.profile)

        // 이미지뷰 클릭 시 엑티비티 전환
         profile.setOnClickListener {
//            val intent = Intent(this, SubActivity::class.java)
//            startActivity(intent)
        }

        // 1
        viewManager2 = LinearLayoutManager(this, HORIZONTAL, true)
        // 2
        viewAdapter2 = ListAdapterHorizontal()

        // 3
        recyclerView2 = findViewById<RecyclerView>(R.id.recyclerHorizon).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)
            // use a linear layout manager
            layoutManager = viewManager2
            // specify an viewAdapter (see also next example)
            adapter = viewAdapter2

        }

        // 1
        viewManager = LinearLayoutManager(this, VERTICAL, true)
        // 2
        viewAdapter = MainRecyclerAdapter()

        // 3
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview_main).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)
            // use a linear layout manager
            layoutManager = viewManager
            // specify an viewAdapter (see also next example)
            adapter = viewAdapter

        }
    }
}