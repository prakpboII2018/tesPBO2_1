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
public class Klinik {
    private String idKlinik;
    private String nama;

    /**
     * @return the idKlinik
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    public Klinik() {
    }

    /**
     * @param idKlinik the idKlinik to set
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public Klinik(String idKlinik, String nama) {
        this.idKlinik = idKlinik;
        this.nama = nama;
    }
    
}
