public class Tabuleiro {
    private int tamanho;
    private char[][] tabuleiro;

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        tabuleiro = new char[tamanho][tamanho];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] = '*';
            }
        }
    }

    public void exibirTabuleiro() {
        // Imprimir números das colunas
        System.out.print("   ");
        for (int j = 0; j < tamanho; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Imprimir linhas e conteúdo do tabuleiro
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < tamanho; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void posicionarNavio(Navio navio) {
        PosicaoNavio posicao = navio.getPosicao();
        int linha = posicao.getLinha();
        int coluna = posicao.getColuna();
        int tamanho = navio.getTamanho();

        if (posicao.getOrientacao().equalsIgnoreCase("H")) {
            for (int i = coluna; i < coluna + tamanho; i++) {
                tabuleiro[linha][i] = navio.getSimbolo();
            }
        } else if (posicao.getOrientacao().equalsIgnoreCase("V")) {
            for (int i = linha; i < linha + tamanho; i++) {
                tabuleiro[i][coluna] = navio.getSimbolo();
            }
        }
    }


    public void setPosicao(int linha, int coluna, char valor) {
        tabuleiro[linha][coluna] = valor;
    }

    public boolean posicaoEstaLivre(int linha, int coluna) {
        return tabuleiro[linha][coluna] == '*';
    }
}
