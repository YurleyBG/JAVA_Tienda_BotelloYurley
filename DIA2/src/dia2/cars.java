/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia2;

/**
 *
 * @author Uniminuto Tibu
 */

// primera parte de una clase = Nombre
public class cars {
    // Atributos(Caracteristicas)
    String marca;
    String Modelo ;
    int ano;
    String tipoCombustible;
    int puertas;
    int asiento;
    int motor;
    int Cilindraje;
    int caballoFuerza;
    String color;
    int CantLlantas;

    // constructor 
    public cars (){}
    public cars( String marca,String modelo,int ano ){
        this.marca=marca;
        this.Modelo=modelo;
        this.ano=ano;
        this.caballoFuerza=140;
        this.puertas=5;
        this.asiento=5;
        this.motor=2800;
        this.color="Negro";
        this.CantLlantas=4;
       
    }
    public cars( String marca,String Modelo, int ano,String tipoCombustible,int puertas,int asiento,String color,int motor){
      this.marca=marca;
      this.Modelo=Modelo;
      this.ano=ano;
      this.caballoFuerza=caballoFuerza;
      this.puertas=puertas;
      this.asiento=asiento;
      this.motor=motor;
      this.color=color;
      this.CantLlantas=CantLlantas;
      this.tipoCombustible=tipoCombustible;
      this.Cilindraje=Cilindraje;
  }

    @Override
    public String toString() {
        return "cars{" + "marca=" + marca + ", Modelo=" + Modelo + ", ano=" + ano + ", tipoCombustible=" + tipoCombustible + ", puertas=" + puertas + ", asiento=" + asiento + ", motor=" + motor + ", Cilindraje=" + Cilindraje + ", caballoFuerza=" + caballoFuerza + ", color=" + color + ", CantLlantas=" + CantLlantas + '}';
    }
    
    
}
