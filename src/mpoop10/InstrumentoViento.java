/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop10;

/**
 *
 * @author alumno
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{//se puede heredar de varias clases

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    @Override
    public String tipoInstrunento() {
        return "Instrumento de viento";
    }
    
}
