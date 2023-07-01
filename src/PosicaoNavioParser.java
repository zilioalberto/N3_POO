public class PosicaoNavioParser {

    public static PosicaoNavio parse(String posicao) throws IllegalArgumentException {
        String[] parts = posicao.split(",");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Formato de posição inválido. Deve ser linha, coluna, orientação.");
        }

        int linha = Integer.parseInt(parts[0].trim());
        int coluna = Integer.parseInt(parts[1].trim());
        String orientacao = parts[2].trim();

        if (!orientacao.equalsIgnoreCase("V") && !orientacao.equalsIgnoreCase("H")) {
            throw new IllegalArgumentException("Orientação inválida. Deve ser V para vertical ou H para horizontal.");
        }

        return new PosicaoNavio(linha, coluna, orientacao);
    }
}
