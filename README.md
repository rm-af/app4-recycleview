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

📂 Adapter (BookAdapter)
(foto)

BookAdapter bertugas:

Menghubungkan data buku ke tampilan RecyclerView.

Menampilkan judul, penulis, tahun, serta icon buku.

Menambahkan aksi klik pada item → memunculkan Toast + membuka detail buku lewat Intent.

Layout item: item_book.xml (berisi ImageView, TextView, dan tombol aksi).

---

📂 Intent ke Detail Activity
(foto)

BookDetailActivity menampilkan detail buku.

Data dikirim dari MainActivity lewat Intent.putExtra().

Data judul, penulis, tahun diterima dengan getStringExtra().

Ditampilkan di layout activity_book_detail.xml.

---

🔄 Cara Kerja Aplikasi

Splash Screen muncul 2–3 detik menampilkan logo/nama aplikasi.

MainActivity terbuka, menampilkan daftar buku dalam RecyclerView.

Pengguna memilih buku → muncul Toast sebagai notifikasi singkat.

Aplikasi menampilkan Dialog Konfirmasi sebelum membuka detail.

Jika pengguna setuju → pindah ke BookDetailActivity menggunakan Intent.

BookDetailActivity menampilkan informasi detail buku.

---

📂 Struktur File

o

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
