public class PosicaoNavio {
    private int linha;
    private int coluna;
    private String orientacao;

    public PosicaoNavio(int linha, int coluna, String orientacao) {
        this.linha = linha;
        this.coluna = coluna;
        this.orientacao = orientacao;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public String getOrientacao() {
        return orientacao;
    }
}
