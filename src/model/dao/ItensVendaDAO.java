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
import model.bean.ItensVenda;

/**
 *
 * @author Porto
 */
public class ItensVendaDAO {
    public void create(ItensVenda intensVenda){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

try{
	stmt = con.prepareStatement("INSERT INTO itensVenda (quantidade) VALUES (?) ");
	stmt.setInt(1, intensVenda.getQuantidade());
        
	
	
	
	stmt.executeUpdate();


	JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
} catch (SQLException ex){
	JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
	Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
} finally{

}
    }
}
