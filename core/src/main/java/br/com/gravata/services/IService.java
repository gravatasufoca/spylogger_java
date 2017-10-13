package br.com.gravata.services;

import br.com.gravata.model.EntidadeAbstrata;

import java.util.Map;

/**
 * criado por bruno em 31/08/17.
 */
public interface IService<E extends EntidadeAbstrata> {
    Map<String, String> salvar(E entidade);
}
