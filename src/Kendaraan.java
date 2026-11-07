public abstract class Kendaraan {

    public static final int TARIF_PPN = 11;

    private final String nomorRangka;
    private String merek;
    private int tahun;
    private String kondisi = "Normal";

    public Kendaraan(String merek, int tahun, String nomorRangka) {
        this.merek = merek;
        this.tahun = tahun;
        this.nomorRangka = nomorRangka;
    }

    public Kendaraan(String merek, int tahun) {
        this(merek, tahun, "XX0000");
    }

    public String getMerek() {
        return this.merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getNomorRangka() {
        return this.nomorRangka;
    }

    public String getKondisi() {
        return this.kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void tampilInfo() {
        System.out.println("Merek        : " + this.merek);
        System.out.println("Tahun        : " + this.tahun);
        System.out.println("Nomor rangka : " + this.nomorRangka);
        System.out.println("Kondisi      : " + this.kondisi);
    }

    public abstract int hitungBiaya();
}
