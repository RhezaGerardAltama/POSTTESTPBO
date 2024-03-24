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

    // public void setwarna(String warnaBaru) {
    //     throw new UnsupportedOperationException("Unimplemented method 'setWarna'");
    // }

    // public void setjenis(String jenisBaru) {
    //     throw new UnsupportedOperationException("Unimplemented method 'setjenis'");
    // }
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
}

class BonekaBarbie extends Boneka {
    private String jenis;

    public BonekaBarbie(int id, String nama, double harga, String jenis) {
        super(id, nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}