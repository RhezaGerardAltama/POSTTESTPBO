public class Boneka {


    // ENKAPSULASI
    private int id;
    private String nama;
    private double harga;

    public Boneka(int id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }


    // GETTER
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // SETTER 
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}