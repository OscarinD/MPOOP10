/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

/**
 *
 * @author alumno
 */
public class MPOOP10 {//interfaces no se pueden tener mètodos concretos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        InstrumentoMusical instrumento = flauta;
        instrumento.tocar();
        instrumento.afinar();
        
        double pi = Math.PI;//estàtico nunca cambia, final es una constante, publico porque podenos acceder a PI
        double e = Math.E;
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Math.abs(-100));//Crearemos interfaz parecida a Math
        
        System.out.println("El mes "+Meses.NUEVE+" corresponde a: ");
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        //Ejercicio interfaz, clases abstractas,lìnea dimensiòn 1, superficie
        //Figura interfaz, variable de la dimensiòn, de las hojas crear tres atributos y tres mètodos
    }
}
