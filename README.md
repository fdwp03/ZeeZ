# "ZeeZ : Inovasi Digital dalam Mencatat dan Mengelola Keuangan Harian" 

---
## Deskripsi Singkat
"ZeeZ" adalah aplikasi pencatatan keuangan harian yang dirancang untuk membantu pengguna mengelola pemasukan dan pengeluaran secara efektif, sederhana, dan terstruktur. Aplikasi ini bertujuan untuk meningkatkan literasi finansial masyarakat dengan memberikan kemudahan dalam pelacakan transaksi harian, analisis kebiasaan pengeluaran, serta perencanaan anggaran bulanan. ZeeZ hadir sebagai solusi digital modern bagi siapa saja yang ingin hidup lebih hemat dan terorganisir.\

---
## Langkah Instalasi:
1. **Clone project melalui NetBeans:**
   - Buka NetBeans > pilih menu `Team` > `Git` > `Clone...`
   - Masukkan URL repository:
     ```
     https://github.com/fdwp03/ZeeZ.git
     ```
   - Pilih direktori tujuan lokal > klik `Finish`
2. **Akses Database:**
   1. Jalankan XAMPP dan aktifkan **Apache** serta **MySQL**
   2. Buka browser dan akses:
      ```
      http://localhost/phpmyadmin
      ```
   3. Klik tombol **New** untuk membuat database baru `zeez`
   4. Setelah database dibuat, klik tab **Import**
   5. Pilih file `zeez.sql` dari folder project (terdapat di `/database/zeez.sql`)
   6. Klik **Go** untuk mengimpor — database berhasil dibuat jika tidak ada error
3. **Akses Aplikasi:**
   1. Buka **NetBeans**
   2. Buka project ZeeZ dari hasil clone
   3. Klik kanan pada file `login` (atau file utama lainnya), lalu pilih **Run**

---
## Petunjuk Penggunaan
Berikut adalah panduan singkat untuk menggunakan aplikasi **ZeeZ**:
1. Halaman Login
   - Masukkan usernqme dan kata sandi untuk masuk ke aplikasi.
   - Klik tombol **Login**.
   - Jika belum memiliki akun, klik **Sign Up** untuk mendaftar terlebih dahulu.
2. Halaman Sign Up
   - Isi data: nama lengkap, username, dan kata sandi.
   - Klik tombol **Sign Up** untuk membuat akun baru.
3. Halaman Dashboard
   - Menampilkan ringkasan total pemasukan dan pengeluaran Anda.
   - Tersedia tombol untuk menuju:
   - **Profile**
   - **Edit Transaksi**
   - **Logout**
   - Gunakan bagian ringkasan untuk melihat status keuangan secara cepat dan real-time.
4. Halaman Profile
   - Menampilkan informasi pengguna (nama dan username).
   - Gunakan tombol **Logout** untuk keluar dari akun.
5. Halaman Edit Transaksi
   - Klik pada data tabel untuk:
   - Menambah
   - Mengedit
   - Menghapus transaksi
   - Pilih jenis transaksi: **Income (pemasukan)** atau **Expense (pengeluaran)**.
   - Pastikan mengisi **nominal**, **tanggal**, dan **kategori** dengan benar.
6. Halaman Aturan Bulanan (Monthly Rules)
   - Atur batas persentase pengeluaran bulanan yang diinginkan.
   - Sistem akan memberikan peringatan jika pengeluaran mendekati/melebihi batas tersebut.
7. Statistik Pemasukan Bulanan
   - Menampilkan grafik pemasukan per bulan.
8. Statistik Pengeluaran Bulanan
   - Menampilkan grafik pengeluaran per bulan.
   - Berguna untuk menganalisis kebiasaan belanja dan pengeluaran.
### 💡 Tips Tambahan
- Selalu **simpan perubahan** saat mengedit transaksi atau pengaturan.
- Gunakan aplikasi ini secara rutin untuk menjaga catatan tetap akurat.
- Fitur **Monthly Rules** sangat berguna untuk mengontrol pengeluaran agar tidak melebihi batas aman.
  

