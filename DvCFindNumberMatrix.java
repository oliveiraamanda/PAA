public class DvCFindNumberMatrix {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {2,3,3}, {1,3,5}};
        System.out.println(FindNumberMatrix(matriz, 1, 0, matriz.length, 0, matriz[0].length));
    }

    public static boolean FindNumberMatrix(int[][] matriz, int numero, int inicio_linha, int fim_linha, int inicio_coluna, int fim_coluna ) {

        if (fim_linha - inicio_linha == 1 && fim_coluna - inicio_coluna == 1) {
            if (matriz[inicio_linha][inicio_coluna] == numero) {
                return true;
            }
            return false;
        }

        int corte_linha = (fim_linha + inicio_linha) / 2;
        int corte_coluna = (fim_coluna + inicio_coluna) / 2;

        boolean quadro1 = FindNumberMatrix(matriz, numero, inicio_linha, corte_linha, inicio_coluna, corte_coluna);
        boolean quadro2 = FindNumberMatrix(matriz, numero, inicio_linha, corte_linha, corte_coluna, fim_coluna);
        boolean quadro3 = FindNumberMatrix(matriz, numero, corte_linha, fim_linha, inicio_coluna, corte_coluna);
        boolean quadro4 = FindNumberMatrix(matriz, numero, corte_linha, fim_linha, corte_coluna, inicio_coluna);

        return quadro1 || quadro2 || quadro3 || quadro4;

        // Operação básica é "chamada", faz 4 chamadas
        // 4C(n/4) + 2     C(1) = 2  Para cada chamada faz duas comparações Se for uma matriz quadrada é n ao quadradoo custo, se não, é O(mxn)

    }
}
