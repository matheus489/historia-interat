
import java.util.Scanner;

public class JornadaDoDestino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        personagem Personageminicial = new personagem("nome", 0);
        personagem pessoa1 = new personagem("morgano", 100);
        personagem pessoa2 = new personagem("florio", 100);
        personagem pessoa3 = new personagem("Odin", 100);
        Capitulo1 Capitulo1inicial = new Capitulo1(mensagempricipal,Personageminicial);
        Capitulo1 neblina1 = new Capitulo1("morgano",mensagem1, pessoa1,-20);
        Capitulo1 neblina12 = new Capitulo1("morgano",tesouro1,  pessoa1, -20); 
        Capitulo1 neblina13 = new Capitulo1("morgano",procura1,  pessoa1, -80);
        Capitulo1 luz1 = new Capitulo1("florio",luz,  pessoa2, 0);
        Capitulo1 luz12 = new Capitulo1("florio",luz3,  pessoa2, 0);
        Capitulo1 luz13 = new Capitulo1("florio",desejos1,  pessoa2, -45);
        Capitulo1 sabedoria1 = new Capitulo1("Odin",sabedoria3,   pessoa3, 0);
        Capitulo1 sabedoria12 = new Capitulo1("Odin",poder1, pessoa3, -10);
        Capitulo1 sabedoria13 = new Capitulo1("Odin",poder2, pessoa3,0);;

        Capitulo1inicial.escolhas = new Escolha1[]{new Escolha1("Neblina", neblina1), 
        new Escolha1("Luz", luz1), 
        new Escolha1("Sabedoria", sabedoria1)};

        neblina1.escolhas = new Escolha1[]{new Escolha1("tesouro", neblina12), 
        new Escolha1("procurar", neblina13)};

        luz1.escolhas = new Escolha1[]{new Escolha1("Compartilhar", luz12),
        new Escolha1("desejos", luz13)};
        sabedoria1.escolhas = new Escolha1[]{new Escolha1("Utilizar", sabedoria12),
        new Escolha1("Renunciar", sabedoria13)};
    
        Capitulo1 raiz = Capitulo1inicial;
        
        raiz.executar();
        scanner.close();
        
        }
            


    static String luz3 = ("\n florio decide usar o poder do Olho de Oráculo para conceder"+
        " um desejo que beneficie toda a humanidade."+
        "Sua ação inspira outros a fazerem o mesmo, e você se torna uma figura venerada como o"+
        " Portador da Luz\nFinal: herói da humanidade\n");
    


    static String desejos1 = ("florio decide usar o poder do Olho de Oráculo para realizar um"+
        " desejo pessoal egoísta.\n"+ "No entanto, o poder corrompe sua mente e coração, levando você a um caminho de isolamento"+
        " e tristeza.\nFinal: Sozinho e corrompido\n");
        
    static String mensagempricipal = ("\nTitulo: A Jornada do Destino\n"+
        "\nVocê é um aventureiro corajoso em busca de uma relíquia antiga conhecida como O"+
        " Olho de Oráculo.\n"+
        "Rumores dizem que ele possui o poder de conceder um desejo a quem o encontrar. Você"+
        " segue as pistas\n"+"até chegar a uma antiga floresta encantada. Agora, a historia se"+
            " desenrola e você deve tomar algumas decisões cruciais.\n"+ 
            "\nBem-vindo à Jornada do Destino!\n"+
            "Qual caminho você escolherá?\n"+ "\nSeguir o caminho da neblina\n"+ 
            "\nSeguir o caminho da luz\n"+ "\nSeguir o caminho da sabedoria\n");
    


    static String poder2 = ("\nRenunciar ao poder do Olho de Oráculo\n" +
        "odin decide que o poder do Olho de Oráculo é perigoso demais para ser usado, mesmo com sabedoria.\n"+ 
        "Em um ato de humildade, você renuncia ao desejo de possui-lo e parte em uma jornada para alertar outros sobre\n" +
        "os perigos que ele representa.\n\nFinal: Protetor da humanidade\n");
        
   
    static String poder1 = ("\nUtilizar o poder com sabedoria\n"+
        "odin encontra o Olho de Oráculo e usa seu poder com sabedoria,\n"+ 
        "buscando um equilíbrio entre a luz e a neblina. Compreendendo que o poder da relíquia é uma responsabilidade,\n"+ 
        "você toma decisões cuidadosas e usa seus poderes para ajudar aqueles ao seu redor.\nFinal: Guardião do equilíbrio\n");
        
    
    static String sabedoria3 = ("\nSeguir o caminho da sabedoria\n"+
        "Você escolhe aprender com o eremita sábio e mergulha em uma jornada interna de autoconhecimento.\n"+ 
        "Ele o ensina sobre o equilíbrio entre luz e escuridão, poder e compaixão. Quando você se sente pronto,\n" +
        "ele indica o caminho para o Olho de Oráculo. Agora, surge uma nova Escolha1 diante de você");
        

    static String  luz = ("\nSeguir o caminho da luz\n"+
        "\nVocê confia na sabedoria dos seres pac\u00EDficos e s\u00E1bios da cidade flutuante.\n"+ 
        "Eles lhe fornecem um mapa que mostra a localiza\u00E7\u00E3o exata do \"Olho de Or\u00E1culo\n"+
            "Seguindo o mapa, você chega a um templo antigo e enfrenta desafios que testam sua compaixão e empatia.\n" + //
        "\nAgora, surge uma nova Escolha1 diante de voc\u00EA:\n");
    

    static String procura1 = ("\nProcurar mais a fundo\n"+
        " Morgano decide que os tesouros não são o suficientes e continua sua busca pelo Olho de Oráculo\n" +
        "À medida que avança, percebe que a escuridão começa a afetar sua mente e sua moral. Finalmente,\n" + 
    "você encontra a relíquias, mas ao toca-la, é consumido pela escuridão e perde sua humanidade.\n\nFinal: Corrompido pela escuridão\n");
        
  
    public static String tesouro1 = ("\nPegar os tesouros e retornar\n" + //
        "\n Morgano decide pegar os tesouros e voltar ao mundo exterior. Com sua mochila cheia de riquezas,\n"+ 
        "você retorna à superperfície e se torna uma lenda entre os aventureiros. Sua riqueza permite que você"+
        " viva uma vida conforavel,\n"+
    "mas a busca pelo Olho de Oráculo permanece incompleta.\n\nFinal: Vida confortavel, mas incompleta\n");
        

     static String mensagem1 = ( "\nSeguir o caminho da escuridão\n" + 
        "\n Morgano decide seguir um caminho sombrio e misterioso que parece levar a um reino subterrâneo."+ 
        "\nEle é guardado por criaturas assustadoras e perigosas. No entanto, há boatos de que grandes tesouros"+
        " estão escondidos lá.\n" +"Você deseja enfrentar os perigos e desafios em busca de riquezas?\n");}