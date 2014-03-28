/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.ProcedimentoDAO;
import com.sina.model.entities.Procedimento;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class ProcedimentoRN {
    
    private ProcedimentoDAO dao;
    
    public ProcedimentoRN(){
        this.dao = new ProcedimentoDAO();
    }
    
     public void salvarProcedimento(Procedimento procedimento){
         this.dao.salvarObjeto(procedimento);
    }
    
    public void atualizarProcedimento(Procedimento procedimento){
        this.dao.salvarOuAtualizarObjeto(procedimento);
    }
    
    public void deletarProcedimento(Procedimento procedimento){
        this.dao.deletarObjeto(procedimento);
    }
    
    public List<?> listarProcedimento(Class<Procedimento> classe ){
        return this.dao.listarObjetos(classe);
    }
    
}
