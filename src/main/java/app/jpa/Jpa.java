package app.jpa;

import model.Produto;
import model.ProdutoDAO;

public class Jpa {

    public static void main(String[] args) {
        Produto p1 = new Produto(1,"PLACA MAE",50);
        
        ProdutoDAO pdao = new ProdutoDAO();
        for(Produto e: pdao.obterTodosRegistros()) {
            System.out.println(e);
        }
   
    }
}
