/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Aluno;

public class AlunoDAO {
    private Connection conn;

    public AlunoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException {
        System.out.println("2");
//        String sql = "select * from tvalunos where usuario = '"
//                + aluno.getUsuario()
//                + "' and senha = '"
//                + aluno.getSenha()
//                + "'";

        //PreparedStatement statement = conn.prepareStatement(sql);
        
        String sql = "select * from tvalunos where usuario = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
//        System.out.println("3");
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
}
