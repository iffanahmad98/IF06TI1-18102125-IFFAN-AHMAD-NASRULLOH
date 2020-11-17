package com.iffan_18102125.praktikum6

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.iffan_18102125.praktikum6.adapter.GridMyDataAdapter
import com.iffan_18102125.praktikum6.adapter.ListMyDataAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<MyData>()
    fun getListMyDatas(): ArrayList<MyData> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listMyData = ArrayList<MyData>()
        for (position in dataName.indices) {
            val myData = MyData(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listMyData.add(myData)
        }
        return listMyData
    }

    private fun showRecyclerList() {
        rv_mydata.layoutManager = LinearLayoutManager(this)
        val listMyDataAdapter = ListMyDataAdapter(list)
        rv_mydata.adapter = listMyDataAdapter
    }

    private fun showRecyclerGrid() {
            rv_mydata.layoutManager = GridLayoutManager(this, 2)
            val gridMyDataAdapter = GridMyDataAdapter(list)
            rv_mydata.adapter = gridMyDataAdapter

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_mydata.setHasFixedSize(true)
        list.addAll(getListMyDatas())
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
            }
        }
    }
}
