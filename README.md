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


