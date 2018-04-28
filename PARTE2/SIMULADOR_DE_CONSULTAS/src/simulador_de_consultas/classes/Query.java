/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador_de_consultas.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mr.blissfulgrin
 */
public class Query
{
    private final ConnectionManager conection;
    private String answer;
    private final int permmision;
    private final String error = "ERROR";
    
    public Query (int permmision)
    {
        conection = new ConnectionManager();
        answer = "";
        this.permmision = permmision;
    }
    public String getQuery(String query)
    {
        reset();
        Connection conn = conection.conect(permmision);
        if (conn != null)
        {
            try 
            {
                Statement stmnt = conn.createStatement();
                ResultSet rs = stmnt.executeQuery(query);

                add("============================");
                while(rs.next())
                {
                    //add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
                }
                add("============================");

            } 
            catch (SQLException ex) 
            {
                add(ex.getMessage());
                add("SQL Exception");
            }
        }
        return answer;
    }
    
    public String getQuery(int query)
    {
        reset();
        Connection conn = conection.conect(permmision);
        if (conn != null)
        {
            switch (query)
            {
                case 1:
                    consulta1(conn);
                break;
                case 2:
                    consulta2(conn);
                break;
                case 3:
                    consulta3(conn);
                break;
                case 4:
                    consulta4(conn);
                break;
                case 5:
                    consulta5(conn);
                break;
                case 6:
                    consulta6(conn);
                break;
                case 7:
                    consulta7(conn);
                break;
                case 8:
                    consulta8(conn);
                break;
                case 9:
                    consulta9(conn);
                break;
                case 10:
                    consulta10(conn);
                break;
                case 11:
                    consulta11(conn);
                break;
                case 12:
                    consulta12(conn);
                break;
                case 13:
                    consulta13(conn);
                break;
                case 14:
                    consulta14(conn);
                break;
                case 15:
                    consulta15(conn);
                break;
                case 16:
                    consulta16(conn);
                break;
                case 17:
                    consulta17(conn);
                break;
                case 18:
                    consulta18(conn);
                break;
                case 19:
                    consulta19(conn);
                break;
                case 20:
                    consulta20(conn);
                break;
                case 21:
                    consulta21(conn);
                break;
            }
        }
        conection.disconnect();
        return answer;
    }
    
    private void consulta1(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta2(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta3(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta4(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta5(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta6(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta7(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta8(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta9(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta10(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta11(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta12(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta13(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta14(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta15(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta16(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta17(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta18(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta19(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta20(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    private void consulta21(Connection conn)
    {
        try 
        {
            String query = "SELECT * FROM \"Cliente\" ORDER BY nombre;";
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(query);
            
            add("Listado de clientes");
            add("============================");
            while(rs.next())
            {
                add("["+rs.getString(1).trim()+"]: "+rs.getString("nombre").trim()+".");
            }
            add("============================");
            
        } 
        catch (SQLException ex) 
        {
            add(ex.getMessage());
            add("SQL Exception");
        }
    }
    
    private void add (String str)
    {
        if (str.equals(error))
            str = "";
        answer += str+"\n";
    }
    private void reset ()
    {
        answer = error;
    }
}
