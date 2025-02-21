/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_3;

/**
 *
 * @author Lenovo
 */
public class minggu3_per1_do_while {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Do_while");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        do{
            System.out.printf("%4d", a);
            a*=2;
        }while(a<=100);
        
    }
    
}
