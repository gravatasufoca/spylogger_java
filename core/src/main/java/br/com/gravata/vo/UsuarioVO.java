package br.com.gravata.vo;

import br.com.gravata.model.Aparelho;
import br.com.gravata.model.Usuario;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;
import java.util.HashSet;

/**
 * Created by bruno on 02/12/16.
 */
public class UsuarioVO implements Serializable{

    private Integer id;
    private String email;
    private String senha;
    private AparelhoVO aparelhoVO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    @JsonSetter("ds_email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    @JsonSetter("ds_senha")
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public AparelhoVO getAparelhoVO() {
        return aparelhoVO;
    }

    @JsonSetter("perfil")
    public void setAparelhoVO(AparelhoVO aparelhoVO) {
        this.aparelhoVO = aparelhoVO;
    }

    public Usuario toUsuario(){
        Usuario usuario=new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setId(id);

        if (aparelhoVO!= null) {
            Aparelho aparelho=new Aparelho();
            aparelho.setChave(aparelhoVO.getChave());
            aparelho.setNomeAparelho(aparelhoVO.getNome());
            aparelho.setId(aparelhoVO.getId());
            usuario.setAparelhos(new HashSet<Aparelho>());
            usuario.getAparelhos().add(aparelho);
        }

        return usuario;
    }
}
