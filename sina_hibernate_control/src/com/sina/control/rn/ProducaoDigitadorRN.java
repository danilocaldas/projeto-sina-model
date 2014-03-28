/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.ProducaoDigitadorDAO;
import com.sina.model.entities.ProducaoDigitador;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class ProducaoDigitadorRN {
    
    private ProducaoDigitadorDAO dao;

    public ProducaoDigitadorRN() {
        this.dao = new ProducaoDigitadorDAO();
    }
    
    public void salvarProducaoDigitador(ProducaoDigitador producaoDigitador){
         this.dao.salvarObjeto(producaoDigitador);
    }
    
    public void atualizarProducaoDigitador(ProducaoDigitador producaoDigitador){
        this.dao.salvarOuAtualizarObjeto(producaoDigitador);
    }
    
    public void deletarProducaoDigitador(ProducaoDigitador producaoDigitador){
        this.dao.deletarObjeto(producaoDigitador);
    }
    
    public List<?> listarProducaoDigitador(Class<ProducaoDigitador> classe ){
        return this.dao.listarObjetos(classe);
    }
    
}
