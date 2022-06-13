package EmPratica;

class BubbleSort {
    public static void main(String[] args) {  //custo = O(n2) n ao quadrado
        int vetor[] = {5,1,6,3,4,2};
        int aux;

        for (int i = 0; i < vetor.length; ++i) {
            for (int j = 0; j<(vetor.length - 1); ++j) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; ++i) {
            System.out.print(vetor[i]+" ");
        }
    }
}
