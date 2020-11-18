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
import model.bean.Livro;



/**
 *
 * @author Porto
 */
public class LivroDAO {
    public void create(Livro livro){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

try{
	stmt = con.prepareStatement("INSERT INTO livro (nome,autor,editora,precoUnitario) VALUES (?,?,?,?) ");
	stmt.setString(1, livro.getNome());
        stmt.setString(2, livro.getAutor());
        stmt.setString(3, livro.getEditora());
        stmt.setDouble(4, livro.getPrecoUnitario());
        
	
	
	
	stmt.executeUpdate();


	JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
} catch (SQLException ex){
	JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
	Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
} finally{

}
    }
}
