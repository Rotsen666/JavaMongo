/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamongo;
/**
 *
 * @author 88605
 */
public class JavaMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("PRIMERO NOS MUESTRA SI LA CONECCION FUE CORRECTA");
        Conexion con = new Conexion();
        System.out.println("Aqui se muestran datos de hoy");
        con.mostrar();
        System.out.println("Aqui un insertar dato");
        con.insertar("lonches");
        System.out.println("Otra vez el mostrar");
        con.mostrar();
        System.out.println("AQUI SE ACTUALIZA UN DATO");
        con.actualizar("lonches", "alfonson't");
        System.out.println("Otra vez el mostrar");
        con.mostrar();
        System.out.println("Aqui eliminamos");
        con.eliminar("alfonson't");
        System.out.println("Otra vez el mostrar");
        con.mostrar();  
    }
    
}
