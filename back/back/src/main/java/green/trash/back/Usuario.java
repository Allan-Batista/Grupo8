package green.trash.back;

public abstract class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String dtCadastro;


    public Usuario(String nome, String email, String senha, String dtCadastro) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dtCadastro = dtCadastro;
    }

    public Usuario(){}

    public void exibirDiaColeta(){

    }
    public abstract void exibirTotalReciclado();

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dtCadastro='" + dtCadastro + '\'' +
                '}';
    }
}
