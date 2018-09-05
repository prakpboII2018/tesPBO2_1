/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdos_pboii_1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Asdos_PBOII_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dokter dokter = new Dokter();
        dokter.setNomorPegawai("1");
        dokter.setNama("Arvin");
        dokter.setAlamat("Paingan");
        try {
            dokter.setTanggalLahir(6);
        } catch (Exception ex) {
            Logger.getLogger(Asdos_PBOII_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        dokter.setTempatLahir("Cilacap");

        System.out.println("Kelas Dokter");
        System.out.println("Nomor Pegawai   : " + dokter.getNomorPegawai());
        System.out.println("Nama            : " + dokter.getNama());
        System.out.println("Alamat          : " + dokter.getAlamat());
        System.out.println("Tanggal Lahir   : " + dokter.getTanggalLahir());
        System.out.println("Tempat Lahir    : " + dokter.getTempatLahir());
        System.out.println("----------------------------------------");
        System.out.println("");

        Klinik klinik = new Klinik();
        klinik.setIdKlinik("1");
        klinik.setNama("Wantau");

        System.out.println("Kelas Klinik");
        System.out.println("ID Klinik   : " + klinik.getIdKlinik());
        System.out.println("Nama        : " + klinik.getNama());
        System.out.println("----------------------------------------");
        System.out.println("");

        Pasien pasien = new Pasien();
        pasien.setNoRekam_Medis("1");
        pasien.setNama("Wisnutama");
        pasien.setAlamat("Yogyakarta");
        pasien.setTempatLahir("Paingan");
        try {
            pasien.setTanggalLahir(6);
        } catch (Exception ex) {
            Logger.getLogger(Asdos_PBOII_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pasien.setBulanLahir(5);
        } catch (Exception ex) {
            Logger.getLogger(Asdos_PBOII_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasien.setTahunLahir(1997);
        System.out.println("Kelas Pasien");
        System.out.println("No. Rekam Medis  :" + pasien.getNoRekam_Medis());
        System.out.println("Nama             :" + pasien.getNama());
        System.out.println("Alamat           :" + pasien.getAlamat());
        System.out.println("Tempat Lahir     :" + pasien.getTempatLahir());
        System.out.println("Tanggal Lahir    :" + pasien.getTanggalLahir());
        System.out.println("Bulan Lahir      :" + pasien.getBulanLahir());
        System.out.println("Tahun Lahir      :" + pasien.getTahunLahir());

        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("ANTRIAN PASIEN");
        System.out.println("--------------------------------------------------------");
        System.out.println("");

        Pasien daftar[] = new Pasien[3];
        daftar[0] = new Pasien("Tito", "Paingan", "1", "Paingan", 1, 2, 1990);
        daftar[1] = new Pasien("Tito2", "Paingan2", "2", "Paingan2", 2, 3, 1991);
        daftar[2] = new Pasien("Tito3", "Paingan3", "3", "Paingan3", 3, 4, 1992);
        Klinik klinik1 = new Klinik("1", "Kimia Farma");

        AntriPasien antriPasien = new AntriPasien();
        try {
            antriPasien.setTanggalAntrian(31);
        } catch (Exception ex) {
            Logger.getLogger(Asdos_PBOII_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            antriPasien.setBulanAntrian(5);
        } catch (Exception ex) {
            Logger.getLogger(Asdos_PBOII_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        antriPasien.setTahunAntrian(1997);
        antriPasien.setKlinik(klinik1);

        System.out.println("Tanggal Antrian :" + antriPasien.getTanggalAntrian());
        System.out.println("Bulan Antrian   :" + antriPasien.getBulanAntrian());
        System.out.println("Tahun Antrian   :" + antriPasien.getTahunAntrian());
        System.out.println("ID Klinik   :" + antriPasien.getKlinik().getIdKlinik());
        System.out.println("Nama Klinik :" + antriPasien.getKlinik().getNama());
        System.out.println("");
        System.out.println("Daftar Pasien");
        System.out.println("------------------------------------------------------");
        Pasien pas = new Pasien();
        for (int i = 0; i < daftar.length; i++) {

            System.out.println("No. Rekam Medis :" + daftar[i].getNoRekam_Medis());
            System.out.println("Nama            :" + daftar[i].getNama());
            System.out.println("Alamat          :" + daftar[i].getAlamat());
            System.out.println("Tempat Lahir    :" + daftar[i].getTempatLahir());
            System.out.println("Tanggal Lahir   :" + daftar[i].getTanggalLahir());
            System.out.println("Bulan Lahir     :" + daftar[i].getBulanLahir());
            System.out.println("Tahun Lahir     :" + daftar[i].getTahunLahir());
            System.out.println("");
        }

    }

}
