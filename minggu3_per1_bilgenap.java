/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class minggu3_per1_bilgenap {
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("Masukkan angka awal");
        int awal = key.nextInt();
        
        System.out.println("Masukkan angka akhir");
        int akhir = key.nextInt();
        
        System.out.println("Bilangan genap dari " + awal + " sampai " + akhir + " adalah: ");
        
        for(int i = awal; i <= akhir; i++){
            if(i%2 == 0){
                System.out.println(i +"");
            }
            
        }
    }
}
