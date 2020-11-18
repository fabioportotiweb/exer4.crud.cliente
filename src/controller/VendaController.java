/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.bean.Cliente;
import model.bean.Livro;
import model.bean.Venda;
import model.dao.VendaDAO;

/**
 *
 * @author Porto
 */
public class VendaController {
    public void create(String data,double valorTotal,Cliente cliente){
		Venda venda = new Venda();
		VendaDAO VendaDAO = new VendaDAO();

                venda.setData(data);
                venda.setDouble(valorTotal);
                venda.setCliente(cliente);
                
                
                VendaDAO.create(venda);
}
}
