/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainInterfaces;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Tuple;

public final class DBAccess {
    
private Connection conexion;
    
    public DBAccess(){
        conectar();
    }

    public Connection getConexion() { return conexion; }
    public void setConexion(Connection conexion) { this.conexion = conexion; }
    public DBAccess conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String DB = "jdbc:oracle:thin:@dbeafit.cyzd3byk9uno.us-east-1.rds.amazonaws.com:1521:DB20161";
            conexion= DriverManager.getConnection(DB,"jbusta16","mlyBQM93");
          
            if(conexion!=null){
                System.out.println("Conexion exitosa a esquema JBUSTA16");
            } else {
                System.out.println("Conexion fallida");
            }
        } catch(Exception e){ e.printStackTrace(); }
    return this;
    }
    
    public boolean ejecutar(String sql){
     try{
         Statement st = getConexion().createStatement(
         ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
         st.executeUpdate(sql);
         getConexion().commit();
     }catch(SQLException e){
         try {
             conexion.rollback();
         } catch (SQLException ex) {
             Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
        e.printStackTrace();
        return false;
    }
     return true;
    }
    
    public ResultSet consultar(String sql) throws SQLException{
        ResultSet salida;
        PreparedStatement st = getConexion().prepareStatement(sql);
        salida = st.executeQuery();         
        return salida;
    }
    
    public ResultSet funcion(String NombreFuncion,SQLType tipoRetorno, ArrayList parametros) throws SQLException{
        CallableStatement st = conexion.prepareCall("{?=call "+ NombreFuncion +"}");
        st.registerOutParameter(1,tipoRetorno);
        for(int i = 2; i <= parametros.size();i++) st.setObject(i,parametros.get(i-2));
        return st.executeQuery();
    }
    
    public void procedureWrite(String NombreProcedure,ArrayList parametros) throws SQLException{
        CallableStatement st = conexion.prepareCall("{call "+ NombreProcedure +"}");
        for(int i = 1; i <= parametros.size();i++) st.setObject(i,parametros.get(i-1));
        st.execute();
        getConexion().commit();
    }
    
    public ArrayList<String> procedureSearch(String NombreProcedure, ArrayList parametrosIN_OUT) throws SQLException{
        CallableStatement st = conexion.prepareCall("{call "+ NombreProcedure +"}");
        ArrayList salida = new ArrayList();
        for(int i = 1;i <= parametrosIN_OUT.size();i++) {
            
            if(parametrosIN_OUT.get(i-1) instanceof String){
                st.setString(i,(String)parametrosIN_OUT.get(i-1));
            }else{
                salida.add(i);
                st.registerOutParameter(i,(Integer)parametrosIN_OUT.get(i-1));
            }
            
        }
        st.execute();
        for(int i = 0; i < salida.size();i++) salida.set(i,st.getString((Integer)salida.get(i)));
        
        return salida;
    }
    
        /**
     * Convierte un ResultSet a un Array
     * @param datos ResultSet con datos
     * @return String[] con los datos del Set
     */
    public String[] rsToArray(ResultSet datos) throws SQLException{
        ArrayList<String> items = new ArrayList(100);    
        while(datos.next()){
            items.add(datos.getString(1));
        }
        return items.toArray(new String[items.size()]);
    }
 
}