import java.util.ArrayList;
import java.util.Scanner;

public class pendataan {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            // Memasukkan data mahasiswa
            System.out.println("Masukkan data mahasiswa (Format: nim#nama#prodi#tahun_ajaran), atau ketik 'selesai' untuk mengakhiri:");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("selesai")) {
                    break;
                }
                String[] data = input.split("#");
                if (data.length == 4) {
                    String nim = data[0];
                    String nama = data[1];
                    String prodi = data[2];
                    String tahunAjaran = data[3];
                    Mahasiswa mahasiswa = new Mahasiswa(nim, nama, prodi, tahunAjaran);
                    mahasiswaList.add(mahasiswa);
                } else {
                    System.out.println("Format input tidak valid.");
                }
            }
        }

        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        System.out.println("NIM | Nama | Prodi | Tahun Ajaran");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getProdi() + " | " + mahasiswa.getTahunAjaran());
        }
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private String tahunAjaran;

    public Mahasiswa(String nim, String nama, String prodi, String tahunAjaran) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.tahunAjaran = tahunAjaran;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }
}
