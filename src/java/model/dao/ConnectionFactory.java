/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class ConnectionFactory {
    public static Connection getConnection(String url, String username, String
            password) {
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do BD não encontrado.");
            return null;
        } catch (SQLException ex) {
            System.out.println("Não conseguiu se conectar ao BD.");
            return null;
        }
        return c;
    }
}
