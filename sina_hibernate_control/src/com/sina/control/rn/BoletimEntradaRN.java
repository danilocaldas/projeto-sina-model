/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.BoletimEntradaDAO;
import com.sina.model.entities.BoletimEntrada;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class BoletimEntradaRN {
    
    private BoletimEntradaDAO dao;

    public BoletimEntradaRN() {
        this.dao = new BoletimEntradaDAO();
    }
    
    public void salvarBoletimEntrada(BoletimEntrada boletimEntrada){
         this.dao.salvarObjeto(boletimEntrada);
    }
    
    public void atualizarBoletimEntrada(BoletimEntrada boletimEntrada){
        this.dao.salvarOuAtualizarObjeto(boletimEntrada);
    }
    
    public void deletarBoletimEntrada(BoletimEntrada boletimEntrada){
        this.dao.deletarObjeto(boletimEntrada);
    }
    
    public List<?> listarBoletimEntrada(Class<BoletimEntrada> classe ){
        return this.dao.listarObjetos(classe);
    }
    
    
    
}
