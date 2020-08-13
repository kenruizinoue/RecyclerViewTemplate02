package com.kenruizinoue.recyclerviewtemplate02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAdapter = CustomAdapter(listOf("Test1", "Test2", "Test3", "Test4", "Test5"))
        myRecyclerView.apply {
            adapter = myAdapter
        }
    }
}