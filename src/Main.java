public class Main {

    public static void main(String[] args) {
        Motor beat = new Motor("Honda Beat", 2018, "MH1AB1234CD", 110);
        Mobil avanza = new Mobil("Toyota Avanza", 2021, "MH2XY9999ZZ", 7);
        Motor vario = new Motor("Honda Vario", 2023, "MH1VV2222BB", 125);

        System.out.println("BENGKEL NAJMI MOTOR - LAPORAN SERVIS HARIAN");
        System.out.println();

        System.out.println("Merek tercatat di berkas : " + vario.getMerek());
        vario.setMerek("Honda Vario 160");
        System.out.println("Hasil verifikasi STNK    : " + vario.getMerek());
        System.out.println();

        int biayaBeat = beat.hitungBiaya();
        beat.tampilInfo();
        System.out.println("Estimasi biaya : Rp" + biayaBeat);
        System.out.println();

        int biayaAvanza = avanza.hitungBiaya();
        avanza.tampilInfo();
        System.out.println("Estimasi biaya : Rp" + biayaAvanza);
        System.out.println();

        int biayaVario = vario.hitungBiaya();
        vario.tampilInfo();
        System.out.println("Estimasi biaya : Rp" + biayaVario);
        System.out.println();

        System.out.println("Jadwal perawatan berkala");
        Perawatan perawatan = beat;
        perawatan.jadwalServis();
        perawatan = avanza;
        perawatan.jadwalServis();
        perawatan = vario;
        perawatan.jadwalServis();
        System.out.println();

        System.out.println("Premi asuransi");
        Asuransi asuransi = new Motor("Honda Beat", 2018, "MH1AB1234CD", 110);
        System.out.println("Honda Beat      : Rp" + asuransi.hitungPremi());
        asuransi = vario;
        System.out.println("Honda Vario 160 : Rp" + asuransi.hitungPremi());
        System.out.println();

        System.out.println("Total estimasi biaya servis : Rp"
                + (biayaBeat + biayaAvanza + biayaVario));
        System.out.println("PPN berlaku : " + Kendaraan.TARIF_PPN + "%");
        System.out.println("Nomor rangka Honda Beat : " + beat.getNomorRangka()
                + " (final, tanpa setter)");
    }
}
