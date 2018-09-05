/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdos_pboii_1;

/**
 *
 * @author asus
 */
public class AntriPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private Pasien[] daftarPasien;

    /**
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        if (tanggalAntrian > 0 && tanggalAntrian < 32) {

            this.tanggalAntrian = tanggalAntrian;
        } else {
            throw new Exception("Format tanggal salah");
        }

    }

    /**
     * @return the bulanAntrian
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * @param bulanAntrian the bulanAntrian to set
     */
    public void setBulanAntrian(int bulanAntrian) throws Exception {
        if (bulanAntrian > 0 && bulanAntrian < 13) {
            this.bulanAntrian = bulanAntrian;
        } else {
            throw new Exception("Format Bulan Salah");
        }
    }

    /**
     * @return the tahunAntrian
     */
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**
     * @param tahunAntrian the tahunAntrian to set
     */
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * @return the klinik
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * @param klinik the klinik to set
     */
    public void setKlinik(Klinik klinik) {

        this.klinik = klinik;
    }

    /**
     * @return the daftarPasien
     */
    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * @param daftarPasien the daftarPasien to set
     */
    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
}
