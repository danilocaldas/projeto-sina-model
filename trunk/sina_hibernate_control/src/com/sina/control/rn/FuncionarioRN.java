/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.FuncionarioDAO;
import com.sina.model.entities.Funcionario;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class FuncionarioRN {
    
    private FuncionarioDAO dao;

    public FuncionarioRN() {
        this.dao = new FuncionarioDAO();
    }
    
    public void salvarFuncionario(Funcionario funcionario){
         this.dao.salvarObjeto(funcionario);
    }
    
    public void atualizarFuncioanrio(Funcionario funcionario){
        this.dao.salvarOuAtualizarObjeto(funcionario);
    }
    
    public void deletarFuncioanrio(Funcionario funcionario){
        this.dao.deletarObjeto(funcionario);
    }
    
    public List<?> listarFuncionario(Class<Funcionario> classe ){
        return this.dao.listarObjetos(classe);
    }
    
}
