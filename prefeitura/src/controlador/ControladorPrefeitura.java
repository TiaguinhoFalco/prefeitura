/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPrefeitura;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Prefeitura;
import tela.manutencao.ManutencaoPrefeitura;

import tela.manutencao.ManutencaoPrefeitura;

/**
 *
 * @author Administrador
 */
public class ControladorPrefeitura {

    public static void inserir(ManutencaoPrefeitura man){
        Prefeitura objeto = new Prefeitura();
        objeto.setNome(man.jtfNome.getText());
        objeto.setNr_funcionarios(Integer.parseInt(man.jtfNr_funcionarios.getText()));
        objeto.setFundacao(LocalDate.parse(man.jtfFundacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        boolean resultado = DaoPrefeitura.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoPrefeitura man){
        Prefeitura objeto = new Prefeitura();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setNr_funcionarios(Integer.parseInt(man.jtfNr_funcionarios.getText()));
        objeto.setFundacao(LocalDate.parse(man.jtfFundacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        boolean resultado = DaoPrefeitura.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(ManutencaoPrefeitura man){
        Prefeitura objeto = new Prefeitura();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoPrefeitura.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
