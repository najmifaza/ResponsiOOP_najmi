public class Mobil extends Kendaraan implements Perawatan {

    private int kapasitasPenumpang;

    public Mobil(String merek, int tahun, String nomorRangka, int kapasitasPenumpang) {
        super(merek, tahun, nomorRangka);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public int getKapasitasPenumpang() {
        return this.kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Penumpang    : " + this.kapasitasPenumpang + " orang");
    }

    @Override
    public int hitungBiaya() {
        int biaya = 120000;
        if (this.kapasitasPenumpang > 5) {
            this.setKondisi("Servis Berat");
            biaya = biaya * 14 / 10;
        } else {
            this.setKondisi("Servis Ringan");
        }
        return biaya + biaya * TARIF_PPN / 100;
    }

    @Override
    public void jadwalServis() {
        System.out.println("Mobil " + this.getMerek() + " servis tiap 6 bulan.");
    }
}
