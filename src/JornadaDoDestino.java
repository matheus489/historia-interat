import java.util.Scanner;

public class JornadaDoDestino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        personagem pessoa1 = new personagem("morgano", 100);
        personagem pessoa2 = new personagem("florio", 100);
        personagem pessoa3 = new personagem("Odin", 100);
        capitulo neblina1 = new capitulo("morgano",mensagem1, "tesouro", "procurar", pessoa1,-20);
        capitulo neblina12 = new capitulo("morgano",tesouro1,  pessoa1, -20); 
        capitulo neblina13 = new capitulo("morgano",procura1,  pessoa1, -80);
        capitulo luz1 = new capitulo("florio",luz,"Compartilhar","desejos",  pessoa2, 0);
        capitulo luz12 = new capitulo("florio",luz3,  pessoa2, 0);
        capitulo luz13 = new capitulo("florio",desejos1,  pessoa2, -45);
        capitulo sabedoria1 = new capitulo("Odin",sabedoria3,"Utilizar","Renunciar",  pessoa3, 0);
        capitulo sabedoria12 = new capitulo("Odin",poder1, pessoa3, -10);
        capitulo sabedoria13 = new capitulo("Odin",poder2, pessoa3,0);;
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
           neblina1.mostrar();
           int neblina = neblina1.escolher();
           
           
            if(neblina == 1) {  
                neblina12.mostrar1();
                

            }else if(neblina ==2){
                neblina13.mostrar1();            
        }

        }if (escolha.equalsIgnoreCase("luz")) {

            luz1.mostrar();
            int luz = luz1.escolher();

            if(luz==1) {
                luz12.mostrar1();

            }else if(luz==2){
                luz13.mostrar1();
            }
            
        } } if (escolha.equalsIgnoreCase("sabedoria")) {
            sabedoria1.mostrar();
            int sabedoria = sabedoria1.escolher();

            if(sabedoria==1) {
                sabedoria12.mostrar1();

        } else if(sabedoria==2) {
            sabedoria13.mostrar1();

        }
        scanner.close();

        }}

    static String luz3 = ("\n florio decide usar o poder do Olho de Oráculo para conceder"+
        " um desejo que beneficie toda a humanidade."+
        "Sua ação inspira outros a fazerem o mesmo, e você se torna uma figura venerada como o"+
        " Portador da Luz\nFinal: herói da humanidade\n");
    


    static String desejos1 = ("florio decide usar o poder do Olho de Oráculo para realizar um"+
        " desejo pessoal egoísta.\n"+ "No entanto, o poder corrompe sua mente e coração, levando você a um caminho de isolamento"+
        " e tristeza.\nFinal: Sozinho e corrompido\n");
        
    private static void mensagempricipal() {
        System.out.println("\nTitulo: A Jornada do Destino\n"+
        "\nVocê é um aventureiro corajoso em busca de uma relíquia antiga conhecida como O"+
        " Olho de Oráculo.\n"+
        "Rumores dizem que ele possui o poder de conceder um desejo a quem o encontrar. Você"+
        " segue as pistas\n"+"até chegar a uma antiga floresta encantada. Agora, a historia se"+
        " desenrola e você deve tomar algumas decisões cruciais.\n");
    }


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
        "ele indica o caminho para o Olho de Oráculo. Agora, surge uma nova escolha diante de você");
        

    static String  luz = ("\nSeguir o caminho da luz\n"+
        "\nVocê confia na sabedoria dos seres pac\u00EDficos e s\u00E1bios da cidade flutuante.\n"+ 
        "Eles lhe fornecem um mapa que mostra a localiza\u00E7\u00E3o exata do \"Olho de Or\u00E1culo\n"+
            "Seguindo o mapa, você chega a um templo antigo e enfrenta desafios que testam sua compaixão e empatia.\n" + //
        "\nAgora, surge uma nova escolha diante de voc\u00EA:\n");
    

    static String procura1 = ("\nProcurar mais a fundo\n"+
        " morgano decide que os tesouros não são o suficientes e continua sua busca pelo Olho de Oráculo\n" +
        "À medida que avança, percebe que a escuridão começa a afetar sua mente e sua moral. Finalmente,\n" + 
    "você encontra a relíquias, mas ao toca-la, é consumido pela escuridão e perde sua humanidade.\n\nFinal: Corrompido pela escuridão\n");
        
  
    public static String tesouro1 = ("\nPegar os tesouros e retornar\n" + //
        "\n morgano decide pegar os tesouros e voltar ao mundo exterior. Com sua mochila cheia de riquezas,\n"+ 
        "você retorna à superperfície e se torna uma lenda entre os aventureiros. Sua riqueza permite que você"+
        " viva uma vida conforavel,\n"+
    "mas a busca pelo Olho de Oráculo permanece incompleta.\n\nFinal: Vida confortavel, mas incompleta\n");
        

    static String mensagem1 = ( "\nSeguir o caminho da escuridão\n" + 
        "\nVocê decide seguir um caminho sombrio e misterioso que parece levar a um reino subterrâneo."+ 
        "\nEle é guardado por criaturas assustadoras e perigosas. No entanto, há boatos de que grandes tesouros"+
        " estão escondidos lá.\n" +"Você deseja enfrentar os perigos e desafios em busca de riquezas?\n");}