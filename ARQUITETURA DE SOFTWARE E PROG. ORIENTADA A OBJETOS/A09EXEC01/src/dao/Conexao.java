/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author unifgustasouza
 */
public class Conexao {
    public Connection getConnection() throws SQLException {
        System.out.println("1");
        Connection conexao = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5433/alunos",
                "postgres", "fei");
        return conexao;
    }
}
