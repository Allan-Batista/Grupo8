package green.trash.back;

// Morador ou moradores?
public class Morador extends Usuario{

    public Morador(String nome, String email, String senha, String dtCadastro, Integer telefone) {
        super(nome, email, senha, dtCadastro, telefone);
    }

    public Morador() {
    }

    // Void com envio de String
    public void enviarSugestao(String novaSugestao){

    }


}
