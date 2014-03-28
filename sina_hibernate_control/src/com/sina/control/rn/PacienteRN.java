/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.PacienteDAO;
import com.sina.model.entities.Paciente;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class PacienteRN {

    private PacienteDAO dao;

    public PacienteRN() {
        this.dao = new PacienteDAO();
    }

    public void salvarPaciente(Paciente paciente) {
        this.dao.salvarObjeto(paciente);
    }

    public void atualizarPaciente(Paciente paciente) {
        this.dao.salvarOuAtualizarObjeto(paciente);
    }

    public void deletarPaciente(Paciente paciente) {
        this.dao.deletarObjeto(paciente);
    }

    public List<?> listarPaciente(Class<Paciente> classe) {
        return this.dao.listarObjetos(classe);
    }
}
