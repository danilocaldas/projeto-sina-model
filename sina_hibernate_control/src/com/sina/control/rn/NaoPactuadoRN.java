/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.NaoPactuadoDAO;
import com.sina.model.entities.NaoPactuado;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class NaoPactuadoRN {

    private NaoPactuadoDAO dao;

    public NaoPactuadoRN() {
        this.dao = new NaoPactuadoDAO();
    }

    public void salvarNaoPactuado(NaoPactuado naoPactuado) {
        this.dao.salvarObjeto(naoPactuado);
    }

    public void atualizarNaoPactuado(NaoPactuado naoPactuado) {
        this.dao.salvarOuAtualizarObjeto(naoPactuado);
    }

    public void deletarNaoPactuado(NaoPactuado naoPactuado) {
        this.dao.deletarObjeto(naoPactuado);
    }

    public List<?> listarNaoPactuado(Class<NaoPactuado> classe) {
        return this.dao.listarObjetos(classe);
    }
}
