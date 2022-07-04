package cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        // ATRIBUTOS
        String login, nome, email, segredo, segredo2;
        int opcao, selecaoFilme, user;
        long telefone;
        char resposta = ' ', comprarLer = ' ', resp = ' ';

        Scanner ler = new Scanner(System.in);

        Cliente usuario = new Cliente("Michael", 24, "Michael@hotmail.com", 123);

        // ABERTURA
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                           Cine-Genflix                           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // OPCAO DE ENTRADA
        System.out.println("Para acessar a plataforma GenFlix, digite: \n");

        try {
            System.out.println("1- Se você deseja se cadastrar \t2- Se você já é cadastrado");
            user = ler.nextInt();

            if (user != 1 && user != 2) {
                System.out.println("\nErro!\n");
                System.out.println("\n FIM DO PROGRAMA! POR FAVOR, TENTE NOVAMENTE.");
                System.exit(0);
            }


            // CADASTRO DO USUARIO
            switch (user) {
                case 1:
                    System.out.println("Digite seu nome:");
                    nome = ler.next();

                    System.out.println("Digite seu usuário:");
                    email = ler.next();

                    // EXCEPTION
                    try {
                        System.out.println("Digite o número de celular");
                        telefone = ler.nextLong();
                    } catch (Exception erro) {

                        System.out.println("\n Erro!" + erro + "\n\n FIM DO PROGRAMA!");
                        System.exit(0);
                    }

                    System.out.println("Digite uma senha alfanumérica:");
                    segredo = ler.next();

                    System.out.println("Confirme a senha");
                    segredo2 = ler.next();

                    if (segredo.equals(segredo2)) {
                        System.out.println("Cadastro realizado com sucesso!");
                    } else {
                        System.out.println("As senhas não conferem, verifique e tente novamente!");

                        System.out.println("Digite uma senha alfanumérica");
                        segredo = ler.next();

                        System.out.println("Confirma a senha");
                        segredo2 = ler.next();

                        if (!segredo.equals(segredo2)) {
                            System.out.println("\nERRO!\n");
                            System.out.println("\nFIM DO PROGRAMA!\n");
                            System.exit(0);
                        } else {
                            System.out.println("Cadastro realizado com sucesso!");
                        }

                    }
                    break;


                // USUARIO CADASTRADO
                case 2: {
                    // LOGIN E SENHA
                    System.out.println("Insira seu usuário ");
                    login = ler.next();
                    System.out.println("Digite sua senha: ");
                    login = ler.next();
                    usuario.Cliente();
                }
                break;
            }

            //PÁGINA INICIAL
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                    Bem vindo ao Cine-Genflix                     ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n");

            // COLLECTIONS
            // FILMES DE ACAO
            ArrayList<Filme> filmesDeAcao = new ArrayList<Filme>();
            Filme morbius = new Filme();
            morbius.setNome("Morbius");
            morbius.setGenero("Ação");
            morbius.setSinopse("Na tentativa de se curar de uma rara doença sanguínea, o cientista Michael Morbius (Jared Leto) \r\n"
                    + "acaba infectando a si mesmo com um tipo de vampirismo. Sinopse oficial ainda não divulgada. \r\n"
                    + "Classificação indicativa 14 anos, contém violência, drogas lícitas e linguagem imprópria. \r\n"
                    + "\r\n");
            morbius.setElenco("Jared Leto, Adria Arjona, Matt Smith (IV)");
            morbius.setDiretor("Daniel Espinosa");
            morbius.setDistribuidora("Columbia Tristar");
            morbius.setClassificacao(14);
            morbius.setDuracao(105);

            Filme doutorEstranho = new Filme();
            doutorEstranho.setNome("Doutor Estranho no Multiverso da Loucura");
            doutorEstranho.setGenero("Ação");
            doutorEstranho.setSinopse("O aguardado filme trata da jornada do Doutor Estranho rumo ao desconhecido. \r\n"
                    + "Além de receber ajuda de novos aliados místicos e outros já conhecidos do público, \r\n"
                    + "o personagem atravessa as realidades alternativas incompreensíveis e perigosas do Multiverso. \r\n"
                    + "para enfrentar um novo e misterioso adversário. \r\n" + "\r\n");
            doutorEstranho.setElenco("Benedict Cumberbatch, Elizabeth Olsen, Benedict Wong");
            doutorEstranho.setDiretor("Scott Derrickson");
            doutorEstranho.setDistribuidora("Walt Disney");
            doutorEstranho.setClassificacao(12);
            doutorEstranho.setDuracao(125);

            Filme batman = new Filme();
            batman.setNome("Batman");
            batman.setGenero("Ação");
            batman.setSinopse(
                    "Nos dois anos em que protegeu as ruas como Batman (Robert Pattinson), provocando medo no coração dos criminosos, \r\n"
                            + "Bruce Wayne mergulhou nas sombras de Gotham City. É quando um assassino mira a elite de Gotham com uma série de maquinações \r\n"
                            + "sádicas, um rastro de pistas enigmáticas leva Batman, o Maior Detetive do Mundo, a investigar o submundo da cidade, onde \r\n"
                            + "encontra personagens como Selina Kyle, a Mulher-Gato (Zoe Kravitz), Oswald Cobblepot, conhecido como Pinguim (Colin Farrell), \r\n"
                            + "Carmine Falcone (John Turturro) e Edward Nashton, também conhecido como Charada (Paul Dano). É medida que surgem evidências e \r\n"
                            + "as ações do criminoso apontam para uma direção mais clara, Batman precisa forjar novas relações, desmascarar o culpado e trazer \r\n"
                            + "justiça a Gotham City, há tanto tempo atormentada pelo abuso de poder e pela corrupção. \r\n"
                            + "\r\n");
            batman.setElenco("Benedict Cumberbatch, Elizabeth Olsen, Benedict Wong");
            batman.setDiretor("Scott Derrickson");
            batman.setDistribuidora("Walt Disney");
            batman.setClassificacao(14);
            batman.setDuracao(176);

            filmesDeAcao.add(morbius);
            filmesDeAcao.add(doutorEstranho);
            filmesDeAcao.add(batman);

            // FILMES DE COMEDIA
            ArrayList<Filme> filmesDeComedia = new ArrayList<Filme>();
            Filme oPesoDoTalento = new Filme();
            oPesoDoTalento.setNome("O Peso do Talento");
            oPesoDoTalento.setGenero("Comédia");
            oPesoDoTalento.setSinopse("Criativamente insatisfeito e enfrentando a ruína financeira,\r\n"
                    + "Nicolas Cage deve aceitar uma oferta de US$ 1 milhão para comparecer ao aniversário de Javi (Pedro Pascal), um superfã perigoso. \r\n"
                    + "As coisas tomam um rumo totalmente inesperado quando Cage é recrutado por um agente da CIA (Tiffany Haddish) \r\n"
                    + "e forçado a viver de acordo com sua própria lenda, canalizando seus personagens mais icônicos e amados na tela para salvar a si \r\n"
                    + "mesmo e seus entes queridos.Com uma carreira constru�da para este momento, o experiente ator deve assumir o papel de sua vida. \r\n"
                    + "\r\n");
            oPesoDoTalento.setElenco("Nicolas Cage, Kristin Burr, Michael Nilon, Kevin Turen");
            oPesoDoTalento.setDiretor("Tom Gormican");
            oPesoDoTalento.setDistribuidora("Paris Filme");
            oPesoDoTalento.setClassificacao(14);
            oPesoDoTalento.setDuracao(105);

            Filme superQuem = new Filme();
            superQuem.setNome("Super Quem?");
            superQuem.setGenero("Comédia");
            superQuem.setSinopse("Cedric é um ator que, após anos tendo sua carreira vista como chacota, \r\n"
                    + "encontra uma oportunidade que promete mudar sua vida: dar vida ao personagem super-herói Badman! \r\n"
                    + "Nome familiar, não?... Só que um acidente de carro não estava nos planos de Cedric. Assim que o ator \r\n"
                    + "desperta da batida, sua vida real se torna um apagão, e Cedric passa a acreditar que ele é legitimamente Badman, \r\n"
                    + "o super-herói. \r\n" + "\r\n");
            superQuem.setElenco("Philippe Lacheau, Julien Arruti, Tarek Boudali, Elodie Fontan, Alice Dufour");
            superQuem.setDiretor("Philippe Lacheau");
            superQuem.setDistribuidora("Paris Filme");
            superQuem.setClassificacao(12);
            superQuem.setDuracao(82);

            Filme cidadePerdida = new Filme();
            cidadePerdida.setNome("Cidade Perdida");
            cidadePerdida.setGenero("Comódia");
            cidadePerdida.setSinopse("Uma romancista em um tour de livro com seu modelo de capa é envolvida em uma \r\n"
                    + "tentativa de sequestro que os leva a uma aventura implacável na selva. \r\n" + "\r\n");
            cidadePerdida.setElenco("Sandra Bullock, Channing Tatum, Daniel Radcliffe e Brad Pitt");
            cidadePerdida.setDiretor("Aaron Nee/Adam Nee");
            cidadePerdida.setDistribuidora("Paramount");
            cidadePerdida.setClassificacao(10);
            cidadePerdida.setDuracao(112);

            filmesDeComedia.add(oPesoDoTalento);
            filmesDeComedia.add(superQuem);
            filmesDeComedia.add(cidadePerdida);

            // FILMES DE DRAMA
            ArrayList<Filme> filmesDeDrama = new ArrayList<Filme>();
            Filme belfast = new Filme();
            belfast.setNome("Belfast");
            belfast.setGenero("Drama");
            belfast.setSinopse(
                    "Em Belfast, no final dos tumultuosos anos de 1960 na Irlanda do Norte, o jovem Buddy (Jude Hill) percorre a paisagem das lutas da classe \r\n"
                            + "trabalhadora, em meio de mudanças culturais e violência extrema. Buddy sonha em um futuro melhor, glamoroso, que vai tirá-lo dos problemas \r\n"
                            + "que enfrenta no momento, mas, enquanto isso nísso acontece, ele se consola com o carismático Pa (Jamie Dornan) e a Ma (Caitriona Balfe), \r\n"
                            + "junto com seus avós (Judie Dench e Ciaran Hinds) que contam histórias maravilhosas. Classificação indicativa 14 anos, contém violência, \r\n"
                            + "atos criminosos e temas sensíveis. \r\n" + "\r\n");
            belfast.setElenco("Jamie Dornan, Caitriona Balfe, Judie Dench, Ciarán Hinds");
            belfast.setDiretor("Kenneth Branagh");
            belfast.setDistribuidora("Universal");
            belfast.setClassificacao(14);
            belfast.setDuracao(100);

            Filme driveMyCar = new Filme();
            driveMyCar.setNome("Drive My Car");
            driveMyCar.setGenero("Drama");
            driveMyCar.setSinopse(
                    "Dois anos após a morte de sua esposa, Yusuke recebe uma oferta para dirigir uma produção do Tio Vanya num festival de teatro. À medida que \r\n"
                            + "brotam tensões entre o elenco e a equipe, Yusuke é forçado a enfrentar verdades de seu passado com a ajuda de Misaki, uma jovem escolhida \r\n"
                            + "para ser sua motorista. 04 Indicações ao Oscar, incluindo Melhor Filme, Melhor Diretor e Melhor Filme Estrangeiro. Classificação indicativa \r\n"
                            + "16 anos, contém conteúdo sexual, drogas lícitas e linguagem imprópria.\r\n" + "\r\n");
            driveMyCar.setElenco("Hidetoshi Nishijima, Toko Miura, Masaki Okada");
            driveMyCar.setDiretor("Ryusuke Hamaguchi");
            driveMyCar.setDistribuidora("O2 Play");
            driveMyCar.setClassificacao(16);
            driveMyCar.setDuracao(175);

            Filme kingRichard = new Filme();
            kingRichard.setNome("King Richard: Criando Campeãs");
            kingRichard.setGenero("Drama");
            kingRichard.setSinopse(
                    "Baseado em uma história real, o filme King Richard: Criando Campeãs mostra a jornada ao estrelato das tenistas Venus e Serena Williams. \r\n"
                            + "Determinado em fazer de suas filhas atletas medalhistas, Richard (Will Smith) as treina com determina��o e foco inquebráveis. Classificação \r\n"
                            + "indicativa 12 anos, contém drogas, violência e Linguagem imprópria.\r\n" + "\r\n");
            kingRichard.setElenco("Will Smith, Aunjanue Ellis, Saniyya Sidney, Demi Singleton");
            kingRichard.setDiretor("Reinaldo Marcus Green");
            kingRichard.setDistribuidora("Warner Bros");
            kingRichard.setClassificacao(12);
            kingRichard.setDuracao(140);

            filmesDeDrama.add(belfast);
            filmesDeDrama.add(driveMyCar);
            filmesDeDrama.add(kingRichard);

            // FILMES DE SUSPENSE
            ArrayList<Filme> filmesDeSuspense = new ArrayList<Filme>();
            Filme aHoraDoDesespero = new Filme();
            aHoraDoDesespero.setNome("A Hora do Desespero");
            aHoraDoDesespero.setGenero("Suspense");
            aHoraDoDesespero.setSinopse(
                    "Uma mulher corre desesperadamente para salvar seu filho depois que a pol�cia coloca sua cidade natal em lockdown devido a um incidente envolvendo um atirador ativo. \r\n"
                            + "\r\n");
            aHoraDoDesespero.setElenco("Naomi Watts, Colton Gobbo e Sierra Maltby");
            aHoraDoDesespero.setDiretor("Phillip Noyce");
            aHoraDoDesespero.setDistribuidora("Paris Filmes");
            aHoraDoDesespero.setClassificacao(16);
            aHoraDoDesespero.setDuracao(80);

            Filme vejaPorMim = new Filme();
            vejaPorMim.setNome("Veja Por Mim");
            vejaPorMim.setGenero("Suspense");
            vejaPorMim.setSinopse(
                    "Sophie, uma jovem cega cuidando de uma mansão isolada, se encontra diante de uma invasão doméstica por bandidos procurando \r\n"
                            + "um cofre secreto. Sua única forma de defesa é um aplicativo chamado 'Veja por Mim'. O aplicativo a conecta com um voluntário \r\n"
                            + "do outro lado do país para ajudá-la a sobreviver. \r\n" + "\r\n");
            vejaPorMim.setElenco("Skyler Davenport, Kim Coates, Jessica Parker Kennedy");
            vejaPorMim.setDiretor("Randall Okita");
            vejaPorMim.setDistribuidora("Paris Filmes");
            vejaPorMim.setClassificacao(16);
            vejaPorMim.setDuracao(92);

            Filme naqueleFimDeSemana = new Filme();
            naqueleFimDeSemana.setNome("Naquele Fim de Semana");
            naqueleFimDeSemana.setGenero("Suspense");
            naqueleFimDeSemana.setSinopse(
                    "Baseado no livro homônimo de Sarah Alderson, Naquele Fim de Semana segue Kate e Orla. Duas melhores amigas que sempre superaram \r\n"
                            + "contratempos pessoais, não importando o que acontecesse ao longo do ano, elas esperavam ansiosamente pelo seu fim de semana \r\n"
                            + "especial, um quase evento anual. Este ano elas decidiram planejar uma viagem à Lisboa, e tudo estava perfeito até Orla acordar \r\n"
                            + "e perceber que Kate se encontrava desaparecida. Com apenas uma memória confusa da noite anterior e a polícia não cooperando \r\n"
                            + " o suficiente, sua busca frenética revelará segredos devastadores e uma ameaça que já pairava mais perto do que ela poderia imaginar. \r\n"
                            + "\r\n");
            naqueleFimDeSemana.setElenco("Leighton Meester , Luke Norris , Christina Wolfe");
            naqueleFimDeSemana.setDiretor("Kim Farrant");
            naqueleFimDeSemana.setDistribuidora("Original Netflix");
            naqueleFimDeSemana.setClassificacao(16);
            naqueleFimDeSemana.setDuracao(89);

            filmesDeSuspense.add(aHoraDoDesespero);
            filmesDeSuspense.add(vejaPorMim);
            filmesDeSuspense.add(naqueleFimDeSemana);

            // FILMES DE TERROR
            ArrayList<Filme> filmesDeTerror = new ArrayList<Filme>();
            Filme oRitual = new Filme();
            oRitual.setNome("O Ritual: Presença Maligna");
            oRitual.setGenero("Terror");
            oRitual.setSinopse(
                    "Marianne, seu marido Lionel e sua filha Adelaide se mudam para uma cidade no interior da Inglaterra, onde Lionel foi nomeado o novo reverendo. \r\n"
                            + "Logo que chegam em sua nova casa, Marianne percebe que estranhos e assustadores eventos começam a acontecer, levantando as suspeitas de que as pessoas \r\n"
                            + "da cidade escondem um segredo terrível. Com a ajuda de um famoso ocultista, o casal vai testar toda a sua fé, buscando descobrir a aterrorizante verdade \r\n"
                            + "sobre a presença maligna que habita sua casa e deseja possuir sua filha Adelaide. Classificação indicativa 14 anos, contém violência, conteúdo sexual \r\n"
                            + "e drogas lícitas. \r\n" + "\r\n");
            oRitual.setElenco("Jessica Brown Findlay; John Lynch ; Sean Harris; Anya McKenna-Bruce");
            oRitual.setDiretor("Christopher Smith");
            oRitual.setDistribuidora("Playarte");
            oRitual.setClassificacao(14);
            oRitual.setDuracao(95);

            Filme telefonePreto = new Filme();
            telefonePreto.setNome("O Telefone Preto");
            telefonePreto.setGenero("Terror");
            telefonePreto.setSinopse(
                    "Em O Telefone Preto, Finney Shaw, um garoto de 13 anos, é sequestrado por um sádico serial killer (Ethan Hawke) em um porão a prova de som, onde os gritos \r\n"
                            + "do menino não podem ser ouvidos. Na parede do porão, Finney encontra um telefone antigo. Quando o aparelho toca, o garoto consegue ouvir a voz das vítimas \r\n"
                            + "anteriores do assassino, e elas tentam evitar que o Finney sofra o mesmo destino. Enquanto isso, a melhor amiga de Finney tem sonhos que indicam o lugar onde \r\n"
                            + "ele pode estar e corre contra o tempo para resgatar o amigo antes que seja tarde demais.\r\n"
                            + "\r\n");
            telefonePreto.setElenco("Ethan Hawke, Jeremy Davies, James Ransone");
            telefonePreto.setDiretor("Scott Derrickson");
            telefonePreto.setDistribuidora("Universal");
            telefonePreto.setClassificacao(14);
            telefonePreto.setDuracao(104);

            Filme crocodilos = new Filme();
            crocodilos.setNome("Crocodilos: A Morte te Espera");
            crocodilos.setGenero("Terror");
            crocodilos.setSinopse(
                    "Um casal aventureiro que convence seus amigos a explorar um remoto sistema de cavernas nas florestas do norte da Austrália. Com uma tempestade se aproximando, \r\n"
                            + "eles descem para a entrada da caverna, que começa a inundar, e se encontram ameaçados por um bando de crocodilos, o que os levará a uma intensa luta pela sobrevivência.\r\n"
                            + "\r\n");
            crocodilos.setElenco("Jessica McNamee, Luke Mitchell, Amali Golden");
            crocodilos.setDiretor("Andrew Traucki");
            crocodilos.setDistribuidora("PlayArte");
            crocodilos.setClassificacao(14);
            crocodilos.setDuracao(98);

            filmesDeTerror.add(oRitual);
            filmesDeTerror.add(telefonePreto);
            filmesDeTerror.add(crocodilos);

            // INICIO LOOP
            do {
                System.out.println("\n Escolha um gênero abaixo para ver os filmes disponíveis: \n");
                System.out.println("1-Ação " + "2-Comédia " + "3-Drama " + "4-Suspense " + "5-Terror");
                opcao = ler.nextInt();

                if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
                    System.out.println("\nERRO!\n");
                    System.out.println("\nFIM DO PROGRAMA! POR FAVOR, TENTE NOVAMENTE.");
                    System.exit(0);
                }

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                Filme filmeEscolhido = new Filme();

                // MENU DO GENERO ACAO
                switch (opcao) {
                    case 1: {
                        System.out.println("Filmes de Ação: \n");
                        System.out.println("1-Morbius\n");
                        System.out.println("2-Doutor Estranho no Multiverso da Loucura \n");
                        System.out.println("3-Batman \n");
                        System.out.println("Escolha o filme de sua preferência: \n");
                    }

                    selecaoFilme = ler.nextInt();
                    if (selecaoFilme != 1 && selecaoFilme != 2 && selecaoFilme != 3) {
                        System.out.println("ERRO!");
                        System.out.println("\nFIM DO PROGRAMA! POR FAVOR TENTE NOVAMENTE.");
                        System.exit(0);
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    if (selecaoFilme == 1) {
                        filmeEscolhido = filmesDeAcao.get(0);
                        mostrarFilme(filmeEscolhido);
                    } else if (selecaoFilme == 2) {
                        filmeEscolhido = filmesDeAcao.get(1);
                        mostrarFilme(filmeEscolhido);
                    } else {
                        filmeEscolhido = filmesDeAcao.get(2);
                        mostrarFilme(filmeEscolhido);
                    }

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    break;

                    // MENU DO GENERO COMEDIA
                    case 2:
                        System.out.println("Filmes de Comédia: \n");
                        System.out.println("1-O Peso do Talento\n");
                        System.out.println("2-Super Quem?\n");
                        System.out.println("3-Cidade Perdida\\n");
                        System.out.println("Escolha o filme de sua preferência: \n");

                        selecaoFilme = ler.nextInt();
                        if (selecaoFilme != 1 && selecaoFilme != 2 && selecaoFilme != 3) {
                            System.out.println("\nERRO!\n");
                            System.out.println("\nFIM DO PROGRAMA! POR FAVOR TENTE NOVAMENTE.");
                            System.exit(0);
                        }

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        if (selecaoFilme == 1) {
                            filmeEscolhido = filmesDeComedia.get(0);
                            mostrarFilme(filmeEscolhido);
                        } else if (selecaoFilme == 2) {
                            filmeEscolhido = filmesDeComedia.get(1);
                            mostrarFilme(filmeEscolhido);
                        } else {
                            filmeEscolhido = filmesDeComedia.get(2);
                            mostrarFilme(filmeEscolhido);
                        }
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        break;

                    // MENU DO GENERO DRAMA
                    case 3:
                        System.out.println("Filmes de Drama: \n");
                        System.out.println("1-Belfast\n");
                        System.out.println("2-Drive My Car\n");
                        System.out.println("3-King Richard: Criando Campeãs\n");
                        System.out.println("Escolha o filme de sua preferência: \n");

                        selecaoFilme = ler.nextInt();
                        if (selecaoFilme != 1 && selecaoFilme != 2 && selecaoFilme != 3) {
                            System.out.println("\nERRO!\n");
                            System.out.println("\nFIM DO PROGRAMA! POR FAVOR TENTE NOVAMENTE.");
                            System.exit(0);
                        }

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        if (selecaoFilme == 1) {
                            filmeEscolhido = filmesDeDrama.get(0);
                            mostrarFilme(filmeEscolhido);

                        } else if (selecaoFilme == 2) {
                            filmeEscolhido = filmesDeDrama.get(1);
                            mostrarFilme(filmeEscolhido);
                        } else {
                            filmeEscolhido = filmesDeDrama.get(2);
                            mostrarFilme(filmeEscolhido);
                        }
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        break;

                    // MENU DO GENERO SUSPENSE
                    case 4:
                        System.out.println("Filmes de Suspense: \n");
                        System.out.println("1-A Hora do Desespero\n");
                        System.out.println("2-Veja Por Mim\n");
                        System.out.println("3-Naquele Fim de Semana\n");
                        System.out.println("Escolha o filme de sua preferência: \n");

                        selecaoFilme = ler.nextInt();
                        if (selecaoFilme != 1 && selecaoFilme != 2 && selecaoFilme != 3) {
                            System.out.println("\nERRO!\n");
                            System.out.println("\nFIM DO PROGRAMA! POR FAVOR TENTE NOVAMENTE.");
                            System.exit(0);
                        }

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        if (selecaoFilme == 1) {
                            filmeEscolhido = filmesDeSuspense.get(0);
                            mostrarFilme(filmeEscolhido);
                        } else if (selecaoFilme == 2) {
                            filmeEscolhido = filmesDeSuspense.get(1);
                            mostrarFilme(filmeEscolhido);
                        } else {
                            filmeEscolhido = filmesDeSuspense.get(2);
                            mostrarFilme(filmeEscolhido);
                        }

                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        break;

                    // MENU DO GENERO TERROR
                    case 5:
                        System.out.println("Filmes de Terror: \n");
                        System.out.println("1-O Ritual: Presença Maligna\n");
                        System.out.println("2-O Telefone Preto\n");
                        System.out.println("3-Crocodilos: A Morte te Espera\n");
                        System.out.println("Escolha o filme de sua preferência: \n");

                        selecaoFilme = ler.nextInt();
                        if (selecaoFilme != 1 && selecaoFilme != 2 && selecaoFilme != 3) {
                            System.out.println("\nERRO!\n");
                            System.out.println("\\nFIM DO PROGRAMA! POR FAVOR, TENTE NOVAMENTE.");
                            System.exit(0);
                        }


                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        if (selecaoFilme == 1) {
                            filmeEscolhido = filmesDeTerror.get(0);
                            mostrarFilme(filmeEscolhido);
                        } else if (selecaoFilme == 2) {
                            filmeEscolhido = filmesDeTerror.get(1);
                            mostrarFilme(filmeEscolhido);
                        } else {
                            filmeEscolhido = filmesDeTerror.get(2);
                            mostrarFilme(filmeEscolhido);
                        }
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                }

                // OPCAO DE COMPRA DO FILME
                System.out.println("\nDeseja comprar o filme?");
                System.out.println("\nDigite 's' para sim e 'n' para não");
                comprarLer = ler.next().charAt(0);
                if (comprarLer == 's'){
                    System.out.println("\n O Filme foi adicionado à sua carteira virtual!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite 'n' para retornar ao inicio.");
                }else {
                    System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite 'n' para retornar ao inicio.");
                }
                resposta = ler.next().charAt(0);

            } while (resposta != 's');
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            // FIM DO LOOP

            System.out.println("Obrigado, volte sempre!!");
            ler.close();

        } catch (Exception erro) {
            System.out.println("\n ERRO!" + erro + "\n\n FIM DO PROGRAMA! POR FAVOR, TENTE NOVAMENTE.");
            // FIM EXCEPTION GERAL
        }

    }


    public static void mostrarFilme(Filme filme) {
        System.out.println(filme.nome + filme.elenco);
        System.out.println("\n" + filme.getNome() + "\n" + filme.getGenero() + "\n" + " \r\n" + "Leia a sinopse\r\n"
                + "\r\n" + filme.getSinopse() + "Elenco: " + filme.getElenco() + "\r\n" + "Duração: "
                + filme.getDuracao() + " min\r\n" + "Diretor: " + filme.getDiretor() + "\r\n" + "Distribuidora: "
                + filme.getDistribuidora() + "\r\n" + "Gênero: " + filme.getGenero() + "\r\n" + "Classifição: "
                + filme.getClassificacao() + " anos\n");
    }
}
