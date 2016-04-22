
package br.javaweb.ecommerce.modelo;

public class TrataLoginNegocio {

    public boolean verificaLogin(Usuario usuario) {

        if("penha".equals(usuario.getUsuario()) && "123456".equals(usuario.getSenha())) {
            return true;
        }
       
        return false;
    }
}
