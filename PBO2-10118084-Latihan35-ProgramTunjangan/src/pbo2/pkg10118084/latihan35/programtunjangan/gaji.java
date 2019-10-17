/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan35.programtunjangan;

/**
 *
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghitung gaji

 */
public class gaji {
    int gajipokok;
    String status;
    int tunjangan;
    int totalgaji;

     public void Totalgaji(){
    if("Menikah".equals(status)){
        tunjangan = gajipokok*35/100;
        System.out.println("====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji pokok      :"+gajipokok);
        System.out.println("Tunjangan       :"+tunjangan);
        totalgaji = gajipokok+tunjangan;
        System.out.println("Total Gaji      :"+totalgaji);
    }
    else{
        
        System.out.println("====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji pokok      :"+gajipokok);
        System.out.println("Tunjangan       :"+tunjangan);
        totalgaji = gajipokok+tunjangan;
        System.out.println("Total Gaji      :"+totalgaji);
    }
        } 
    
    
    
}
