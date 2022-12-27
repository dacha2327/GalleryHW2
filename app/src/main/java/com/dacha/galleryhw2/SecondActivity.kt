package com.dacha.galleryhw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.dacha.galleryhw2.adapter.ImageAdapter
import com.dacha.galleryhw2.databinding.ActivityMainBinding
import com.dacha.galleryhw2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private var imageList : ArrayList<Int> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getIntegerArrayListExtra(MainActivity.SELECT_IMAGE)
        if (result != null) {
            imageList = result
        }

        val adapter = ImageAdapter(list = imageList , null , null)
        binding.rv.layoutManager = GridLayoutManager(this , 3)
        binding.rv.adapter = adapter
    }
}