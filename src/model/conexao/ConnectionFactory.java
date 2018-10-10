/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Idelfonso
 */
public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DBNAME = "poo2";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection conn = null;

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
            return conn;

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Ocorreu um  erro inesperado" + e);
        }
    }
    
    /**
     * Prepara uma SQL pra ser executada como PreparedStatement
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public static PreparedStatement prepararSQL(String sql)
            throws SQLException {

        return getConnection().prepareStatement(sql);

    }
}
