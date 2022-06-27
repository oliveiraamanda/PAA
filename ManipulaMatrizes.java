public class ManipulaMatrizes {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {7,55,9}, {4,5,6}};
//        System.out.println(MaiorNumero(matriz));
//        System.out.println(MediaMatriz(matriz));
//        System.out.println(EncontraNumeroForçaBruta(matriz,10));
        System.out.println(DividirConquistar(matriz, 7, 2,2,2,2));
    }

    public static int MaiorNumero(int[][] matriz) {
        int maior = 0;

        for (int i = 0; i < matriz.length; i++) {  // C(n) = 4n2 + 5n + 2 pior caso O(n2)
            for (int j = 0; j < matriz[i].length; j++) {
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static int MediaMatriz(int[][] matriz) {
        int somaElementos = 0;
        int quantidadeElementos = matriz[0].length * matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaElementos = somaElementos + matriz[i][j];
            }
        }
        return somaElementos / quantidadeElementos;
    }

    public static boolean EncontraNumeroForçaBruta(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean DividirConquistar(int[][] matriz, int numero, int begin_linha, int end_linha, int begin_coluna, int end_coluna) {

        if (end_linha - begin_linha == 1 && end_coluna - begin_coluna == 1) { //critério de parada - caso base
            if (matriz[begin_linha][begin_coluna] == numero) {
                return true;
            }
            return false;
        }

        int corte_linha = end_linha + begin_linha / 2;
        int corte_coluna = end_coluna + begin_coluna / 2;

        boolean q1 = DividirConquistar(matriz, numero, begin_linha, corte_linha, begin_coluna, corte_coluna);
        boolean q2 = DividirConquistar(matriz, numero, begin_linha, corte_linha, corte_coluna, end_coluna);
        boolean q3 = DividirConquistar(matriz, numero, corte_linha, end_linha, begin_coluna, corte_coluna);
        boolean q4 = DividirConquistar(matriz, numero, corte_linha, end_linha, corte_coluna, end_coluna);

        return q1 || q2 || q3 || q4;

        // Operação básica é "chamada" - faz 4 chamadas
        // 4C(n/4) + 2     C(1) = 2  Para cada chamada faz duas comparações Se for uma matriz quadrada é n ao quadradoo custo, se não, é O(mxn)
    }
}


