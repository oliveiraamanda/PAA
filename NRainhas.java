public class NRainhas {


    public static void main(String[] args) {
        NRainhas Rainha = new NRainhas();
        Rainha.ResolveNRainhas();
    }

    static final int variaveis = 1;

    static void printaSolucao(int tabuleiro[][]) {
        for (int i = 0; i < variaveis; i++) {
            for (int j = 0; j < variaveis; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                System.out.println();
            }
        }
    }

    static boolean ChecaPossibilidade(int[][] tabuleiro, int linha, int coluna) {

        int i, j;

        for (i = 0; i < coluna; i++) {
            if (tabuleiro[linha][i] == 1) {
                return false;
            }
        }

        for (i = linha, j = coluna; i >= 0 && j >= 0; i--, j--) {
            if (tabuleiro[i][j] == 1) {
                return false;
            }
        }

        for (i = linha, j = coluna; j >= 0 && i < variaveis; i++, j--) {
            if (tabuleiro[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean ResolveNRainhasUtil(int[][] tabuleiro, int coluna) {

        if (coluna >= variaveis) {
            return true;
        }

        for (int i = 0; i < variaveis; i++) {
            if (ChecaPossibilidade(tabuleiro, i, coluna)) {
                return true;
            }

            if (ResolveNRainhasUtil(tabuleiro, coluna + 1)) {
                return true;
            }

            tabuleiro[i][coluna] = 0;
        }
        return false;
    }

    boolean ResolveNRainhas() {
        int tabuleiro[][] = { { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }};

        if (ResolveNRainhasUtil(tabuleiro, 0)) {
            return false;
        } else {
            printaSolucao(tabuleiro);
            return true;
        }
    }

}
