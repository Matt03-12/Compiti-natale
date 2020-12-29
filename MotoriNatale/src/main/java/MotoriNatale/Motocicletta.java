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
public class Motocicletta extends VeicoloAMotore{
    
    private String Tipo;
    
    public void  Impostazioni (String marca,String modello,double cilindrata,int anno,String Alimentazione,String Tipo){
    
    this.marca=marca;
    this.modello=modello;
    this.cilindrata=cilindrata;
    this.anno=anno;
    this.Alimentazione=Alimentazione;
    this.Tipo=Tipo;
   }
   @Override
   public String toString(){
       return 
              " Marca: " + marca +
              " Modello: " + modello +
              " Cilindrata: " + cilindrata +
              " Anno: " + anno +
              " Alimentazione: " + Alimentazione +
              " Tipologia: " + Tipo; 
   }
    
}
