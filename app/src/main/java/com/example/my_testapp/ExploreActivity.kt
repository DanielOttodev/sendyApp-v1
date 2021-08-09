package com.example.my_testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_explore.*
import kotlinx.android.synthetic.main.row.*

class ExploreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model(title = "News Feed",des="This is news feed desc",R.drawable.abc_vector_test))
        val myAdapter = MyAdapter(arrayList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}