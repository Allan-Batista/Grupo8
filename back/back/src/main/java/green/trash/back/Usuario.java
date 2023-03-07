package green.trash.back;

public abstract class Usuario {

    private String nome;
    private String email;
    private String senha;
    // Data em String ou utilizar um Date?
    private String dtCadastro;
    // Telefone Integer? Se for manter em formato numérico.. utilizar Long
    private Integer telefone;

    public Usuario(String nome, String email, String senha, String dtCadastro, Integer telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dtCadastro = dtCadastro;
        this.telefone = telefone;
    }

    public Usuario(){}

    public void exibirDiaColeta(){

    }
    // Não abstrato.. pois a exibição sera executada da mesma forma
    public void exibirTotalReciclado(){

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dtCadastro='" + dtCadastro + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
