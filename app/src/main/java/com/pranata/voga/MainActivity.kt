package com.pranata.voga

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.pranata.voga.databinding.ActivityMainBinding
import pranata.voga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {

        val imm = getSystemService(INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(p0?.windowToken, 0)

        val input_uang = binding.etUang.text.toString().trim()
        val input_tenor = binding.etTenor.text.toString().trim()

        var biaya_layanan = input_uang.toDouble() * 0.05
        var totalUangCair = input_uang.toDouble() - biaya_layanan

        var bunga = input_tenor.toDouble() * 0.0375
        var uang_bayar = input_uang.toDouble() + (input_uang.toDouble() * bunga)

        binding.tvTotalBayar.text = uang_bayar.toString()
        binding.tvDanaCair.text = totalUangCair.toString()
    }
}