package model.produto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conexao.ConnectionFactory;

/**
 * Classe responsavel pela persistencia no banco de dados
 *
 * @author Idelfonso
 */
public class ProdutoDAO {
    
    public void buscarPeloCodigo(String c) throws SQLException{
        
        //Comando
        String sql = "SELECT * FROM produto WHERE codigo = ?";
        //Prepara o comando SQL
        PreparedStatement pst = ConnectionFactory.prepararSQL(sql);
        pst.setString(1, )
        
    }

}
