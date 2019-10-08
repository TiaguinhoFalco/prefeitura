/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Prefeitura;

/**
 *
 * @author Administrador
 */
public class DaoPrefeitura {
    
    
    public static boolean inserir(Prefeitura objeto) {
        String sql = "INSERT INTO prefeitura (nome, nr_funcionarios, fundacao) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setInt(2, objeto.getNr_funcionarios());
            ps.setDate(3, Date.valueOf(objeto.getFundacao()));
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
     public static void main(String[] args) {
        Prefeitura objeto = new Prefeitura();
        objeto.setNome("Carlos");
        objeto.setNr_funcionarios(3);
        objeto.setFundacao(LocalDate.parse("11/01/1988", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
      public static boolean alterar(Prefeitura objeto) {
        String sql = "UPDATE prefeitura SET nome = ?, nr_funcionarios = ?, fundacao = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome()); 
            ps.setInt(2, objeto.getNr_funcionarios());
            ps.setDate(3, Date.valueOf(objeto.getFundacao()));
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      
        public static boolean excluir(Prefeitura objeto) {
        String sql = "DELETE FROM prefeitura WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
