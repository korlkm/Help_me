package com.example.help_me

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var recyclerView2: RecyclerView
    private lateinit var viewAdapter2: RecyclerView.Adapter<*>
    private lateinit var viewManager2: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profile: ImageView = findViewById(R.id.profile)
        var a: Uri ?= null

        // 이미지뷰 클릭 시 엑티비티 전환
         profile.setOnClickListener {
//            val intent = Intent(this, SubActivity::class.java)
//            startActivity(intent)
        }

//        // 1
//        viewManager2 = LinearLayoutManager(this, HORIZONTAL, true)
//        // 2
//        viewAdapter2 = ListAdapterHorizontal()
//
//        // 3
//        recyclerView2 = findViewById<RecyclerView>(R.id.recyclerHorizon).apply {
//            // use this setting to improve performance if you know that changes
//            // in content do not change the layout size of the RecyclerView
//            setHasFixedSize(true)
//            // use a linear layout manager
//            layoutManager = viewManager2
//            // specify an viewAdapter (see also next example)
//            adapter = viewAdapter2
//
//        }

//        // 1
//        viewManager = LinearLayoutManager(this, VERTICAL, true)
//        // 2
//        viewAdapter = MainRecyclerAdapter()
//
//        // 3
//        recyclerView = findViewById<RecyclerView>(R.id.recyclerview_main).apply {
//            // use this setting to improve performance if you know that changes
//            // in content do not change the layout size of the RecyclerView
//            setHasFixedSize(true)
//            // use a linear layout manager
//            layoutManager = viewManager
//            // specify an viewAdapter (see also next example)
//            adapter = viewAdapter



        val recyclerview_list = findViewById<RecyclerView>(R.id.recyclerHorizon)

        val cateList = ArrayList<ListItem>()


        cateList.add(ListItem("And"))
        cateList.add(ListItem("Web"))
        cateList.add(ListItem("ios"))
        cateList.add(ListItem("Sever"))
        cateList.add(ListItem("Ai"))
        cateList.add(ListItem("Design"))


        val listAdapter = ListAdapter(cateList)
        listAdapter.notifyDataSetChanged()

        recyclerview_list.adapter = listAdapter
        recyclerview_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)












        val recyclerview_main = findViewById<RecyclerView>(R.id.recyclerview_main)

        val itemList = ArrayList<MainItem>()


        itemList.add(MainItem(a, "이경민", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "And"))
        itemList.add(MainItem(a, "김명준", "응아니야 봉구스봉구스봉구스봉구스봉구스밥버거 보연유혁녹.셔홍겨ㅏ", "Web"))
        itemList.add(MainItem(a, "최시훈", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "ios"))
        itemList.add(MainItem(a, "장범준", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "Sever"))
        itemList.add(MainItem(a, "황주완", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "Ai"))
        itemList.add(MainItem(a, "모성현", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "Design"))
        itemList.add(MainItem(a, "이경민", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "And"))
        itemList.add(MainItem(a, "이경민", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "And"))
        itemList.add(MainItem(a, "이경민", "으으으으으으으ㅡ으으으으으으으아누러뉴러ㅏㅠㅓㅣㅏㄴ류ㅓㅏㅠ너ㅠ러ㅏ뉴ㅓㅏ", "And"))



        val mainAdapter = MainRecyclerAdapter(itemList)
        mainAdapter.notifyDataSetChanged()

        recyclerview_main.adapter = mainAdapter
        recyclerview_main.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        }
    }

