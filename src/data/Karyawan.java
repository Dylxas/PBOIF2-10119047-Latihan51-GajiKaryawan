/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG GAJI KARYAWAN
 */

public class Karyawan {
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;
    
    public String getNik(){
        return nik;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJabatan(){
        return nik;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getGolongan(){
        return golongan;
    }
    
    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
    
}
