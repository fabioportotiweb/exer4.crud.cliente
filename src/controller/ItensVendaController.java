/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.bean.ItensVenda;
import model.dao.ItensVendaDAO;

/**
 *
 * @author Porto
 */
public class ItensVendaController {
    public void create(int quantidade){
		ItensVenda intensVenda = new ItensVenda();
		ItensVendaDAO itensVendaDAO = new ItensVendaDAO();
                                
                intensVenda.setInt(quantidade);

                itensVendaDAO.create(intensVenda);
}
}
