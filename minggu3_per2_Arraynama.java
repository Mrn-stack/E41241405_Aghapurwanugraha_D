/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3.pertemuan_2_minggu2;

/**
 *
 * @author Lenovo
 */
public class minggu3_per2_Arraynama {
    public static void main(String[] args) {
        String[] nama = {"Agha", "Purwa" , "Nugraha"};
        
        System.out.println("Elemen nama");
        for(String elemen : nama){
            System.out.println(elemen);
        }
        
        String namaLengkap= String.join(" ", nama);
        System.out.println("\nNama lengkap: " + namaLengkap);
    }
    
}
