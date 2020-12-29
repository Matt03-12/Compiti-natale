/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotoriNatale;

/**
 *
 * @author gramm
 */
public class Garage {
    VeicoloAMotore[] Array = new VeicoloAMotore[15];
    int pos=-1;
    int conta=0;
    public String entrare(VeicoloAMotore cosa){
     Array[pos+1]=cosa;
     pos++;
     return "Il veicolo e stato collocato nel posto: " + pos;
    }

    
    public String uscire(int pos){
     Array[pos]=null;
    return "Il veicolo e uscito dal posto: " + pos;   
    }
    
     public String toString(){
         String Stringa=" ";
         for(int i=0;i<15;i++){
         if(Array[i]!=null){
          Stringa=Stringa+"\n"+Array[i];   
         }    
         }
         return Stringa;
       
       }
    
    
    
}
