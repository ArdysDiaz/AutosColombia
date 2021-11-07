package com.iudigital.autoscolombia.serviciosImple;

import com.iudigital.autoscolombia.modelo.Usuario;
import com.iudigital.autoscolombia.repositorios.RepoUsurio;
import com.iudigital.autoscolombia.servicios.SercivioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @AllArgsConstructor
public class impUsuario implements SercivioUsuario {

    private RepoUsurio repoUsurio ;

    @Override
    public List<Usuario> getUsuarios() {
        return repoUsurio.findAll();
    }

    @Override
    public Optional<Usuario> getUsuarioId(Long id) {
        Optional<Usuario> u = repoUsurio.findById(id);
        if (!u.isPresent()){
            new Throwable("DNI no existe...");
        }
        return u;
    }

    @Override
    public Usuario saveUsuario(Usuario u) {
        return repoUsurio.save(u);
    }

    @Override
    public Usuario updateUsuario(Usuario u) {
        Optional<Usuario> usuario = repoUsurio.findById(u.getId());
        if (!usuario.isPresent()){
            new Throwable("El usuario no existe en la base de datos");
        }
        return repoUsurio.save(u);
    }
}
