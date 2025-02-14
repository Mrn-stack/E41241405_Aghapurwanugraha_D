/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class struk {
    public static void main(String[] args) {
        
        Scanner struk = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("      Kharisma Agung Plaza ( KAP )     ");
        System.out.println("       Promo Belanja Berhadiah         ");
        System.out.println("    Khusus Pembelian 5 Barang Pertama  ");
        System.out.println("     Dengan Harga Minimum Rp.10000,00  ");
        System.out.println("=======================================");
        
        System.out.print("Masukkan Nama Pembeli : ");
        String nama = struk.next();
        
        int hargaBarang = 5;
        int totalHarga = 0;
        
        
        for(int i= 1; i <= hargaBarang; i++){
            System.out.print("Masukkan harga barang ke-" +i + ":");
            int jumlahHarga= struk.nextInt();
            totalHarga+=jumlahHarga;
        }
        
        System.out.println("Total harga pembelian atas nama " + nama + " Adalah " + totalHarga);
        
      if(totalHarga>=100000){
          System.out.println("Selamat....");
          System.out.println("Anda mendapat hadiah 1 buah mug cantik");
      }else{
          System.out.println("Mohon maaf anda tidak dapat hadiah karena tidak memenuhi minimum belanja");
      }
      
       System.out.println("=========================================");
       System.out.println("            Terima Kasih                 ");
       System.out.println("Anda sudah belanja di Kharima Agung Plaza");
    }
    
}
