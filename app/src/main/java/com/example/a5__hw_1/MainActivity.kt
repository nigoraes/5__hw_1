package com.example.a5__hw_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5__hw_1.databinding.ActivityMainBinding
import com.example.a5__hw_1.ut.showToast

class MainActivity : AppCompatActivity(),CounterView {
    private lateinit var binding: ActivityMainBinding
    var count = 0
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
        toast()

    }
    private fun initClickers() {
        with(binding) {
            add.setOnClickListener {
                presenter.incrementCount()
            }
            minus.setOnClickListener {
                presenter.decrementCount()
            }
        }
    }
    override fun updateText(count: String) {
        binding.result.text = count
    }
    override fun toast() {
        this.showToast("Поздравляю")
    }
    override fun color() {
        binding.result.setTextColor(Color.GREEN)
    }
}