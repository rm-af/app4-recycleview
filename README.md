📚 Project RecyclerView - Daftar Buku Perpustakaan

Materi ini membahas pembuatan aplikasi Android sederhana bertema Daftar Buku Perpustakaan menggunakan Android Studio dengan beberapa fitur utama, yaitu Splash Screen sebagai tampilan pembuka, RecyclerView untuk menampilkan daftar buku, Intent untuk navigasi antar Activity, Toast sebagai notifikasi singkat, dan Dialog Box untuk konfirmasi.

---

👥 Tim

1. a
2. a
3. a
4. a
5. a

---

🔧 Teknologi

Kotlin

Android Studio

RecyclerView + CardView

Git & GitHub

---

📱 Fitur yang Ada

📂 Splash Screen
(foto code)

Kode program pada SplashActivity menampilkan logo/nama perpustakaan selama 3 detik sebelum masuk ke halaman utama.

Menggunakan Handler(Looper.getMainLooper()).postDelayed() dengan durasi 3000 ms.

Setelah jeda, aplikasi berpindah ke MainActivity menggunakan Intent.

finish() dipanggil agar SplashActivity tidak bisa kembali dengan tombol back.

Layout: activity_splash.xml berisi desain tampilan logo/teks.

📂 RecyclerView
(foto code)

RecyclerView digunakan untuk menampilkan daftar minimal 5 buku dengan informasi:

Judul

Penulis

Tahun Terbit

Icon buku

Implementasi:

RecyclerView dideklarasikan di activity_main.xml.

Menggunakan BookAdapter untuk menghubungkan data dengan tampilan.

Setiap item didesain di item_book.xml dengan CardView.

📂 Adapter (BookAdapter)
(foto)

BookAdapter bertugas:

Menghubungkan data buku ke tampilan RecyclerView.

Menampilkan judul, penulis, tahun, serta icon buku.

Menambahkan aksi klik pada item → memunculkan Toast + membuka detail buku lewat Intent.

Layout item: item_book.xml (berisi ImageView, TextView, dan tombol aksi).

📂 Intent ke Detail Activity
(foto)

BookDetailActivity menampilkan detail buku.

Data dikirim dari MainActivity lewat Intent.putExtra().

Data judul, penulis, tahun diterima dengan getStringExtra().

Ditampilkan di layout activity_book_detail.xml.

📂 Toast Message
(foto)

Saat item buku diklik, muncul Toast dengan pesan:
"Memilih: [judul buku]"

Memberikan feedback singkat kepada pengguna.

📂 Dialog Box (Konfirmasi)
(foto)

Saat tombol Lihat Buku ditekan → muncul AlertDialog konfirmasi.

Jika Ya → masuk ke halaman detail buku.

Jika Batal → dialog ditutup tanpa aksi.

Dialog juga bisa dipakai untuk aksi lain seperti hapus buku.

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
