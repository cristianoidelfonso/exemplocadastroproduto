package model.produto;

import model.entidades.Produto;

/**
 *
 * @author Idelfonso
 */
public class ProdutoBO {

    private final ProdutoDAO dao;
    
    public ProdutoBO(){
        dao = new ProdutoDAO();
    }
    
    
    /**
     * Faz as verificações de negocio e manda salvar no banco de dados
     *
     * @param p Produto a ser salvo
     */
    public void salvar(Produto p) {

        //Verificar se já existe um produto com o mesmo código
        if(dao.buscarPeloCodigo(p.getCodigo()) != null) {
            // produto ja existe
        }else{
            // salvar produto no banco de dados
        }
        
    }
}
