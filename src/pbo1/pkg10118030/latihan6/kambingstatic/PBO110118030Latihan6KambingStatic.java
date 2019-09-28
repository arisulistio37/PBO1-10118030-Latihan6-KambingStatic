/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118030.latihan6.kambingstatic;

import static pbo1.pkg10118030.latihan6.kambingstatic.PBO110118030Latihan6KambingStatic.KambingStatic.NAMA_KAMBING;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 */
public class PBO110118030Latihan6KambingStatic {
    // Variabel jumlahKambing dideklarasikan sebagai statik
        public static int jumlahKambing;
        
public class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING = "MIDUN";
}        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO110118030Latihan6KambingStatic.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + PBO110118030Latihan6KambingStatic.jumlahKambing);
    }   
    
}    

