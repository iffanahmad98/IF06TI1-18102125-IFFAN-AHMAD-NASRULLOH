package com.iffan_18102125.praktikum10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iffan_18102125.praktikum10.adapter.QuoteAdapter
import com.iffan_18102125.praktikum10.databinding.ActivityMainBinding
import com.iffan_18102125.praktikum10.db.QuoteHelper

class MainActivity : AppCompatActivity() {
    private lateinit var quoteHelper: QuoteHelper
    private lateinit var adapter: QuoteAdapter
    private val EXTRA_STATE = "EXTRA_STATE"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
