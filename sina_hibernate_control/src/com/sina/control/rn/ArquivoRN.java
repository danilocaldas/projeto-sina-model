/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.ArquivoDAO;
import com.sina.model.entities.Arquivo;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class ArquivoRN {
    
    private ArquivoDAO dao;

    public ArquivoRN() {
        this.dao = new ArquivoDAO();
    }
    
    public void salvarArquivo(Arquivo arquivo){
         this.dao.salvarObjeto(arquivo);
    }
    
    public void atualizarArquivo(Arquivo arquivo){
        this.dao.salvarOuAtualizarObjeto(arquivo);
    }
    
    public void deletarArquivo(Arquivo arquivo){
        this.dao.deletarObjeto(arquivo);
    }
    
    public List<?> listarArquivo(Class<Arquivo> classe ){
        return this.dao.listarObjetos(classe);
    }
    
}
