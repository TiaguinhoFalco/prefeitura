/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
   
    private Integer codigo;
    private String nome;
    private Integer nr_funcionarios;
    private LocalDate fundacao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNr_funcionarios() {
        return nr_funcionarios;
    }

    public void setNr_funcionarios(Integer nr_funcionarios) {
        this.nr_funcionarios = nr_funcionarios;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    @Override
    public String toString() {
        return nome ;
    }
    
    
    
}
