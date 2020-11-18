/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.bean.Venda;

/**
 *
 * @author Porto
 */
public class VendaDAO {
    public void create(Venda venda){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

try{
	stmt = con.prepareStatement("INSERT INTO venda (data,valorTotal,cliente) VALUES (?,?,?) ");
	stmt.setString(1, venda.getData());
        stmt.setDouble(2, venda.getValorTotal());
        //stmt.setString(3, venda.getCliente()); // como tentar faz coisas
        
        
	
	
	
	stmt.executeUpdate();


	JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
} catch (SQLException ex){
	JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
	Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
} finally{

}
    }
}
