/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Porto
 */
public class ItensVenda {
    
    private int idItensVenda;
    private int quantidade;

    private Livro livro;
    private Venda venda;

    public ItensVenda() {
    }

    public int getIdItensVenda() {
        return idItensVenda;
    }

    public void setIdItensVenda(int idItensVenda) {
        this.idItensVenda = idItensVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void setInt(int quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
