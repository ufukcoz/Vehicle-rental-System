/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package araçkiralamasystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AraçkiralamaSystem {

  
    public static void main(String[] args) {
        ArrayList<Araçlar>araç=new ArrayList<>();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome the to System");
        System.out.println("enter the your name");
        String name=scan.next();
        System.out.println("enter the your surname");
        String surname=scan.next();  
        System.out.println("enter the your Id");
        String Id=scan.next();
        
        User user=new User(name,surname,Id);
        if(Id.length()!=11){
            System.out.println("you must enter the Id again.");
        }else{
        System.out.println("user created :"+ user.getName()+" "+user.getSurname()+" "+user.getId());
        scan.close();
        
          araç.add(new Truck("blue","renoult",1987,"23 DF 345",true));
          araç.add(new motocycle("250 cc","gray","yamaha",2019,"45 KL 122"));
          araç.add(new car("full package"," red"," bmw",2024,"46 N 2166"));
          
          for(Araçlar cars:araç){
             cars.getInfo();
             cars.price(2);
             cars.kirala();
            
          }
          car  c=new car("full package"," red"," bmw",2024,"46N2166");
          c.electricCar();
    }
    
}}
