abstract class Boneka {
    private final int id;
    private final String nama;
    private final double harga;

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

    public final double getHarga() {
        return harga;
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