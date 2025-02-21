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
public class minggu3_per1_segitiga_terbalik {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi = ");
        int tinggi = key.nextInt();
        
        for(int i = 0; i < tinggi; i++ ){
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
                
            }
        for(int b = 0; b<( 2* (tinggi-i)-1); b++){
            System.out.print("*");
        }
            System.out.println("");
        }
    }
    
}
