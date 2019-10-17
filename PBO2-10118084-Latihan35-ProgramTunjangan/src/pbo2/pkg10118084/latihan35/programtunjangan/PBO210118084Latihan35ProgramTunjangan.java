/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk Menghitung gaji

 */
public class PBO210118084Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Scanner = new Scanner (System.in);
         gaji gaji = new gaji();
         
         System.out.print("Berpa gaji pokok anda perbulan?");
         gaji.gajipokok=Scanner.nextInt();
         System.out.println("status anda ?");
         gaji.status=Scanner.next();
         
         gaji.Totalgaji();
    }
    
}
