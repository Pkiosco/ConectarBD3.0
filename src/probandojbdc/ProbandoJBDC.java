/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandojbdc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author educacionit
 */
public class ProbandoJBDC {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception  {
        Connection c = DriverManager.getConnection("jDBc:mysql://LocalHost:3306/test","root","");
        PreparedStatement psi =  c.prepareStatement("INSERT INTO alumnos ( alu_nombre, alu_apellido)  VALUES  ( ?,?)");
        PreparedStatement psu =  c.prepareStatement("CAMBIAR A SENTENCIA PARA UN UPDATE");
        PreparedStatement psd =  c.prepareStatement("CAMBIAR A SENTENCIA PARA UIN DELETE");
        Insertar(psi,"juan","lopez");
        Insertar(psi,"juan","lopez");
        Delete(psi,"juan","lopez");
        Update(psi,"juan","lopez");
        
        } 
        private static void Insertar (PreparedStatement psi, String Nombre, String Apellido) throws Exception {

         psi.setString(1, Nombre);
         psi.setString(2, Apellido);
         psi.execute();
         }
        
         private static void Update (PreparedStatement psu, String Nombre, String Apellido) throws Exception {
         psu.setString(1, Nombre);
         psu.setString(2, Apellido);
         psu.execute();
         }
         
         private static void Delete (PreparedStatement psd, String Nombre, String Apellido) throws Exception {
         psd.setString(1, Nombre);
         psd.setString(2, Apellido);
         psd.execute();
         }
    
}

