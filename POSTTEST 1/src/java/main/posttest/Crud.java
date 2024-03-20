package src.java.main.posttest;
import java.util.ArrayList;

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


public class Crud {
    private ArrayList<Boneka> daftarBoneka;

    

    public void tambahBoneka(Boneka boneka) {
        daftarBoneka.add(boneka);
        System.out.println("Boneka berhasil ditambahkan.");
    }

    public void lihatBoneka() {
        if (daftarBoneka.isEmpty()) {
            System.out.println("Toko boneka kosong.");
        } else {
            System.out.println("Daftar Boneka:");
            for (Boneka boneka : daftarBoneka) {
                System.out.println("ID: " + boneka.getId() + ", Nama: " + boneka.getNama() + ", Harga: " + boneka.getHarga());
            }
        }
    }

    public void updateBoneka(int id, String namaBaru, double hargaBaru) {
        for (int i = 0; i < daftarBoneka.size(); i++) {
            Boneka boneka = daftarBoneka.get(i);
            if (boneka.getId() == id) {
                daftarBoneka.set(i, new Boneka(id, namaBaru, hargaBaru));
                System.out.println("Boneka berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Boneka dengan ID " + id + " tidak ditemukan.");
    }

    public void hapusBoneka(int id) {
        for (int i = 0; i < daftarBoneka.size(); i++) {
            Boneka boneka = daftarBoneka.get(i);
            if (boneka.getId() == id) {
                daftarBoneka.remove(i);
                System.out.println("Boneka berhasil dihapus.");
                return;
            }
        }
        System.out.println("Boneka dengan ID " + id + " tidak ditemukan.");
    }
}
