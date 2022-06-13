package BuscaExaustivaForcaBruta;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {55,1,3,2};
        BubbleSort(vetor);
    }

    public static int[] BubbleSort(int[] vetor) {
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]+ " ");
        }
        return vetor;
    }
}
