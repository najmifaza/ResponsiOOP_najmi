public class Motor extends Kendaraan implements Perawatan, Asuransi {

    private int cc;

    public Motor(String merek, int tahun, String nomorRangka, int cc) {
        super(merek, tahun, nomorRangka);
        this.cc = cc;
    }

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kapasitas    : " + this.cc + " cc");
    }

    @Override
    public int hitungBiaya() {
        int biaya = 50000;
        if (this.getTahun() < 2020) {
            this.setKondisi("Servis Berat");
            biaya = biaya * 3 / 2;
        } else {
            this.setKondisi("Servis Ringan");
        }
        return biaya + biaya * TARIF_PPN / 100;
    }

    @Override
    public void jadwalServis() {
        System.out.println("Motor " + this.getMerek() + " servis tiap 3 bulan.");
    }

    @Override
    public int hitungPremi() {
        return this.cc * 1000;
    }
}
