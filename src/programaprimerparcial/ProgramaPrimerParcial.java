/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaprimerparcial;

/**
 *
 * @author chech
 */
public class ProgramaPrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
public class vehiculo{
    protected String color; //atributo
    protected int pasajeros;
    protected int combustible;
    public vehiculo(){} //constructor de la clase
    public void avanzar(){}
    public void parar(){}
}
public class vehiculoterr extends vehiculo{
    protected int ruedas;
    protected String marca;
    public vehiculoterr(){}
    public void derrapar(){}
    public void bocinar(){}
}
public class vehiculoaer extends vehiculo{
    protected String aerolinea;
    protected int turbinas;
    public vehiculoaer(){}
    public void ascender(){}
    public void descender(){}
}
public class automovil extends vehiculoterr{
    public automovil(String nuevoColor,String nuevaMarca){
        color=nuevoColor;
        marca=nuevaMarca;
    }
    public automovil(int cantPasajeros,int capCombustible,int cantRuedas){
        pasajeros=cantPasajeros;
        combustible=capCombustible;
        ruedas=cantRuedas;
    }
}
public class moto extends vehiculoterr{
    public moto(String nuevoColor,String nuevaMarca){
        color=nuevoColor;
        marca=nuevaMarca;
    }
    public moto(int cantPasajeros,int capCombustible,int cantRuedas){
        pasajeros=cantPasajeros;
        combustible=capCombustible;
        ruedas=cantRuedas;
    }
}
public class avion extends vehiculoaer{
    public avion(String nuevoColor,String nuevaAerolinea){
        color=nuevoColor;
        aerolinea=nuevaAerolinea;
    }
    public avion(int cantPasajeros,int capCombustible,int cantTurbinas){
        pasajeros=cantPasajeros;
        combustible=capCombustible;
        turbinas=cantTurbinas;
    }
}
public class helicoptero extends vehiculoaer{
    public helicoptero(String nuevoColor,String nuevaAerolinea){
        color=nuevoColor;
        aerolinea=nuevaAerolinea;
    }
    public helicoptero(int cantPasajeros,int capCombustible,int cantTurbinas){
        pasajeros=cantPasajeros;
        combustible=capCombustible;
        turbinas=cantTurbinas;
    }
}
}

