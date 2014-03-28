/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.PrestadorDAO;
import com.sina.model.entities.Prestador;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class PrestadorRN {
    
    private PrestadorDAO dao;

    public PrestadorRN() {
        this.dao = new PrestadorDAO();
    }
    
    public void salvarPrestador(Prestador prestador){
         this.dao.salvarObjeto(prestador);
    }
    
    public void atualizarPrestador(Prestador prestador){
        this.dao.salvarOuAtualizarObjeto(prestador);
    }
    
    public void deletarPrestador(Prestador prestador){
        this.dao.deletarObjeto(prestador);
    }
    
    public List<?> listarPrestador(Class<Prestador> classe ){
        return this.dao.listarObjetos(classe);
    }
    
    
}
