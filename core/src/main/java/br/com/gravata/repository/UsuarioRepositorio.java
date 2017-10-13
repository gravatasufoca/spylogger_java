package br.com.gravata.repository;

import br.com.gravata.model.Usuario;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * criado por bruno em 11/10/17.
 */

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepositorio extends Repositorio<Usuario> {
    List<Usuario> findByEmailIgnoreCaseAndSenha(@NotNull String email,@NotNull String senha);
    List<Usuario> findByEmailIgnoreCase(@NotNull String email);
}
