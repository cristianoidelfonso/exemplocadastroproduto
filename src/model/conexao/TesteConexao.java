/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.conexao;

import javax.swing.JOptionPane;

/**
 *
 * @author Idelfonso
 */
public class TesteConexao {
    
    public static void main(String[] args) {
        if(ConnectionFactory.getConnection() != null){
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
            System.out.println("Conectado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Houve um problema com a conexão");
            System.out.println("Houve um problema na conexao");
        }
    }
    
}
