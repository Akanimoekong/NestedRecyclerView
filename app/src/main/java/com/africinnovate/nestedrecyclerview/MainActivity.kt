package com.africinnovate.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.categories_list_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentRecyclerView : RecyclerView = findViewById(R.id.parent_recyclerview)

        //Wedding recyclerview
        parentRecyclerView.setHasFixedSize(true)
        val categoriesAdapter : CategoriesAdapter = CategoriesAdapter(this)
        parentRecyclerView.adapter = categoriesAdapter
        parentRecyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        categoriesAdapter.setData(DataSource.data())

    }
}