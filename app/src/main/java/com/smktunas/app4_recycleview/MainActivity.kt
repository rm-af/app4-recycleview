package com.smktunas.app4_recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smktunas.app4_recycleview.adapter.BukuAdapter
import com.smktunas.app4_recycleview.model.Buku
import com.smktunas.app4_recycleview.utils.DummyData

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bukuAdapter: BukuAdapter
    private lateinit var listBuku: MutableList<Buku>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Ambil data dari DummyData
        listBuku = DummyData.listBuku.toMutableList()

        // Panggil BukuAdapter sesuai constructor yang kamu buat
        bukuAdapter = BukuAdapter(this, listBuku)

        recyclerView.adapter = bukuAdapter
    }
}
