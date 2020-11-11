/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan43.gajipegawai;

import model.GajiPegawai;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program  menghitung gaji pegawai
 */
public class PBOIF210119064Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek GajiPegawai
        GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setNama("Rizki Adam Kurniawan");
        gajiPegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajiPegawai.setUangTransport(250000);
        gajiPegawai.setUangTunjangan(300000);
        gajiPegawai.setGajiPokok(4500000);
        gajiPegawai.setTotalGaji(gajiPegawai.totalGaji(gajiPegawai.getUangTunjangan(),
                                                       gajiPegawai.getUangTransport(),
                                                       gajiPegawai.getGajiPokok()));
        gajiPegawai.tampilData(gajiPegawai.getNama(), 
                               gajiPegawai.getAlamat(), 
                               gajiPegawai.getUangTunjangan(), 
                               gajiPegawai.getUangTransport(), 
                               gajiPegawai.getGajiPokok(),
                               gajiPegawai.getTotalGaji());
    }
    
}
