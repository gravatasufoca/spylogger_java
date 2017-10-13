package br.com.gravata.repository;

import br.com.gravata.model.Mensagem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * criado por bruno em 11/10/17.
 */

@RepositoryRestResource(collectionResourceRel = "mensagem", path = "mensagem")
public interface MensagemRepositorio extends PagingAndSortingRepository<Mensagem,Integer> {
    List<Mensagem> findByTexto(@Param("texto") String texto);
}
