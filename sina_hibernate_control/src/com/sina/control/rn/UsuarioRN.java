/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sina.control.rn;

import com.sina.model.daos.UsuarioDAO;
import com.sina.model.entities.Usuario;
import java.util.List;

/**
 *
 * @author ritacosta
 */
public class UsuarioRN {
    
    private UsuarioDAO dao;

    public UsuarioRN() {
        this.dao = new UsuarioDAO();
        
    }
   
    public void salvarUsuario(Usuario usuario){
         this.dao.salvarObjeto(usuario);
    }
    
    public void atualizarUsuario(Usuario usuario){
        this.dao.salvarOuAtualizarObjeto(usuario);
    }
    
    public void deletarUsuario(Usuario usuario){
        this.dao.deletarObjeto(usuario);
    }
    
    public List<?> listarUsuario(Class<Usuario> classe ){
        return this.dao.listarObjetos(classe);
    }
    
    
    
}
