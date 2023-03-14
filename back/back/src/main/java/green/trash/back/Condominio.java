package green.trash.back;

import java.util.ArrayList;
import java.util.List;

public class Condominio {

    private String email;
    private String endereco;
    List<Usuario> inquilinos;

    public Condominio(String email, String endereco, List<Usuario> inquilinos) {
        this.email = email;
        this.endereco = endereco;
        this.inquilinos = new ArrayList<>();
    }

    public Condominio(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Usuario> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(List<Usuario> inquilinos) {
        this.inquilinos = inquilinos;
    }

    public void addInquilino(Usuario novoUsuario){
        if(novoUsuario != null){
            inquilinos.add(novoUsuario);
        }
    }

    public List<Usuario> exibirInquilinos(){
        return inquilinos;
    }

    public void removerInquilino(Usuario usuarioParaRemover){
        if(usuarioParaRemover != null){
            inquilinos.remove(usuarioParaRemover);
        }
    }

    @Override
    public String toString() {
        return "Condominio{" +
                "email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", inquilinos=" + inquilinos +
                '}';
    }
}
