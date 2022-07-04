package cinema;

public class Cliente extends Pessoa{

    public Cliente(String nome, int idade, String email, int senha) {
        super(nome, idade, email, senha);
    }

    // ATRIBUTOS
    private String platinum;
    private String backCard;


    // METODOS
    public void Cliente(){
        System.out.println("Se você quer virar um cliente Super Mega Master Blaster Platinum, nos procure e cadastre o seu cartão!!\n");
        System.out.println();
    }

    public void Cliente (String cartao){
        System.out.println("\nParabéns!! Você é um cliente Super Mega Master Blaster Platinum e pode ver o filme que quiser!!! *-*\n");
    }

    // SOBRESCREVENDO OS METODOS LOGAR E DESLOGAR

    @Override
    public void logar(){
        System.out.println("Sejá bem-vindo, ");
    }

    @Override
    public void deslogar(){
        System.out.println("Volte logo meu querido");

    }


}
