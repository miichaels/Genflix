package cinema;

public class Pessoa implements interfacePessoa{

    // ATRIBUTOS
    private String nome;
    private int idade;
    private String email;
    private int senha;

    // METODOS IMPLEMENTADOS DE INTERFACEPESSOA
    @Override
    public void logar() {

    }

    @Override
    public void deslogar() {

    }

    public Pessoa(String nome, int idade, String email, int senha) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getSenha()
    {
        return senha;
    }

    public void setSenha(int senha)
    {
        this.senha = senha;
    }
}
