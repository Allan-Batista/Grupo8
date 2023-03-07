package green.trash.back;

public class Sindico extends Usuario{
    // Manter em Sindico ou passar para Condomínio?
    private String endereco;

    public Sindico(String nome, String email, String senha, String dtCadastro, Integer telefone, String endereco) {
        super(nome, email, senha, dtCadastro, telefone);
        this.endereco = endereco;
    }

    public Sindico(){}

    // Void.. com envio de String
    public void criarAviso(String novoAviso){

    }

    public void atualizarColeta(){

    }

    public void adicionarColeta(){

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Sindico{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
