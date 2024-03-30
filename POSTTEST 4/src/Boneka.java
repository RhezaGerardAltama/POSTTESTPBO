public class Boneka {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void info() {
        System.out.println("ID: " + getId() + ", Nama: " + getNama() + ", Harga: " + getHarga());
    }
}

class BonekaBeruang extends Boneka {
    private String warna;

    public BonekaBeruang(int id, String nama, double harga, String warna) {
        super(id, nama, harga);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Warna: " + getWarna());
    }
}

class BonekaJKT48 extends Boneka {
    private String jiko;

    public BonekaJKT48(int id, String nama, double harga, String jiko) {
        super(id, nama, harga);
        this.jiko = jiko;
    }

    public String getJiko() {
        return jiko;
    }

    public void setJiko(String jiko) {
        this.jiko = jiko;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jiko: " + getJiko());
    }
}

class BonekaPokemon extends Boneka {
    private String tipePokemon;

    public BonekaPokemon(int id, String nama, double harga, String tipePokemon) {
        super(id, nama, harga);
        this.tipePokemon = tipePokemon;
    }

    public String getTipePokemon() {
        return tipePokemon;
    }

    public void setTipePokemon(String tipePokemon) {
        this.tipePokemon = tipePokemon;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipe Pokemon: " + getTipePokemon());
    }
}
