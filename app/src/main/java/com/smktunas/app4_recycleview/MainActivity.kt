package com.smktunas.app4_recycleview.utils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smktunas.app4_recycleview.R
import com.smktunas.app4_recycleview.adapter.BukuAdapter
import com.smktunas.app4_recycleview.model.Buku

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bukuAdapter: BukuAdapter
    private val bukuList = mutableListOf<Buku>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Layout utama yang berisi RecyclerView & tombol tambah

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Data contoh
        bukuList.add(Buku("Laskar Pelangi", "Andrea Hirata", "2005"))
        bukuList.add(Buku("Bumi", "Tere Liye", "2014"))
        bukuList.add(Buku("Negeri 5 Menara", "Ahmad Fuadi", "2009"))
        bukuList.add(Buku("Filosofi Kopi", "Dewi Lestari", "2006"))

        // Pasang adapter
        bukuAdapter = BukuAdapter(this, bukuList)
        recyclerView.adapter = bukuAdapter
    }
}
