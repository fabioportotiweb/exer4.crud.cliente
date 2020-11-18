/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.bean.Livro;
import model.dao.LivroDAO;

/**
 *
 * @author Porto
 */
public class LivroController {
    public void create(String nome,String autor,String editora,double precoUnitario){
		Livro livro = new Livro();
		LivroDAO livroDAO = new LivroDAO();
                                
                livro.setNome(nome);
                livro.setAutor(autor);
                livro.setEditora(editora);
                livro.setPrecoUnitario(precoUnitario);

                livroDAO.create(livro);
}
}
