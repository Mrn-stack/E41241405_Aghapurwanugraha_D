/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3.pertemuan_2_minggu2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.util.Random;
public class minggu3_per2_Arrayderetangka {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.print("Masukkan jumlah deret = ");
        int deret = key.nextInt();
        
        if(deret>0){
            
        int[] array = new int [deret];
        for(int i=0; i<deret; i++){
            array[i] = ran.nextInt(100)+1;
            System.out.print(array[i] + " ");
        }
    }else{
            System.out.println("angka tidak boleh minus");
        }
        
    }
    
}
