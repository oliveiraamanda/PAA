public class ManipulaVetores {
    public static void main(String[] args) {
        int[] vetor = {3,1,44,654,2,5};
        int[] vetorOrdenado = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(MaiorNumero(vetor));
//        System.out.println(MediaVetor(vetor));
//        EmPratica.OrdenaVetor(vetor);
//        System.out.println(EncontraNumeroForçaBruta(vetor, 3));
        //System.out.println(BinaryS(vetorOrdenado, 2));

        System.out.println(buscaBinariaTeste(vetorOrdenado, 9, 0, vetorOrdenado.length-1));
    }

    public static int MaiorNumero(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static double MediaVetor(int[] vetor) {
        int somaElementos = 0;
        int quantidadeElementos = vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            somaElementos = somaElementos + vetor[i];
        }
        return somaElementos / quantidadeElementos;
    }

    int[] vetor = {3,1,44,654,2,5};
    public static int[] OrdenaVetor(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; (j < vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        return vetor;
    }

    public static boolean EncontraNumeroForçaBruta(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscaBinariaTeste(int[] vetor, int numero, int posicaoInicial, int posicaoFinal) {
        // c(n) = (n/2) + 1
        int posicaoMeio = (posicaoInicial + posicaoFinal) / 2;// complexidade = O(log(N))
        int elementoMeio = vetor[posicaoMeio];

        if (elementoMeio == numero) { //critério de parada
            return true;
        }

        if (elementoMeio < numero) {
            return buscaBinariaTeste(vetor, numero, posicaoMeio, posicaoFinal);
        }

        if (elementoMeio > numero) {
            return buscaBinariaTeste(vetor, numero, posicaoInicial, posicaoMeio);
        }

        return false;
    }
}

