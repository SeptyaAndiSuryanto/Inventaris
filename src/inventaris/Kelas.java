/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventaris;
import java.util.Scanner;
/**
 *
 * @author ana
 */
public class Kelas {
    private String Nama_ruang;
    private String Lokasi_ruang;
    private String Program_studi;
    private int Panjang_ruang;
    private int Lebar_ruang;
    private int Jumlah_kursi;
    private int Jumlah_pintu;
    private int Jumlah_jendela;
    private int Luas_ruang;
    private double Rasio_ruang;
    String Bentuk_ruang;
    
    Scanner input = new Scanner(System.in);
    
    
    public void setNama_Ruang(String nama_ruang){
        Nama_ruang = nama_ruang;
    }
    public String getNama_ruang(){
        return Nama_ruang;
    }
    public void setLokasi_ruang(String lokasi_ruang){
        Lokasi_ruang = lokasi_ruang;
    }
    public String getLokasi_ruang(){
        return Lokasi_ruang;
    }
    public void setProgram_studi(String program_studi){
        Program_studi = program_studi;
    }
    public String getProgram_studi(){
        return Program_studi;
    }
    public void setPanjang_ruang(int panjang_ruang){
        Panjang_ruang = panjang_ruang;
    }
    public int getPanjang_ruang(){
        return Panjang_ruang;
    }
    public void setLebar_ruang(int lebar_ruang){
        Lebar_ruang=lebar_ruang;
    }
    public int getPLebar_ruang(){
        return Lebar_ruang;
    }
    public void setJumlah_kursi(int jumlah_kursi){
        Jumlah_kursi=jumlah_kursi;
    }
    public int getJumlah_kursi(){
        return Jumlah_kursi;
    }
    public void setJumlah_pintu(int jumlah_pintu){
        Jumlah_pintu=jumlah_pintu;
    }
    public int getJumlah_pintu(){
        return Jumlah_pintu;
    }
    public void setJumlah_jendela(int jumlah_jendela){
        Jumlah_jendela = jumlah_jendela;
    }
    public int getJumlah_jendela(){
        return Jumlah_jendela;
    }
    public int Luas_ruang(){
        Luas_ruang=Panjang_ruang*Lebar_ruang;
        return Luas_ruang;
    }
    public void Bentuk_ruang(){
        if(Panjang_ruang!=Luas_ruang){
            Bentuk_ruang="persegi panjang";
            if("persegi panjang".equals(Bentuk_ruang)){
                System.out.println("Sesuai");
            }
        }
    }
    public double Rasio_kelas(){
        Rasio_ruang=Luas_ruang/Jumlah_kursi;
        return Rasio_ruang;
        }
    public void rasio_kelas(){
        if(Rasio_ruang<=0.5){
            System.out.println("Sesuai");
        }
    }
    public void Analisis_pintu(){
        if(Jumlah_pintu>=2){
            System.out.println("Sesuai");
        }
    }
    public void Analisis_jendela(){
        if(Jumlah_jendela>=1){
            System.out.println("Sesuai");
        }
    }
}