package src.java.main.posttest;
import java.util.ArrayList;
import java.util.Scanner;



class Boneka {
    private int id;
    private String nama;
    private double harga;

    public Boneka(int id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

class TokoBoneka {
    public TokoBoneka() {
        daftarBoneka = new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoBoneka tokoBoneka = new TokoBoneka();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Boneka");
            System.out.println("2. Lihat Daftar Boneka");
            System.out.println("3. Update Boneka");
            System.out.println("4. Hapus Boneka");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Boneka: ");
                    int id = scanner.nextInt();
                    System.out.print("Masukkan Nama Boneka: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan Harga Boneka: ");
                    double harga = scanner.nextDouble();

                    Boneka bonekaBaru = new Boneka(id, nama, harga);
                    tokoBoneka.tambahBoneka(bonekaBaru);
                    break;

                case 2:
                    tokoBoneka.lihatBoneka();
                    break;

                case 3:
                    System.out.print("Masukkan ID Boneka yang akan diupdate: ");
                    int idUpdate = scanner.nextInt();
                    System.out.print("Masukkan Nama Baru: ");
                    String namaBaru = scanner.next();
                    System.out.print("Masukkan Harga Baru: ");
                    double hargaBaru = scanner.nextDouble();

                    tokoBoneka.updateBoneka(idUpdate, namaBaru, hargaBaru);
                    break;

                case 4:
                    System.out.print("Masukkan ID Boneka yang akan dihapus: ");
                    int idHapus = scanner.nextInt();
                    tokoBoneka.hapusBoneka(idHapus);
                    break;

                case 5:
                    System.out.println("Program keluar.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
    }
}
