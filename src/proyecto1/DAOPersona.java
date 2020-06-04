/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author gabriel
 */
public class DAOPersona {
    
    
    
    public boolean guardar(Persona p){
        boolean res=false;
        ConexionDB con=ConexionDB.getInstance();
        String sql="insert into persona (clave, nombre, direccion, telefono) values "
                + "('" + p.getClave() + "','" + p.getNombre() + "','" + p.getDireccion() + "','" + 
                p.getTelefono() + "')";
        
        res=con.execute(sql);
        
        return res;
    }
}
