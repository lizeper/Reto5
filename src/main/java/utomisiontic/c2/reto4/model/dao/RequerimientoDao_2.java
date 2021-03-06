package utomisiontic.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utomisiontic.c2.reto4.model.vo.Requerimiento_2;
import utomisiontic.c2.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, "
                    + "l.Nombre || ' ' || l.Segundo_Apellido as 'Nombre Lider', "
                    + "t.Codigo_Tipo, t.Estrato "
                    + "FROM Proyecto p  INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider "
                    + "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo "
                    + "WHERE (p.Fecha_Inicio >= '2019-09-01' AND p.Fecha_Inicio <= '2019-09-09' AND p.Ciudad = 'Pereira')";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setFecIni(resultSet.getString("Fecha_Inicio"));
                requerimiento_2.setNombreCiudad(resultSet.getString("Ciudad"));
                requerimiento_2.setConstructora(resultSet.getString("Constructora"));
                requerimiento_2.setNombreLider(resultSet.getString("Nombre Lider"));
                requerimiento_2.setCodigoTipo(resultSet.getInt("Codigo_Tipo"));
                requerimiento_2.setEstrato(resultSet.getInt("Estrato")
                );

                respuesta.add(requerimiento_2);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento 2 -> " + e);

        } finally {
            if (conexion != null) {
                conexion.close();

            }
        }
        return respuesta;
    }

    public ArrayList<Requerimiento_2> requerimiento2(String fIni, String fFin, String nCiu) throws SQLException {

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, "
                    + "l.Nombre || ' ' || l.Segundo_Apellido as 'Nombre Lider', "
                    + "t.Codigo_Tipo, t.Estrato "
                    + "FROM Proyecto p  INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider "
                    + "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo "
                    + "WHERE (p.Fecha_Inicio >= '" + fIni + "' AND p.Fecha_Inicio <= '" + fFin + "' AND p.Ciudad = '" + nCiu + "')";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                        resultSet.getString("Fecha_Inicio"),
                        resultSet.getString("Ciudad"),
                        resultSet.getString("Constructora"),
                        resultSet.getString("Nombre Lider"),
                        resultSet.getInt("Codigo_Tipo"),
                        resultSet.getInt("Estrato")
                );

                respuesta.add(requerimiento_2);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error en la consulta SQL Requerimiento 2 -> " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return respuesta;
    }

    public ArrayList<String> obtenerCiudades() throws SQLException {

        ArrayList<String> ciudades = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();
        
        try {
            String consulta = "SELECT distinct Ciudad FROM Proyecto order by Ciudad asc ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ciudades.add(resultSet.getString("Ciudad"));
            }
            
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Seleccione Cuidad> " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return ciudades;
    }
}
