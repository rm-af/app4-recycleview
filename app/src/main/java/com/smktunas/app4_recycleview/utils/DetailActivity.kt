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

        val judul = intent.getStringExtra("judul") ?: "Tidak ada judul"
        val penulis = intent.getStringExtra("penulis") ?: "Tidak ada penulis"
        val tahun = intent.getStringExtra("tahun") ?: "Tidak ada tahun"

        tvJudul.text = judul
        tvPenulis.text = penulis
        tvTahun.text = tahun
    }
}
