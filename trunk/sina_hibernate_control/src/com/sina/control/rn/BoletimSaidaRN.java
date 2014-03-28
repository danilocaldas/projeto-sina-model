/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.BoletimSaidaDAO;
import com.sina.model.entities.BoletimSaida;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class BoletimSaidaRN {
    
    private BoletimSaidaDAO dao;

    public BoletimSaidaRN() {
        this.dao = new BoletimSaidaDAO();
    }
    
    public void salvarBoletimSaida(BoletimSaida boletimSaida){
         this.dao.salvarObjeto(boletimSaida);
    }
    
    public void atualizarBoletimSaida(BoletimSaida boletimSaida){
        this.dao.salvarOuAtualizarObjeto(boletimSaida);
    }
    
    public void deletarBoletimSaida(BoletimSaida boletimSaida){
        this.dao.deletarObjeto(boletimSaida);
    }
    
    public List<?> listarBoletimSaida(Class<BoletimSaida> classe ){
        return this.dao.listarObjetos(classe);
    }
    
}
