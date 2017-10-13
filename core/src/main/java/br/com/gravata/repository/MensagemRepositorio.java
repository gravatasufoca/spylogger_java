package br.com.gravata.repository;

import br.com.gravata.model.Mensagem;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * criado por bruno em 11/10/17.
 */

@RepositoryRestResource(collectionResourceRel = "mensagem", path = "mensagem")
public interface MensagemRepositorio extends Repositorio<Mensagem> {

}
