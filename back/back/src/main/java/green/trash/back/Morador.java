package green.trash.back;

// Morador ou moradores?
public class Morador extends Usuario{

    public Morador(String nome, String email, String senha, String dtCadastro) {
        super(nome, email, senha, dtCadastro);
    }

    public Morador() {
    }

    @Override
    public void exibirTotalReciclado() {

    }

    public void enviarSugestao(String novaSugestao){

    }

}
