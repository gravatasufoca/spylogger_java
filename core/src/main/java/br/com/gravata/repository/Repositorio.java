package br.com.gravata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;


/**
 * Interface que define um repositrio de entidades.
 *
 * @author bruno.canto
 *
 * @param <E>
 *            Tipo da entidade.
 */
public interface Repositorio<E> extends PagingAndSortingRepository<E,Serializable> {

}
