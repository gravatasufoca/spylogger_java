package br.com.gravata.controller;

import br.com.gravata.services.UsuarioService;
import br.com.gravata.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * criado por bruno em 13/10/17.
 */

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST)
    public Integer inserirUsuario(UsuarioVO usuario){

    }
}
