
package controller;

import dao.AlunoDAO;
import dao.Conexao;
import model.Aluno;
import view.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleLogin {
    private Login tela1;
    
    public ControleLogin(Login tela1){
        this.tela1 = tela1;
    }
    
    public void loginAluno(){
        Aluno aluno = new Aluno (null,
        tela1.getTxt_usuario().getText(),
        tela1.getTxt_senha().getText());
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            ResultSet res = dao.consultar(aluno);
            if(res.next()){
                JOptionPane.showMessageDialog(tela1, "Login efetuado", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(tela1, "Login não efetuado", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(tela1, "Erro de conexão",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
