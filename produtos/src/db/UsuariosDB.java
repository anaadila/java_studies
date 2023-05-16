package db;

import java.util.ArrayList;
import java.util.List;

import models.Usuario;

public class UsuariosDB {
    
    private List<Usuario> usuarioList = new ArrayList<>();

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void addNovoUsuario(Usuario usuario) {
        Integer id = usuarioList.size() + 1;
        usuario.setId(id);
        usuarioList.add(usuario);
    }
}
