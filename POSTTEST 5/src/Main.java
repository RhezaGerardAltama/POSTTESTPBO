import java.util.ArrayList;
import java.util.Scanner;

final class TokoBoneka extends Boneka {
    private final ArrayList<Boneka> daftarBoneka;

    public TokoBoneka() {
        super(0, "", 0);
        daftarBoneka = new ArrayList<>();
    }

    @Override
    public void info() {
        if (daftarBoneka.isEmpty()) {
            System.out.println("Toko boneka kosong.");
        } else {
            System.out.println("Daftar Boneka:");
            for (Boneka boneka : daftarBoneka) {
                boneka.info();
            }
        }
    }

    public void tambahBoneka(final Boneka boneka) {
        daftarBoneka.add(boneka);
        System.out.println("Boneka berhasil ditambahkan.");
    }

    public void hapusBoneka(final int id) {
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoBoneka tokoBoneka = new TokoBoneka();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Boneka Beruang");
            System.out.println("2. Tambah Boneka JKT48");
            System.out.println("3. Tambah Boneka Pokemon");
            System.out.println("4. Lihat Daftar Boneka");
            System.out.println("5. Hapus Boneka");
            System.out.println("6. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Boneka Beruang: ");
                    int idBeruang = scanner.nextInt();
                    System.out.print("Masukkan Nama Boneka Beruang: ");
                    String namaBeruang = scanner.next();
                    System.out.print("Masukkan Harga Boneka Beruang: ");
                    double hargaBeruang = scanner.nextDouble();
                    System.out.print("Masukkan Warna Boneka Beruang: ");
                    String warnaBeruang = scanner.next();

                    BonekaBeruang bonekaBeruang = new BonekaBeruang(idBeruang, namaBeruang, hargaBeruang, warnaBeruang);
                    tokoBoneka.tambahBoneka(bonekaBeruang);
                    break;

                case 2:
                    System.out.print("Masukkan ID Boneka JKT48: ");
                    int idJKT48 = scanner.nextInt();
                    System.out.print("Masukkan Nama Boneka JKT48: ");
                    String namaJKT48 = scanner.next();
                    System.out.print("Masukkan Harga Boneka JKT48: ");
                    double hargaJKT48 = scanner.nextDouble();
                    System.out.print("Masukkan Jiko Boneka JKT48: ");
                    String jikoJKT48 = scanner.next();

                    BonekaJKT48 bonekaJKT48 = new BonekaJKT48(idJKT48, namaJKT48, hargaJKT48, jikoJKT48);
                    tokoBoneka.tambahBoneka(bonekaJKT48);
                    break;

                case 3:
                    System.out.print("Masukkan ID Boneka Pokemon: ");
                    int idPokemon = scanner.nextInt();
                    System.out.print("Masukkan Nama Boneka Pokemon: ");
                    String namaPokemon = scanner.next();
                    System.out.print("Masukkan Harga Boneka Pokemon: ");
                    double hargaPokemon = scanner.nextDouble();
                    System.out.print("Masukkan Tipe Pokemon: ");
                    String tipePokemon = scanner.next();

                    BonekaPokemon bonekaPokemon = new BonekaPokemon(idPokemon, namaPokemon, hargaPokemon, tipePokemon);
                    tokoBoneka.tambahBoneka(bonekaPokemon);
                    break;

                case 4:
                    tokoBoneka.info();
                    break;

                case 5:
                    System.out.print("Masukkan ID Boneka yang akan dihapus: ");
                    int idHapus = scanner.nextInt();
                    tokoBoneka.hapusBoneka(idHapus);
                    break;

                case 6:
                    System.out.println("Program keluar.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
    }
}