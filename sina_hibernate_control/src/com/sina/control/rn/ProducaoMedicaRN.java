/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.ProducaoMedicaDAO;
import com.sina.model.entities.ProducaoMedica;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class ProducaoMedicaRN {
    
    private ProducaoMedicaDAO dao;

    public ProducaoMedicaRN() {
        this.dao = new ProducaoMedicaDAO();
    }
    
    public void salvarProducaoMedica(ProducaoMedica producaoMedica){
         this.dao.salvarObjeto(producaoMedica);
    }
    
    public void atualizarProducaoMedica(ProducaoMedica producaoMedica){
        this.dao.salvarOuAtualizarObjeto(producaoMedica);
    }
    
    public void deletarProducaoMedica(ProducaoMedica producaoMedica){
        this.dao.deletarObjeto(producaoMedica);
    }
    
    public List<?> listarProducaoMedica(Class<ProducaoMedica> classe ){
        return this.dao.listarObjetos(classe);
    }
    
}
