/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
//import java.net.UnknownHostException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author 88605
 */
public class Conexion {
    //----------Variables------------//
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();

    //----------Contructor-----------//
    public Conexion() {
        Mongo mongo = new Mongo("localhost", 27017);
        BaseDatos = mongo.getDB("ejCrud");
        coleccion = BaseDatos.getCollection("crud");
        System.out.println("Conexion  establecida");
    }

    //-----C-->Create,R-->Read,U-->Update,D-->Delete-----//
    public boolean insertar(String nombre) {
        document.put("nombre", nombre);
        coleccion.insert(document);
        return true;
    }

    public void mostrar() {
        DBCursor cursor = coleccion.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public boolean actualizar(String nombreViejo, String nombreNuevo) {
        document.put("nombre", nombreViejo);
        BasicDBObject documentNuevo = new BasicDBObject();
        documentNuevo.put("nombre", nombreNuevo);
        coleccion.findAndModify(document, documentNuevo);
        return true;
    }
    
    public boolean eliminar(String nombre){
        document.put("nombre",nombre);
        coleccion.remove(document);      
        return true;
    }
    
    
}
