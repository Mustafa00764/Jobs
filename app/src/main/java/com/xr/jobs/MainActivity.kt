package com.xr.jobs

import adapter.HorizantalAdapter
import adapter.HorizantaltwoAdater
import adapter.VerticalAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.Horizantal
import model.Horizantaltwo
import model.Vertical

class MainActivity : AppCompatActivity() {
    lateinit var horizantalList:ArrayList<Horizantal>
    lateinit var horizantaltwoList:ArrayList<Horizantaltwo>
    lateinit var verticalList:ArrayList<Vertical>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        verticalView()
    }

    private fun verticalView() {
        verticalList()
       val rvvertical = findViewById<RecyclerView>(R.id.rv_vertical)
        rvvertical.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvvertical.adapter = VerticalAdapter(list = verticalList)
    }

    private fun verticalList() {
        verticalList = ArrayList()
        verticalList.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account",""))
    }

    private fun initView() {
        loadList()
        val rvhorizantal = findViewById<RecyclerView>(R.id.rv_horizantal)
        val rvhorizantaltwo = findViewById<RecyclerView>(R.id.rv_horizantal)
        rvhorizantaltwo.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvhorizantaltwo.adapter = HorizantaltwoAdater(list = horizantaltwoList)
        rvhorizantal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rvhorizantal.adapter = HorizantalAdapter(list = horizantalList)
//        val rvSearch = findViewById<RecyclerView>(R.id.rv_search)
//        rvSearch.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
//        rvSearch.adapter = SeachAdapter(list = searchList)
    }

    private fun loadList() {
        horizantalList = ArrayList()
        horizantaltwoList = ArrayList()
        horizantalList.add(Horizantal("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))
        horizantaltwoList.add(Horizantaltwo("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))
        horizantaltwoList.add(Horizantaltwo("My proposals","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))


    }
}