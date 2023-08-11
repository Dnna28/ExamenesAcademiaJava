
package com.prueba;

import java.util.HashMap;
import java.util.Map;

public class UsuarioServicio {

    private final Map<Long, UsuarioDto> usuarios = new HashMap<>();

    public UsuarioDto crearUsuario(Long id, String nombre) {
        UsuarioDto nuevoUsuario = new UsuarioDto(id, nombre);
        usuarios.put(id, nuevoUsuario);
        return nuevoUsuario;
    }

    public UsuarioDto obtenerUsuario(Long id) {
        return usuarios.get(id);
    }

    public UsuarioDto actualizarUsuario(Long id, String nombre) {
        if (usuarios.containsKey(id)) {
            UsuarioDto usuarioActualizado = new UsuarioDto(id, nombre);
            usuarios.put(id, usuarioActualizado);
            return usuarioActualizado;
        } else {
            throw new IllegalArgumentException("El usuario con el ID dado no existe.");
        }
    }
}
