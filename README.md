# Hello, World!

Ini adalah contoh program sederhana dalam bahasa Java yang mencetak pesan "Hello, World!" ke konsol.

## Cara Penggunaan

1. Pastikan Anda telah menginstal Java Development Kit (JDK) di komputer Anda. JDK dapat diunduh dan diinstal dari situs resmi Java: [https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
2. Buka terminal atau command prompt di komputer Anda.
3. Salin dan simpan kode program berikut dalam file dengan ekstensi `.java`, misalnya `HelloWorld.java`.
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
4. Buka terminal atau command prompt, lalu arahkan ke direktori tempat Anda menyimpan file program `HelloWorld.java`.
5. Compile program Java menggunakan perintah `javac` di terminal:
   ```bash
   javac HelloWorld.java
   ```
   Perintah ini akan menghasilkan file `.class` yang berisi bytecode Java.
6. Jika tidak ada error dalam proses kompilasi, jalankan program Java menggunakan perintah `java` di terminal:
   ```bash
   java HelloWorld
   ```
   Program Java akan dijalankan dan outputnya "Hello, World!" akan ditampilkan di terminal.

Pastikan Anda telah menginstal JDK dan konfigurasi JDK yang benar agar perintah `javac` dan `java` dapat dijalankan di terminal.



# Pendataan Mahasiswa

Program ini merupakan contoh implementasi pendataan mahasiswa menggunakan bahasa pemrograman Java. Program ini memungkinkan pengguna untuk memasukkan data mahasiswa seperti NIM, nama, program studi, dan tahun ajaran, dan kemudian menampilkan data mahasiswa yang telah dimasukkan.

## Cara Menjalankan Program

1. Pastikan Anda memiliki Java Development Kit (JDK) terinstal di komputer Anda.
2. Unduh atau salin kode program Java yang terdapat dalam file `pendataan.java`.
3. Buka terminal atau command prompt, dan arahkan ke direktori tempat Anda menyimpan file Java.
4. Compile program Java dengan menjalankan perintah berikut:

   ```bash
   javac pendataan.java
   ```

5. Setelah berhasil dikompilasi, jalankan program dengan perintah berikut:

   ```bash
   java pendataan
   ```

6. Program akan meminta Anda untuk memasukkan data mahasiswa dalam format `nim#nama#prodi#tahun_ajaran`. Masukkan data dengan format yang valid, atau ketikkan 'selesai' untuk mengakhiri input data.
7. Setelah selesai memasukkan data, program akan menampilkan data mahasiswa yang telah dimasukkan dalam format tabel.

## Contoh Penggunaan

```
Masukkan data mahasiswa (Format: nim#nama#prodi#tahun_ajaran), atau ketik 'selesai' untuk mengakhiri:
12345#John Doe#Teknik Informatika#2023/2024
54321#Jane Smith#Manajemen#2022/2023
selesai

Data Mahasiswa:
NIM   | Nama        | Prodi               | Tahun Ajaran
12345 | John Doe    | Teknik Informatika  | 2023/2024
54321 | Jane Smith  | Manajemen           | 2022/2023
```
