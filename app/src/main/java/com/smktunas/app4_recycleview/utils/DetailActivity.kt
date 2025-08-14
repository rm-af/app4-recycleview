package com.smktunas.app4_recycleview.utils

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.smktunas.app4_recycleview.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_buku)

        val tvJudul: TextView = findViewById(R.id.tvJudul)
        val tvPenulis: TextView = findViewById(R.id.tvPenulis)
        val tvTahun: TextView = findViewById(R.id.tvTahun)

        // Ambil data dari intent
        val judul = intent.getStringExtra("buku_judul")
        val penulis = intent.getStringExtra("buku_penulis")
        val tahun = intent.getStringExtra("buku_tahun")

        // Tampilkan ke TextView
        tvJudul.text = judul
        tvPenulis.text = penulis
        tvTahun.text = tahun
    }
}
