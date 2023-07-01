public class Main {
    public static void main(String[] args) {

        String textData = "";
        String nameData = "";
        String questionData = "";
        int tamanhoTabuleiro = 10;
        String posicaoPA1 = "";

        TextPrompter textPrint = new TextPrompter();
        QuestionPrompter questionPrompter = new QuestionPrompter();
        Tabuleiro tabuleiro = new Tabuleiro(tamanhoTabuleiro);

        // Informações de abertura do jogo
        textData =  "\n" +
                "(*************** BATALHA NAVAL ***************)\n" +
                "(************** SEJA BEM VINDO ***************)\n" +
                "";
        textPrint.printText(textData);

        // Solicitação do nome do jogador
        nameData = (questionPrompter.askQuestion("Digite seu nome: "));

        // Informação do nome do jogador
        textPrint.printText("Bem-vindo Jogador: " + nameData);
        textPrint.printText("");
        textPrint.printText("Vamos dar início ao Jogo");
        textPrint.printText("");
        textPrint.printText("(************** TABULEIRO ***************)");
        textPrint.printText("");

        // Imprimir Tabuleiro em Branco
        tabuleiro.exibirTabuleiro();

        // Início do posicionamento dos Navios no Tabuleiro

        // Porta Aviões
        textPrint.printText("");
        textPrint.printText("Posicionamento do Porta Aviões (5 posições)");
        textPrint.printText("Informe a posição no formato linha, coluna, orientação (exemplo: 1, 2, H): ");
        textPrint.printText("");

        // Leitura da posição do porta-aviões
        posicaoPA1 = questionPrompter.askQuestion(" ");

        // Faz o parse da string de posição utilizando a classe PosicaoNavioParser
        PosicaoNavio posicaoNavioPA1 = PosicaoNavioParser.parse(posicaoPA1);

        // Posicionamento do porta-aviões 01 no tabuleiro
        PortaAvioes portaAvioes1 = new PortaAvioes(posicaoNavioPA1, tabuleiro);

        tabuleiro.posicionarNavio(portaAvioes1);

        tabuleiro.exibirTabuleiro();

        // Restante do código...
    }


}