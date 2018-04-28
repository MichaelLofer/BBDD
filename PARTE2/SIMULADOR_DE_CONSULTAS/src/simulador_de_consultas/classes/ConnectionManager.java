/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador_de_consultas.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mr.blissfulgrin
 */
public class ConnectionManager
{
    private final String url = "jdbc:postgresql://localhost:5432/test";
    private final String[] user = {"administrador1","gestor1","empleado1","supervisor1","cliente1"};
    private final String[] password = {"administrador1","gestor1","empleado1","supervisor1","cliente1"};
    private Connection conn;

    public Connection conect(int permmision) 
    {
        conn = null;
        if (permmision < user.length)
        {
            try 
            {
                Class.forName("org.postgresql.Driver").newInstance(); 
                conn = DriverManager.getConnection(url, user[permmision], password[permmision]);
                System.out.println("Conectado!!");
            } 
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            } 
            catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) 
            {
                System.out.println("Driver no detectado");
            }
        }
        else
        {
            System.out.println("ROL NO VALIDO");
        }
        return conn;
    }
    
    public void disconnect()
    {
        try 
        {
            conn.close();
            System.out.println("Desconectado!!");
        } 
        catch (SQLException ex) 
        {
            System.out.println("No se ha podido cerrar la conexión");
        } 
        catch (Exception ex)
        {
            System.out.println("Excepción capturada");
        }
    }
}
