📚 Project RecyclerView - Daftar Buku Perpustakaan
-
Materi ini membahas pembuatan aplikasi Android sederhana bertema Daftar Buku Perpustakaan menggunakan Android Studio dengan beberapa fitur utama, yaitu Splash Screen sebagai tampilan pembuka, RecyclerView untuk menampilkan daftar buku, Intent untuk navigasi antar Activity, Toast sebagai notifikasi singkat, dan Dialog Box untuk konfirmasi.

---

👥 Tim
-
1. a
2. a
3. a
4. a
5. a

---

🔧 Teknologi
-
- Kotlin

- Android Studio

- RecyclerView + CardView

- Git & GitHub

---

📱 Fitur yang Ada
-
📂 Splash Screen
---
<img width="694" height="478" alt="Screenshot 2025-08-19 155828" src="https://github.com/user-attachments/assets/38cde642-ba8a-4f3e-af8e-fbe577673c52" />

---

Kode di atas merupakan file layout XML untuk menampilkan Splash Screen aplikasi. Splash Screen adalah tampilan pembuka aplikasi yang muncul beberapa detik sebelum masuk ke halaman utama.

LinearLayout digunakan sebagai root layout dengan orientasi vertical dan posisi konten diatur ke tengah layar menggunakan android:gravity="center".

Latar belakang diatur menjadi warna putih dengan android:background="@color/white".

Di dalamnya terdapat sebuah ImageView berukuran 400dp x 400dp yang menampilkan gambar/logo aplikasi dari file drawable (@drawable/c).

ID @+id/imgSplash diberikan agar komponen dapat diakses dari kode Kotlin di SplashScreen.kt.

tools:context=".SplashScreen" menunjukkan bahwa layout ini digunakan pada Activity SplashScreen.


⚙️ Cara Kerja

Saat aplikasi dijalankan, SplashActivity akan memanggil layout ini (activity_splash.xml).

Gambar/logo yang ada pada @drawable/c akan ditampilkan di tengah layar.

Activity ini biasanya dikombinasikan dengan logika timer delay (Handler/Coroutine/Animation) agar logo muncul selama 2–3 detik.

Setelah itu, aplikasi otomatis berpindah ke MainActivity menggunakan Intent.

---

📂 RecyclerView
---
<img width="647" height="447" alt="Screenshot 2025-08-19 155952" src="https://github.com/user-attachments/assets/3f4d21f9-616f-4801-9039-bf72edbdcaf9" />

---

ConstraintLayout

Sebagai root layout.

Lebar & tinggi match_parent → memenuhi seluruh layar.

Menggunakan tools:context=".MainActivity" agar otomatis terhubung ke MainActivity.

RecyclerView

ID: @+id/recyclerView (digunakan untuk memanggil di MainActivity).

Lebar (layout_width) dan tinggi (layout_height) diatur 0dp, karena ukurannya mengikuti constraint (batas atas, bawah, kiri, kanan ke parent).

app:layout_constraint... memastikan RecyclerView menempel di seluruh sisi parent, sehingga tampil full screen.

RecyclerView adalah komponen Android yang digunakan untuk menampilkan daftar data (list/grid) secara efisien.

Layout di atas menyiapkan wadah kosong RecyclerView full screen yang nanti akan diisi dengan data melalui Adapter di kode Kotlin/Java.

File XML ini berfungsi untuk mendefinisikan tampilan halaman utama yang berisi RecyclerView. RecyclerView ditempatkan di dalam ConstraintLayout dan diposisikan memenuhi layar agar siap digunakan untuk menampilkan daftar item.

---

📂 Detail Activity
---

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:orientation="vertical"
    android:padding="20dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DetailActivity">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Deskripsi Buku"
        android:gravity="center"
        android:textSize="40sp"
        android:textColor="@color/black"
        android:textStyle="bold"
        android:layout_marginBottom="20dp"/>
    <ImageView
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_gravity="center"
        android:src="@drawable/images"
        android:contentDescription="Icon Siswa"
        android:layout_marginBottom="30dp"/>

    <TextView
        android:id="@+id/tvJudul"
        android:layout_gravity="center"
        android:textSize="20sp"
        android:textStyle="bold"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <TextView
        android:id="@+id/tvPenulis"
        android:layout_gravity="center"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <TextView
        android:id="@+id/tvTahun"
        android:layout_gravity="center"
        android:textSize="18sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>

---

- LinearLayout

Root layout dengan orientasi vertical, sehingga elemen disusun dari atas ke bawah.

padding="20dp" memberi jarak di semua sisi.

Lebar & tinggi match_parent, menyesuaikan layar penuh.

- TextView Judul Halaman

Menampilkan teks "Deskripsi Buku".

Diletakkan di bagian atas dengan ukuran besar (40sp), tebal (bold), warna hitam, dan teks rata tengah (gravity="center").

- ImageView

Menampilkan gambar dari resource @drawable/images.

Lebar & tinggi 80dp.

Diletakkan di tengah (layout_gravity="center").

contentDescription digunakan sebagai deskripsi alternatif (aksesibilitas).

- TextView tvJudul

ID: @+id/tvJudul.

Digunakan untuk menampilkan judul buku.

Posisi di tengah, ukuran teks 20sp, tebal (bold).

- TextView tvPenulis

ID: @+id/tvPenulis.

Menampilkan nama penulis.

Teks berukuran 18sp, posisi di tengah.

- TextView tvTahun

ID: @+id/tvTahun.

Menampilkan tahun terbit buku.

Sama seperti tvPenulis, ukuran teks 18sp dan rata tengah.

📌 Fungsi

Layout ini digunakan untuk menampilkan halaman detail sebuah buku.

Informasi yang ditampilkan meliputi:

Judul Buku (tvJudul)

Nama Penulis (tvPenulis)

Tahun Terbit (tvTahun)

Bagian atas terdapat judul halaman “Deskripsi Buku” dan gambar ilustrasi.

📌 Kesimpulan

activity_detail.xml merupakan layout untuk menampilkan detail data buku. Elemen-elemen ditata secara vertikal menggunakan LinearLayout. Dengan adanya TextView dan ImageView, pengguna dapat melihat informasi lengkap buku secara rapi dan terstruktur.

---

📂 RecycleView (adapter)

---

<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:card_view="http://schemas.android.com/apk/res-auto"
    android:layout_margin="8dp"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    card_view:cardCornerRadius="8dp"
    card_view:cardElevation="4dp">

    <LinearLayout
        android:padding="12dp"
        android:orientation="horizontal"
        android:gravity="center_vertical"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <ImageView
            android:layout_width="48dp"
            android:layout_height="48dp"
            android:src="@drawable/images"
            android:contentDescription="Icon Buku"
            android:layout_marginEnd="12dp" />

        <LinearLayout
            android:orientation="vertical"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content">

            <TextView
                android:id="@+id/tvJudul"
                android:text="Judul Buku"
                android:textStyle="bold"
                android:textSize="18sp"
                android:textColor="#000000"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <TextView
                android:id="@+id/tvPenulis"
                android:text="Penulis"
                android:textSize="14sp"
                android:textColor="#555555"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />

            <TextView
                android:id="@+id/tvTahun"
                android:text="Tahun Penerbit"
                android:textSize="14sp"
                android:textColor="#777777"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />
        </LinearLayout>

    </LinearLayout>
</androidx.cardview.widget.CardView>

---

- CardView (Root)

Membungkus seluruh item agar terlihat seperti kartu.

cardCornerRadius="8dp" → sudut kartu melengkung.

cardElevation="4dp" → memberi efek bayangan.

layout_margin="8dp" → memberi jarak antar item di RecyclerView.

- LinearLayout Utama

Orientasi horizontal.

Isi elemen disusun dari kiri ke kanan: gambar buku lalu informasi buku.

gravity="center_vertical" → konten sejajar ke tengah secara vertikal.

- ImageView

Menampilkan gambar ikon buku dari @drawable/images.

Ukuran 48dp x 48dp.

layout_marginEnd="12dp" → jarak antara gambar dan teks.

- LinearLayout Vertikal

layout_weight="1" agar teks memenuhi sisa ruang setelah gambar.

Menampung tiga TextView (judul, penulis, tahun).

- TextView tvJudul

ID: @+id/tvJudul.

Untuk menampilkan judul buku.

Teks bold, ukuran 18sp, warna hitam.

- TextView tvPenulis

ID: @+id/tvPenulis.

Menampilkan nama penulis buku.

Ukuran teks 14sp, warna abu-abu tua (#555555).

- TextView tvTahun

ID: @+id/tvTahun.

Menampilkan tahun terbit buku.

Ukuran teks 14sp, warna abu-abu muda (#777777).

📌 Fungsi

Layout ini digunakan sebagai tampilan item dalam RecyclerView.

Setiap item buku ditampilkan dalam bentuk CardView berisi:

Gambar sampul/ikon buku (ImageView)

Judul buku (TextView)

Nama penulis (TextView)

Tahun terbit (TextView)

📌 Kesimpulan

item_buku.xml berfungsi sebagai template tampilan satu baris item pada RecyclerView. Dengan CardView dan kombinasi LinearLayout, tampilan menjadi rapi, modern, serta mudah dibaca.

---

🔄 Cara Kerja Aplikasi

Splash Screen muncul 2–3 detik menampilkan logo/nama aplikasi.

MainActivity terbuka, menampilkan daftar buku dalam RecyclerView.

Pengguna memilih buku → muncul Toast sebagai notifikasi singkat.

Aplikasi menampilkan Dialog Konfirmasi sebelum membuka detail.

Jika pengguna setuju → pindah ke BookDetailActivity menggunakan Intent.

BookDetailActivity menampilkan informasi detail buku.

---

📌 Kesimpulan

Project aplikasi Daftar Buku Perpustakaan berhasil mengintegrasikan:

Splash Screen sebagai tampilan awal.

RecyclerView + CardView untuk daftar buku.

Intent untuk navigasi antar halaman.

Toast sebagai notifikasi singkat.

Dialog Box sebagai konfirmasi aksi pengguna.

Aplikasi ini sederhana namun fungsional, melatih pemahaman tentang RecyclerView, Adapter, Intent, Toast, dan Dialog dalam Android Studio.

---

✨ Hasil
1
2
3
4
5
