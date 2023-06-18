import java.util.Scanner;

public class JornadaDoDestino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mensagempricipal();

        System.out.println("Bem-vindo à Jornada do Destino!");
        System.out.println("Você é um aventureiro em busca do Olho de Oráculo.");
        System.out.println("Qual caminho você escolherá?");
        System.out.println("Seguir o caminho da neblina");
        System.out.println("Seguir o caminho da luz");
        System.out.println("Seguir o caminho da sabedoria");

        String escolha = "";
        boolean escolhacerta = false;


        while(!escolhacerta){
             System.out.println("Escolha entre os caminhos Neblina, Luz, Sabedoria");
            escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("Neblina") || escolha.equalsIgnoreCase("Luz")
                    || escolha.equalsIgnoreCase("Sabedoria")) {
                escolhacerta = true;
            }else{
                 System.out.println("Opção inválida. Por favor, escolha novamente.");

            }

        if (escolha.equalsIgnoreCase("Neblina")) {
            mensagem1();
            boolean escolhaCerta1 = false;
            while(!escolhaCerta1){

            System.out.println("Agora voce tem novas escolhas, escolha: Pegar tesouro ou Procurar mais\n");
            System.out.println("Digite: tesouro ou Procurar\n");
            String escolha1 = scanner.nextLine();

            if(escolha1.equalsIgnoreCase("tesouro")) {
                escolhaCerta1 = true;

                tesouro1();
                final_tesouro1();

            }else if(escolha1.equalsIgnoreCase("Procurar")){
                escolhaCerta1 = true;

                procura1();
                final_procura2();}
            else {
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            }} 


        }if (escolha.equalsIgnoreCase("luz")) {
            luz2();
            boolean escolhaCerta2 = false;
            while(!escolhaCerta2){

            System.out.println("Agora voce tem novas escolhas, escolha: Compartilhar a sabedoria ou desejos pessoais\n");
            System.out.println("Digite: Compartilhar ou desejos\n");
            String escolha2 = scanner.nextLine();

            if(escolha2.equalsIgnoreCase("Compartilhar")) {
                escolhaCerta2 = true;
                sabedoria1();
                final_sabedoria1();

            }else if(escolha2.equalsIgnoreCase("desejos")){
                escolhaCerta2 = true;
                
                desejos1();
                final_desejo1();}
                else {
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            
        } }else if (escolha.equalsIgnoreCase("sabedoria")) {
            sabedoria3();
            boolean escolhaCerta3 = false;
            while(!escolhaCerta3){

            System.out.println("Agora voce tem novas escolhas, escolha: Utilizar, Renunciar ou Destruir o poder\n");
            System.out.println("Digite: Utilizar, Renunciar ou Destruir\n");
            String escolha3 = scanner.nextLine();

            if(escolha3.equalsIgnoreCase("Utilizar")) {
                escolhaCerta3 = true;
                poder1();
                final_poder1();

            //a continuação da opção 3 aqui
        } else if(escolha3.equalsIgnoreCase("Renunciar")) {
            escolhaCerta3 = true;
            poder2();
            final_poder2();
        } else if(escolha3.equalsIgnoreCase("Destruir")){
            escolhaCerta3 = true;
            poder3();
            final_poder3();

        }else {
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
                scanner.close();

        }}}


    private static void final_desejo1() {
        System.out.println("\nFinal: Sozinho e corrompido\n");
    }


    private static void final_procura2() {
        System.out.println("\nFinal: Corrompido pela escuridão\n");
    }


    private static void final_sabedoria1() {
        System.out.println("\nFinal: herói da humanidade\n");
    }


    private static void sabedoria1() {
        System.out.println("\nVocê decide usar o poder do olho de Oráculo para realizar um desejo pessoal egoísta\n"+
         "No entanto, o poder corrompe sua mente e coração, levando você a um caminho de isolamento e tristeza.\n");
    }


    private static void desejos1() {
        sabedoria1();
    }
    

    private static void mensagempricipal() {
        System.out.println("\nTitulo: A Jornada do Destino\n"+
                "\nVocê é um aventureiro corajoso em busca de uma relíquia antiga conhecida como O Olho de Oráculo.\n"+
                "Rumores dizem que ele possui o poder de conceder um desejo a quem o encontrar. Você segue as pistas\n"+
                "até chegar a uma antiga floresta encantada. Agora, a historia se desenrola e você deve tomar algumas decisões cruciais.\n");
    }

    private static void final_poder3() {
        System.out.println("\nFinal: Protetor do mundo\n" +
                "Cada escolha traz um caminho único com diferentes desafios e finais.\n" + 
                "Sua história é moldada pelas decisões que você toma\n" +
                "Lembre-se de que, no final, é a jornada e as lições aprendidas"+
                 "ao longo do caminho que são verdadeiramente valiosas.");
    }

    private static void poder3() {
        System.out.println("\nDestruir o Olho de Oráculo\n"+
                "Você acredita que o poder do olho de Oráculo é intrinsecamente perigoso e\n"+ 
                "não deve cair nas mãos erradas. Com essa convicção, você decide destruir a\n"+ 
                "relíquia para que seu poder não possa ser mal utilizado. Sua ação garante a segurança do mundo,\n"+
                "mas a busca pelo desejo concedido é deixada de lado.\n");
    }

    private static void final_poder2() {
        System.out.println("\nFinal: Protetor da humanidade\n");
    }

    private static void poder2() {
        System.out.println("\nRenunciar ao poder do Olho de Oráculo\n" +
                "Você decide que o poder do Olho de Oráculo é perigoso demais para ser usado, mesmo com sabedoria.\n"+ 
                "Em um ato de humildade, você renuncia ao desejo de possui-lo e parte em uma jornada para alertar outros sobre\n" +
                "os perigos que ele representa.\n");
    }

    private static void final_poder1() {
        System.out.println("\nFinal: Guardião do equilíbrio\n");
    }

    private static void poder1() {
        System.out.println("\nUtilizar o poder com sabedoria Você encontra o Olho de Oráculo e usa seu poder com sabedoria,\n"+ 
        "buscando um equilíbrio entre a luz e a neblina. Compreendendo que o poder da relíquia é uma responsabilidade,\n"+ 
        "você toma decisões cuidadosas e usa seus poderes para ajudar aqueles ao seu redor.")
;
    }

    private static void sabedoria3() {
        System.out.println("\nSeguir o caminho da sabedoria\n"+
                "Você escolhe aprender com o eremita sábio e mergulha em uma jornada interna de autoconhecimento.\n"+ 
                "Ele o ensina sobre o equilíbrio entre luz e escuridão, poder e compaixão. Quando você se sente pronto,\n" +
                "ele indica o caminho para o Olho de Oráculo. Agora, surge uma nova escolha diante de você");
    }

    private static void luz2() {
        System.out.println("\nSeguir o caminho da luz\n"+
                "\nVocê confia na sabedoria dos seres pac\u00EDficos e s\u00E1bios da cidade flutuante.\n"+ 
                "Eles lhe fornecem um mapa que mostra a localiza\u00E7\u00E3o exata do \"Olho de Or\u00E1culo\n"+
                 "Seguindo o mapa, você chega a um templo antigo e enfrenta desafios que testam sua compaixão e empatia.\n" + //
                "\nAgora, surge uma nova escolha diante de voc\u00EA:\n");
    }


    private static void procura1() {
        System.out.println("\nProcurar mais a fundo\n"+
        "Você decide que os tesouros não são o suficientes e continua sua busca pelo Olho de Oráculo\n" +
        "À medida que avança, percebe que a escuridão começa a afetar sua mente e sua moral. Finalmente,\n" + 
        "você encontra a relíquias, mas ao toca-la, é consumido pela escuridão e perde sua humanidade.\n");
    }
    

    private static void final_tesouro1() {
        System.out.println("\nFinal: Vida confortavel, mas incompleta\n");
    }

    private static void tesouro1() {
        System.out.println("\nPegar os tesouros e retornar\n" + //
                "\nVocê decide pegar os tesouros e voltar ao mundo exterior. Com sua mochila cheia de riquezas,\n"+ 
                "você retorna à superperfície e se torna uma lenda entre os aventureiros. Sua riqueza permite que você"+
                " viva uma vida conforavel,\n"+
                "mas a busca pelo Olho de Oráculo permanece incompleta.\n");
    }

    private static void mensagem1() {
        System.out.println("\nSeguir o caminho da escuridão\n" + 
                "\nVocê decide seguir um caminho sombrio e misterioso que parece levar a um reino subterrâneo."+ 
                "\nEle é guardado por criaturas assustadoras e perigosas. No entanto, há boatos de que grandes tesouros"+
                 " estão escondidos lá.\n" +
                 "Você deseja enfrentar os perigos e desafios em busca de riquezas?\n");
    }
}