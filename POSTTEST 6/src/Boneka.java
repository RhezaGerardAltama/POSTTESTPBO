interface Diskon {
    double hitungDiskon(double harga);
    void tampilkanInfoDiskon();
}

abstract class Boneka {
    private final int id;
    private String nama; // Ubah menjadi variabel tidak final agar dapat diubah nilainya
    private double harga;

    public Boneka(final int id, final String nama, final double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public final int getId() {
        return id;
    }

    public final String getNama() {
        return nama;
    }

    public void setNama(String nama) { // Tambahkan setter untuk nama
        this.nama = nama;
    }

    public final double getHarga() {
        return harga;
    }

    public void setHarga(double harga) { // Tambahkan setter untuk harga
        this.harga = harga;
    }

    public abstract void info();
}

class BonekaBeruang extends Boneka {
    private final String warna;

    public BonekaBeruang(final int id, final String nama, final double harga, final String warna) {
        super(id, nama, harga);
        this.warna = warna;
    }

    @Override
    public void info() {
        System.out.println("ID: " + getId() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Warna: " + warna);
    }
}

class BonekaJKT48 extends Boneka {
    private final String jiko;

    public BonekaJKT48(final int id, final String nama, final double harga, final String jiko) {
        super(id, nama, harga);
        this.jiko = jiko;
    }

    @Override
    public void info() {
        System.out.println("ID: " + getId() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Jiko: " + jiko);
    }
}

class BonekaPokemon extends Boneka {
    private final String tipe;

    public BonekaPokemon(final int id, final String nama, final double harga, final String tipe) {
        super(id, nama, harga);
        this.tipe = tipe;
    }

    @Override
    public void info() {
        System.out.println("ID: " + getId() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Tipe: " + tipe);
    }
}