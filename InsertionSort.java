package DiminuirConquistar;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {4, 3, 55, 2, 1};
        int[] vetorOrdenado = insertionSort(vetor);
        for (int i = 0; i < vetorOrdenado.length; i++) {
            System.out.println(vetorOrdenado[i] + " ");
        }
    }

    public static int[] insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {

            int j = i;

            while (j > 0 && vetor[j] < vetor[j - 1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = aux;
                j -= 1;
            }
        }
        return vetor;
    }
}
