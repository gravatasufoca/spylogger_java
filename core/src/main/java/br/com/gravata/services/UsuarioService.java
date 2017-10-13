package br.com.gravata.services;

import br.com.gravata.model.Usuario;
import br.com.gravata.repository.Repositorio;
import br.com.gravata.repository.UsuarioRepositorio;
import br.com.gravata.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * criado por bruno em 13/10/17.
 */
public class UsuarioService extends AbstractService<Usuario> implements IService {

    private static final String MSG_USUARIO_CADASTRADO = "Usu\u00E1rio j\u00E1 cadastrado.";
    private static final String MSG_SENHA_INVALIDA = "Senha inv\u00E1lida";
    public static final String EXISTENTE = "EXISTENTE";
    public static final String INVALIDO = "INVALIDO";

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;


    protected Repositorio<Usuario> getRepositorio() {
        return usuarioRepositorio;
    }

    public Integer salvar(UsuarioVO usuarioVO){
        Usuario usuario=usuarioVO.toUsuario();

        if(validarObrigatorios(usuario)){
            Usuario user = usuarioJaCadastrado(usuario);
            if(user!=null){
                if(!user.getSenha().equals(usuario.getSenha())){
                    erros.put(INVALIDO,MSG_SENHA_INVALIDA);
                    return null;
                }

                if(usuario)

            }

        }

    }

    public Map<String, String> salvar(Usuario usuario) {
        return erros;
    }

    private Usuario usuarioJaCadastrado(Usuario usuario) {
        List<Usuario> usuarios = usuarioRepositorio.findByEmailIgnoreCase(usuario.getEmail());
        if(!usuarios.isEmpty()){
            return usuarios.get(0);
        }
        return null;
    }
}
