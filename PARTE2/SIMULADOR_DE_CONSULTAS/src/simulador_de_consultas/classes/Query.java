/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador_de_consultas.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
        answer = error;
        this.permmision = permmision;
    }
    
    public String getQuery(String query)
    {
        reset();
        Connection conn = conection.conect(permmision);
        if (conn != null)
        {
            Statement stmnt;
            ResultSet rs;
            try 
            {
                stmnt = conn.createStatement();
                rs = stmnt.executeQuery(query);
                ResultSetMetaData rsmd = rs.getMetaData();
                
                String[] name = new String[rsmd.getColumnCount()];
                int size [] = new int[rsmd.getColumnCount()];
                for (int x = 1; x <= name.length; x++)
                {
                    name[x-1] = rsmd.getColumnLabel(x);
                    size[x-1] = rsmd.getColumnDisplaySize(x)+10;
                }
                add("",0);
                char [] line = new char [answer.length()+20*size.length];
                for (int x = 0; x < line.length; x++)
                {
                    line[x] = '-';
                }
                
                add(String.copyValueOf(line),0);
                for (int x = 1; x <= name.length; x++)
                {
                    add(name[x-1],size[x-1]);
                }
                add("",0);
                add(String.copyValueOf(line),0);
                while(rs.next())
                {  
                    for (int x = 1; x <= name.length; x++)
                    {
                        add(rs.getString(x),size[x-1]);
                    }
                    add("",0);
                }
                add(String.copyValueOf(line),0);
                
                rs.close();
                stmnt.close();
            } 
            catch (SQLException ex) 
            {
                add(ex.getMessage(),0);
                add("SQL Exception",0);
            }
        }
        conection.disconnect();
        return answer;
    }
    
    public String getQuery(int query)
    {
        switch (query)
        {
            case 1:
                return "Artículos presentes en la base de datos, mostrando su código y el precio de venta.\n"+
                        getQuery("SELECT \"Codigo_Barras\", \"PVP\"\n" +
                         "	FROM \"Articulo\"");
            case 2:
                return "Número total de surtidores que hay en la gasolinera.\n"+
                        getQuery("SELECT COUNT (*)\n" +
                        "	FROM \"Surtidor\"");
            case 3:
                return "Total del dinero facturado por las tiendas de la gasolinera desde la implementación de la base de datos.\n"+
                        getQuery("SELECT \"Tipo\", sum (\"PVP\"*\"cantidad\") as \"Dinero\"\n" +
                        "	FROM \"Contiene\"\n" +
                        "	INNER JOIN \"Articulo\" ON \"Contiene\".\"Codigo_Barras\" = \"Articulo\".\"Codigo_Barras\"\n" +
                        "	GROUP BY \"Tipo\"");
            case 4:
                return "Nombre de los empleados de las tiendas que trabajan en turno de mañana.\n"+
                        getQuery("SELECT \"Nombre\"\n" +
                        "	FROM \"Empleado\"\n" +
                        "	WHERE \"Empleado\".\"Turno\" = 'MAÑANA' AND \"Empleado\".\"Numero_surtidor\" IS NULL");
            case 5:
                return "Los puntos totales canjeados por los socios de la gasolinera, junto con su identificador y nombre.\n"+
                        getQuery("SELECT \"Nombre_Usuario\", SUM (\"Puntos_canjeados\")as \"Puntos Totales\"\n" +
                        "	FROM \"Canjea\"\n" +
                        "	GROUP BY \"Nombre_Usuario\"\n" +
                        "	");
            case 6:
                return "Los 5 artículos más canjeados por los socios.\n"+
                        getQuery("SELECT \"Codigo_Barras\", COUNT (*) as \"VECES\"\n" +
                        "	FROM \"Canjea\"\n" +
                        "	GROUP BY \"Codigo_Barras\"\n" +
                        "	ORDER BY \"VECES\" DESC\n" +
                        "	LIMIT 5\n" +
                        "	");
            case 7:
                return "Importe total devuelto en los tickets en todos los sorteos realizados hasta la fecha.\n"+
                        getQuery("SELECT SUM(\"cantidad\"*\"PVP\")/2 AS \"Dinero premiado\"\n" +
                        "	FROM \"Articulo\"\n" +
                        "	INNER JOIN (SELECT \"Codigo_Barras\",\"cantidad\"\n" +
                        "			FROM \"Ticket\"\n" +
                        "			INNER JOIN \"Contiene\" ON \"Ticket\".\"Codigo\" = \"Contiene\".\"Codigo\"\n" +
                        "			WHERE \"Fecha_premiado\" IS NOT NULL) AS \"TABLA\" ON \"Articulo\".\"Codigo_Barras\" = \"TABLA\".\"Codigo_Barras\"\n" +
                        "	");
            case 8:
                return "Grado de satisfacción medio de las opiniones que los clientes han realizado por internet, mostrando la puntuación media.\n"+
                        getQuery("SELECT AVG(\"Puntos\") AS \"OPINION MEDIA\"\n" +
                        "	FROM \"Opinion\"");
            case 9:
                return "Número de tickets que ha emitido cada tienda, mostrando el número de tickets y el nombre de la tienda. Ordenar la salida de mayor a menor.\n"+
                        getQuery("SELECT \"Tipo\", COUNT(\"Codigo\") AS \"NUMERO DE TICKETS\"\n" +
                        "	FROM \"Ticket\"\n" +
                        "	GROUP BY \"Tipo\"\n" +
                        "	ORDER BY \"NUMERO DE TICKETS\" DESC");
            case 10:
                return "Tienda en la que más tickets han sido premiados hasta la fecha.\n"+
                        getQuery("SELECT \"Tipo\", COUNT(*) AS \"TIQUETS PREMIADOS\"\n" +
                        "	FROM \"Ticket\"\n" +
                        "	WHERE \"Fecha_premiado\" IS NOT NULL\n" +
                        "	GROUP BY \"Tipo\"\n" +
                        "	ORDER BY \"TIQUETS PREMIADOS\" DESC\n" +
                        "	LIMIT 1");
            case 11:
                return "De los repostajes que proporcionan puntos a los socios, total de litros repostados en cada surtidor, ordenando la salida de menor a mayor.\n"+
                        getQuery("SELECT \"Numero_surtidor\", SUM (\"litros\") AS \"Litros\"\n" +
                        "	FROM \"Reposta\"\n" +
                        "	WHERE \"puntos\" IS NOT NULL\n" +
                        "	GROUP BY \"Numero_surtidor\"\n" +
                        "	ORDER BY \"Litros\" ASC\n");
            case 12:
                return "Tamaño medio y el precio/litro de los surtidores de gasolina y gasoil.\n"+
                        getQuery("(SELECT \"Surtidor\".\"Descripcion\" AS \"TIPO\", AVG (\"Surtidor\".\"Precio\") AS \"PRECIO MEDIO\", AVG (\"Surtidor\".\"Capacidad\") AS \"CAPACIDAD MEDIA\"\n" +
                        "	FROM \"Gasolina\"\n" +
                        "	INNER JOIN \"Surtidor\" ON \"Gasolina\".\"Numero_surtidor\" = \"Surtidor\".\"Numero_surtidor\"\n" +
                        "	GROUP BY \"TIPO\")\n" +
                        "UNION\n" +
                        "(SELECT \"Surtidor\".\"Descripcion\" AS \"TIPO\", AVG (\"Surtidor\".\"Precio\") AS \"PRECIO MEDIO\", AVG (\"Surtidor\".\"Capacidad\") AS \"CAPACIDAD MEDIA\"\n" +
                        "	FROM \"Gasoleo\"\n" +
                        "	INNER JOIN \"Surtidor\" ON \"Gasoleo\".\"Numero_surtidor\" = \"Surtidor\".\"Numero_surtidor\"\n" +
                        "	GROUP BY \"TIPO\")");
            case 13:
                return "Número trabajadores que tiene cada tienda y cada surtidor, ordenando la salida de menor a mayor.\n"+
                        getQuery("SELECT \"Tipo\",\"Numero_surtidor\", COUNT(*) AS \"CANTIDAD\"\n" +
                        "	FROM \"Empleado\"\n" +
                        "	GROUP BY \"Tipo\", \"Numero_surtidor\"\n" +
                        "	ORDER BY \"CANTIDAD\" ASC");
            case 14:
                return "Número de surtidores de gasolina, gasoil, GLP e Hidrógeno que hay en la gasolinera, ordenado de mayor a menor.\n"+
                        getQuery("SELECT \"Descripcion\", COUNT(*) AS \"Cantidad\"\n" +
                        "	FROM \"Surtidor\"\n" +
                        "	GROUP BY \"Descripcion\"\n" +
                        "	ORDER BY \"Cantidad\" DESC");
            case 15:
                return "Porcentaje de surtidores de gasolina, gasoil, GLP e Hidrógeno que existen en la gasolinera.\n"+
                        getQuery("SELECT \"Descripcion\", (COUNT(*)*100/\n" +
                        "	(SELECT COUNT(*)\n" +
                        "		FROM \"Surtidor\"))AS \"Porcentaje\"\n" +
                        "	FROM \"Surtidor\"\n" +
                        "	GROUP BY \"Descripcion\"");
            case 16:
                return "Valor total de todos los artículos canjeados por los socios en el último mes.\n"+
                        getQuery("SELECT SUM(\"PVP\") AS \"Dinero\"\n" +
                        "	FROM \"Canjea\"\n" +
                        "	INNER JOIN \"Articulo\" ON \"Canjea\".\"Codigo_Barras\" = \"Articulo\".\"Codigo_Barras\";");
            case 17:
                return "Fechas en las que no se puede utilizar los surtidores que se encuentren averiados.\n"+
                        getQuery("SELECT \"Numero_surtidor\",\"Fecha_Reapertura\"\n" +
                        "	FROM \"Surtidor\"\n" +
                        "	WHERE \"Fecha_Reapertura\" IS NOT NULL");
            case 18:
                return "Supervisores (DNI y nombre) de los empleados que trabajan en surtidores de GLP, en los que los socios hayan repostado y, posteriormente, canjeado artículos.\n"+
                        getQuery("SELECT \"Empleado\".\"DNI\", \"Empleado\".\"Nombre\"\n" +
                        "	FROM(SELECT DISTINCT \"Empleado\".\"dni_jefe\" AS \"DNI\"\n" +
                        "		FROM \"Reposta\"\n" +
                        "		INNER JOIN \"Canjea\"ON \"Reposta\".\"Nombre_Usuario\" = \"Canjea\".\"Nombre_Usuario\" INNER JOIN \"Surtidor\" ON \"Reposta\".\"Numero_surtidor\" = \"Surtidor\".\"Numero_surtidor\" INNER JOIN \"Empleado\" ON \"Reposta\".\"Numero_surtidor\" = \"Empleado\".\"Numero_surtidor\" \n" +
                        "		WHERE \"Surtidor\".\"Descripcion\" = 'GLP')AS \"JEFES\"\n" +
                        "	INNER JOIN \"Empleado\" ON \"JEFES\".\"DNI\" = \"Empleado\".\"DNI\"");
            case 19:
                return "Artículos que han sido canjeados por los socios y que hayan sido comprados en las tiendas.\n"+
                        getQuery("SELECT DISTINCT \"Canjea\".\"Codigo_Barras\"\n" +
                        "	FROM \"Canjea\"\n" +
                        "	INNER JOIN \"Contiene\" ON \"Canjea\".\"Codigo_Barras\" = \"Contiene\".\"Codigo_Barras\"");
            case 20:
                return "Artículos que ni hayan sido canjeados por los socios ni que hayan sido comprados en las tiendas.\n"+
                        getQuery("SELECT \"Codigo_Barras\"\n" +
                        "	FROM \"Articulo\"\n" +
                        "	WHERE \"Codigo_Barras\" NOT IN (	(SELECT \"Codigo_Barras\"\n" +
                        "						FROM \"Contiene\")\n" +
                        "					UNION\n" +
                        "					(SELECT \"Codigo_Barras\"\n" +
                        "						FROM \"Canjea\"))");
            case 21:
                return "Articulos que hayan sido canjeados por los socios y que hayan sido comprados en las tiendas, pero que no aparezcan en tickets premiados.\n"+
                        getQuery("SELECT DISTINCT \"Canjea\".\"Codigo_Barras\"\n" +
                        "	FROM \"Canjea\"\n" +
                        "	INNER JOIN \"Contiene\" ON \"Canjea\".\"Codigo_Barras\" = \"Contiene\".\"Codigo_Barras\"\n" +
                        "	WHERE \"Canjea\".\"Codigo_Barras\" NOT IN (SELECT \"Codigo_Barras\"\n" +
                        "							FROM \"Contiene\"\n" +
                        "							INNER JOIN \"Ticket\" ON \"Contiene\".\"Codigo\" = \"Ticket\".\"Codigo\"\n" +
                        "							WHERE \"Ticket\".\"Fecha_premiado\" IS NOT NULL)");
            default:
                return "INDEX ERROR";
        }
    }
    
    private void add (String str, int size)
    {
        if (answer.equals(error))
            answer = "";
        
        if (str == null)
        {
            str = "null";
            if (size == 0)
            {
                size = 20;
            }
        }
        
        if (size == 0)
            answer += str+"\n";
        else
        {
            char [] voi = new char [(size - str.length())/20 < 1? 1:(size - str.length())/20];
            for (int x = 0; x < voi.length; x++)
            {
                voi[x] = '\t';
            }
            answer += str+String.copyValueOf(voi);
        }
    }
    private void reset ()
    {
        answer = error;
    }
}
