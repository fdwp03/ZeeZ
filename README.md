# "ZeeZ : Inovasi Digital dalam Mencatat dan Mengelola Keuangan Harian" 

## Deskripsi Singkat
"ZeeZ" adalah aplikasi pencatatan keuangan harian yang dirancang untuk membantu pengguna mengelola pemasukan dan pengeluaran secara efektif, sederhana, dan terstruktur. Aplikasi ini bertujuan untuk meningkatkan literasi finansial masyarakat dengan memberikan kemudahan dalam pelacakan transaksi harian, analisis kebiasaan pengeluaran, serta perencanaan anggaran bulanan. ZeeZ hadir sebagai solusi digital modern bagi siapa saja yang ingin hidup lebih hemat dan terorganisir.\

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
   3. Klik tombol **New** untuk membuat database baru (misal: `zeez_db`)
   4. Setelah database dibuat, klik tab **Import**
   5. Pilih file `zeez.sql` dari folder project (biasanya ada di `/database/zeez.sql`)
   6. Klik **Go** untuk mengimpor — database berhasil dibuat jika tidak ada error
3. **Akses Aplikasi:**
   1. Buka **NetBeans**
   2. Buka project ZeeZ dari hasil clone
   3. Klik kanan pada file `login` (atau file utama lainnya), lalu pilih **Run**

  

