/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefeitura;

/**
 *
 * create table prefeitura
(
codigo serial not null,
nome varchar (100) not null,
nr_funcionarios int not null,
fundacao date not null,
constraint pk_prefeitura primary key (codigo)
)
 * @author Administrador
 */
public class Prefeitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
