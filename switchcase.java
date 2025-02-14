/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_2;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
       
        Scanner sw = new Scanner(System.in);
        
        System.out.println("     CAFE CERIA    ");
        System.out.println("    ANEKA MINUMAN  ");
        System.out.println("===================");
        
        System.out.println("   Special Menu :    ");
        System.out.println("  1. Soft Drink      ");
        System.out.println("  2. Mix Juice       ");
        System.out.println("  3. Nescafe         ");
        System.out.println("  4. Soda Milk       ");
        System.out.println("  5. Tea             ");
        System.out.println("====================");
        
        System.out.print("Masukkan nama pembeli:");
        String nama = sw.next();
        System.out.print("Silahkan masukkan pilihan anda: ");
        int pilihan= sw.nextInt();
        String  minuman = "";
         switch(pilihan){
            case 1:
                minuman= "Soft Drink";
                break;
            case 2:
                minuman = "Mix Juice";
                break;
            case 3:
                minuman = "Nescafe";
                break;
            case 4:
               minuman = "Soda Milk";
                break;
            case 5:
               minuman = "Tea";
                break;
        }
         System.out.println("Minuman yang anda pesan adalah " + minuman);
         System.out.println("Pesanan yang anda pesan akan segera kami antar");
         System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
    }
    
}
