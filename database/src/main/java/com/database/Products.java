package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Products {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/productos";
        String user = "campus2023";
        String password = "campus2023";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // Crear la tabla inventario
            // String createTableInventarioSQL = "CREATE TABLE IF NOT EXISTS inventario(" +
            //                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
            //                         "name VARCHAR(50));";
            // statement.execute(createTableInventarioSQL);

            // Crear la tabla categorias
            // String createTableCategoriaSQL = "CREATE TABLE IF NOT EXISTS categoria(" +
            //                                 "id INT PRIMARY KEY AUTO_INCREMENT, "+
            //                                 "name VARCHAr(50));";
            
            // statement.execute(createTableCategoriaSQL);                                                

            // Inserciones a la tabla categoria
            // String query = "INSERT INTO categoria (name) VALUES " +
            //                 "('Pinturas')," +
            //                 "('Herramientas')";
            
            // statement.executeUpdate(query);

            // ------------------

            // String query1 = "SELECT id, name FROM categoria;";
            // ResultSet rs = statement.executeQuery(query1);

            // while (rs.next()) {
            //     int id = rs.getInt("id");
            //     String name = rs.getString("name");
            //     System.out.println(MessageFormat.format("Id Categoria {0} - Nombre {1}", id, name));
            // }
            
            // OPERACION UPDATE
            // String updateSQL = "UPDATE categoria SET name = 'Grifos' WHERE id = 1;";
            // int rowsUpdated = statement.executeUpdate(updateSQL);
            // System.out.println("Numero de filas actualizadas: " + rowsUpdated);
            

            // OPERACION DELETE
            // String deleteSQL = "DELETE FROM categoria WHERE id = 5;";
            // int rowsDeleted = statement.executeUpdate(deleteSQL);
            // System.out.println("Numero de filas eliminadas: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}