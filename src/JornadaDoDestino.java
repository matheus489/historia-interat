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
        System.out.println("Escolha entre os caminhos Neblina, Luz, Sabedoria");

        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("Neblina")) {
            mensagem1();
            System.out.println("Agora voce tem novas escolhas, escolha: Pegar tesouro ou Procurar mais\n");
            String escolha1 = scanner.nextLine();

            if(escolha1.equalsIgnoreCase("Pegar tesouro")) {
                mensagem11();
                final11();

            }else if(escolha1.equalsIgnoreCase("Procurar mais")){
                escolha12();
                final12();
            }} 

         else if (escolha.equalsIgnoreCase("2")) {
            escolha2();
            System.out.println("Agora voce tem novas escolhas, escolha: Pegar tesouro ou Procurar mais\n");
            String escolha2 = scanner.nextLine();
            if(escolha2.equalsIgnoreCase("1")) {
                mensagem11();
                final11();

            }else if(escolha2.equalsIgnoreCase("2")){
                escolha12();
                final12();
            //a continuação da opção 2 aqui
        } }else if (escolha.equalsIgnoreCase("3")) {
            escolha3();
            String escolha3 = scanner.nextLine();
            if(escolha3.equalsIgnoreCase("1")) {
                mensagem31();
                final31();

            //a continuação da opção 3 aqui
        } else if(escolha3.equalsIgnoreCase("2")) {
            mensagem32();
            final32();
        } else if(escolha3.equalsIgnoreCase("3")){
            mensagem33();
            final33();

        }

        scanner.close();}}
    

    private static void mensagempricipal() {
        System.out.println("T\u00EDtulo: A Jornada do Destino\n" + //
                "\n" + //
                "Voc\u00EA \u00E9 um aventureiro corajoso em busca de uma rel\u00EDquia antiga conhecida como \"O Olho de Or\u00E1culo\". Rumores dizem que ele possui o poder de conceder um desejo a quem o encontrar. Voc\u00EA segue as pistas at\u00E9 chegar a uma antiga floresta encantada. Agora, a hist\u00F3ria se desenrola e voc\u00EA deve tomar algumas decis\u00F5es cruciais. Qual caminho voc\u00EA escolher\u00E1?\n" + //
                "");
    }

    private static void final33() {
        System.out.println("Final: Protetor do mundo\n" + //
                "\n" + //
                "Cada escolha traz um caminho \u00FAnico com diferentes desafios e finais. Sua hist\u00F3ria \u00E9 moldada pelas decis\u00F5es que voc\u00EA toma. Lembre-se de que, no final, \u00E9 a jornada e as li\u00E7\u00F5es aprendidas ao longo do caminho que s\u00E3o verdadeiramente\u00A0valiosas.");
    }

    private static void mensagem33() {
        System.out.println("Destruir o \"Olho de Or\u00E1culo\"\n" + //
                "\n" + //
                "Voc\u00EA acredita que o poder do \"Olho de Or\u00E1culo\" \u00E9 intrinsecamente perigoso e n\u00E3o deve cair nas m\u00E3os erradas. Com essa convic\u00E7\u00E3o, voc\u00EA decide destruir a rel\u00EDquia para que seu poder n\u00E3o possa ser mal utilizado. Sua a\u00E7\u00E3o garante a seguran\u00E7a do mundo, mas a busca pelo desejo concedido \u00E9 deixada de lado.\n" + //
                "");
    }

    private static void final32() {
        System.out.println("Final: Protetor da humanidade\n" + //
                "");
    }

    private static void mensagem32() {
        System.out.println("Renunciar ao poder do \"Olho de Or\u00E1culo\"\n" + //
                "\n" + //
                "Voc\u00EA decide que o poder do \"Olho de Or\u00E1culo\" \u00E9 perigoso demais para ser usado, mesmo com sabedoria. Em um ato de humildade, voc\u00EA renuncia ao desejo de possu\u00ED-lo e parte em uma jornada para alertar outros sobre os perigos que ele representa.\n" + //
                "");
    }

    private static void final31() {
        System.out.println("Final: Guardi\u00E3o do equil\u00EDbrio");
    }

    private static void mensagem31() {
        System.out.println("Utilizar o poder com sabedoria Você encontra o "+"Olho de Oráculo"+" e usa seu poder com sabedoria, buscando um equilíbrio entre a luz e a neblina. Compreendendo que o poder da relíquia é uma responsabilidade, você toma decisões cuidadosas e usa seus poderes para ajudar aqueles ao seu redor.")
;
    }

    private static void escolha3() {
        System.out.println("Seguir o caminho da sabedoria\n" + //
                "\n" + //
                "Voc\u00EA escolhe aprender com o eremita s\u00E1bio e mergulha em uma jornada interna de autoconhecimento. Ele o ensina sobre o equil\u00EDbrio entre luz e escurid\u00E3o, poder e compaix\u00E3o. Quando voc\u00EA se sente pronto, ele indica o caminho para o \"Olho de Or\u00E1culo\".\n" + //
                "\n" + //
                "Agora, surge uma nova escolha diante de voc\u00EA:\n" + //
                "");
    }

    private static void escolha2() {
        System.out.println("Seguir o caminho da luz\n" + //
                "\n" + //
                "Voc\u00EA confia na sabedoria dos seres pac\u00EDficos e s\u00E1bios da cidade flutuante. Eles lhe fornecem um mapa que mostra a localiza\u00E7\u00E3o exata do \"Olho de Or\u00E1culo\". Seguindo o mapa, voc\u00EA chega a um templo antigo e enfrenta desafios que testam sua compaix\u00E3o e empatia.\n" + //
                "\n" + //
                "Agora, surge uma nova escolha diante de voc\u00EA:\n" + //
                "");
    }

    private static void final12() {
        System.out.println("Final: Corrompido pela escurid\u00E3o\n" + //
                "");
    }

    private static void escolha12() {
        System.out.println("\nProcurar mais a fundo\n" + //
                "\nVoc\u00EA decide que os tesouros n\u00E3o s\u00E3o suficientes e continua sua busca pelo \"Olho de Or\u00E1culo\". \u00C0 medida que avan\u00E7a, percebe que a escurid\u00E3o come\u00E7a a afetar sua mente e sua moral. Finalmente, voc\u00EA encontra a rel\u00EDquia, mas ao toc\u00E1-la, \u00E9 consumido pela escurid\u00E3o e perde sua humanidade.\n" + //
                "");
    }

    private static void final11() {
        System.out.println("Final: Vida confort\u00E1vel, mas incompleta\n" + //
                "");
    }

    private static void mensagem11() {
        System.out.println("\nPegar os tesouros e retornar\n" + //
                "\nVoc\u00EA decide pegar os tesouros e voltar ao mundo exterior. Com sua mochila cheia de riquezas, voc\u00EA retorna \u00E0 superf\u00EDcie e se torna uma lenda entre os aventureiros. Sua riqueza permite que voc\u00EA viva uma vida confort\u00E1vel, mas a busca pelo \"Olho de Or\u00E1culo\" permanece incompleta.\n" + //
                "");
    }

    private static void mensagem1() {
        System.out.println("\nSeguir o caminho da escurid\u00E3o\n" + //
                "\nVoc\u00EA decide seguir um caminho sombrio e misterioso que parece levar a um reino subterr\u00E2neo. Ele \u00E9 guardado por criaturas assustadoras e perigosas. No entanto, h\u00E1 boatos de que grandes tesouros est\u00E3o escondidos l\u00E1. Voc\u00EA deseja enfrentar os perigos e desafios em busca de riquezas?\n" + //
                "");
    }
}