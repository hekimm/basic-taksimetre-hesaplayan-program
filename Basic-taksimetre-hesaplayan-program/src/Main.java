/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
         
    double kmBasinaUcret =2.20;
   
   double minimumOdenecekTutar = 20,toplamTutar=0;
  double  acilisUcreti = 10;
  
  Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç km gidildi : ");
   double gidilenMesafe = scanner.nextDouble();
   if(gidilenMesafe<=0){
       System.out.println("Geçersiz km girildi");
   }
   
   else{
     toplamTutar  = acilisUcreti + (gidilenMesafe * kmBasinaUcret);
      if(toplamTutar<minimumOdenecekTutar){
       toplamTutar = minimumOdenecekTutar;
      }
      
      
   }
   
        System.out.println("Toplam tutar :" + toplamTutar);
  
  
   
    
    }
    
}
