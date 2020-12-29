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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automobile a = new Automobile();
        a.Impostazioni("Abarth","Octavia",50.5,1987,"Disel",4);
        Furgone b = new Furgone();
        b.Impostazioni("Dacia", "Fiesta Van" , 127.45, 2019, "Elettrico", 200);
        Motocicletta c = new Motocicletta();
        c.Impostazioni("Ducati","Kawasaki" , 35.3, 2005, "Ibrida", "Enduro");
        Garage parcheggio = new Garage();
        System.out.println(parcheggio.entrare(a));
        System.out.println(parcheggio.entrare(b));
        System.out.println(parcheggio.entrare(c));
        System.out.println(parcheggio.uscire(1));
        System.out.println(parcheggio);
    }
    
}
