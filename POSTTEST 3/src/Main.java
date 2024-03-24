import java.util.ArrayList;
import java.util.Scanner;

class TokoBoneka {
    private ArrayList<Boneka> daftarBoneka;

    public TokoBoneka() {
        daftarBoneka = new ArrayList<>();
    }

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
                System.out.print("ID: " + boneka.getId() + ", Nama: " + boneka.getNama() + ", Harga: " + boneka.getHarga());
                if (boneka instanceof BonekaBeruang) {
                    System.out.println(", Warna: " + ((BonekaBeruang) boneka).getWarna());
                } else if (boneka instanceof BonekaBarbie) {
                    System.out.println(", Jenis: " + ((BonekaBarbie) boneka).getJenis());
                } else {
                    System.out.println();
                }
            }
        }
    }

    public void updateBoneka(int id, String namaBaru, double hargaBaru, String warnaBaru, String jenisBaru) {
        for (Boneka boneka : daftarBoneka) {
            if (boneka.getId() == id) {
                if (boneka instanceof BonekaBeruang) {
                    BonekaBeruang bonekaBeruang = (BonekaBeruang) boneka;
                    bonekaBeruang.setNama(namaBaru);
                    bonekaBeruang.setHarga(hargaBaru);
                    bonekaBeruang.setWarna(warnaBaru);
                    System.out.println("Boneka Beruang berhasil diperbarui.");
                    return;
                } else if (boneka instanceof BonekaBarbie) {
                    BonekaBarbie bonekaBarbie = (BonekaBarbie) boneka;
                    bonekaBarbie.setNama(namaBaru);
                    bonekaBarbie.setHarga(hargaBaru);
                    bonekaBarbie.setJenis(jenisBaru);
                    System.out.println("Boneka Barbie berhasil diperbarui.");
                    return;
                } else {
                    boneka.setNama(namaBaru);
                    boneka.setHarga(hargaBaru);
                    System.out.println("Boneka berhasil diperbarui.");
                    return;
                }
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoBoneka tokoBoneka = new TokoBoneka();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Boneka Beruang");
            System.out.println("2. Tambah Boneka Barbie");
            System.out.println("3. Lihat Daftar Boneka");
            System.out.println("4. Update Boneka");
            System.out.println("5. Hapus Boneka");
            System.out.println("6. Keluar");

            System.out.print("Pilih menu (1-6): ");
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
                    System.out.print("Masukkan ID Boneka Barbie: ");
                    int idBarbie = scanner.nextInt();
                    System.out.print("Masukkan Nama Boneka Barbie: ");
                    String namaBarbie = scanner.next();
                    System.out.print("Masukkan Harga Boneka Barbie: ");
                    double hargaBarbie = scanner.nextDouble();
                    System.out.print("Masukkan Jenis Boneka Barbie: ");
                    String jenisBarbie = scanner.next();

                    BonekaBarbie bonekaBarbie = new BonekaBarbie(idBarbie, namaBarbie, hargaBarbie, jenisBarbie);
                    tokoBoneka.tambahBoneka(bonekaBarbie);
                    break;

                case 3:
                    tokoBoneka.lihatBoneka();
                    break;

                case 4:
                    System.out.print("Masukkan ID Boneka yang akan diupdate: ");
                    int idUpdate = scanner.nextInt();
                    System.out.println("Pilih jenis boneka yang akan diupdate:");
                    System.out.println("1. Boneka Beruang");
                    System.out.println("2. Boneka Barbie");
                    System.out.print("Pilih jenis (1/2): ");
                    int jenisUpdate = scanner.nextInt();
                    
                    switch (jenisUpdate) {
                        case 1:
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaruBeruang = scanner.next();
                            System.out.print("Masukkan Harga Baru: ");
                            double hargaBaruBeruang = scanner.nextDouble();
                            System.out.print("Masukkan Warna Baru: ");
                            String warnaBaru = scanner.next();
                    
                            tokoBoneka.updateBoneka(idUpdate, namaBaruBeruang, hargaBaruBeruang, warnaBaru, null);
                            break;
                    
                        case 2:
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaruBarbie = scanner.next();
                            System.out.print("Masukkan Harga Baru: ");
                            double hargaBaruBarbie = scanner.nextDouble();
                            System.out.print("Masukkan Jenis Baru: ");
                            String jenisBaru = scanner.next();
                    
                            tokoBoneka.updateBoneka(idUpdate, namaBaruBarbie, hargaBaruBarbie, null, jenisBaru);
                            break;
                    
                        default:
                            System.out.println("Pilihan jenis tidak valid.");
                            break;
                    }
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