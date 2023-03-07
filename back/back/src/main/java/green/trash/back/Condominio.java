package green.trash.back;

import java.util.ArrayList;
import java.util.List;

public class Condominio {

    //inquilinos no plural
    List<Usuario> inquilinos;

    public Condominio(List<Usuario> inquilinos) {
        this.inquilinos = new ArrayList<>();
    }

    public void addInquilino(Usuario novoUsuario){
        if(novoUsuario != null){
            inquilinos.add(novoUsuario);
        }
    }

    //Ideal é retornar a lista de inquilinos
    public List<Usuario> exibirInquilinos(){
        return inquilinos;
    }

    //Precisa receber um inquilino
    public void removerInquilino(Usuario usuarioParaRemover){
        if(usuarioParaRemover != null){
            inquilinos.remove(usuarioParaRemover);
        }
    }

}
