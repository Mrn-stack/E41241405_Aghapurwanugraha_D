/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_1;

class Person{
    String name;
    int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        
        }
   public String getName(){
        return name;
    }
   
   public int getAge(){
       return age;
   }
   
   public void setAge(int age){
       this.age = age;
   }
}
public class managingpeople {
    public static void main(String[] args) {
        Person p1 = new  Person("Agha ganteng", 17);
        
        Person p2 = new Person ("Agha rajin", 15);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName()+" is the same age as " +p2.getName());
        }
        else{
            System.out.println(p1.getName() +" is Not the same age as " +p2.getName());
        }
    }
}
