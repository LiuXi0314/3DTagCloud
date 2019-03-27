package com.liuxi.tagcloud

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var adapter = TagAdapter()
        for (i in 1..50) {
            adapter.array.add("Girl $i")
        }
        tagCloudView.setAdapter(adapter)
        adapter.notifyDataSetChanged()
    }
}
