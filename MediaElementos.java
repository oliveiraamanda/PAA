package EmPratica;

public class MediaElementos {
    public static void main(String[] args) {
        int[] vetor = {1,3,10};
        System.out.println(Media(vetor));
    }

    public static float Media(int[] vetor) { // média = a soma dos elementos dividido pela quantidade total de elementos
        int somaElementos = 0;
        int quantidadeElementos = vetor.length;

        for (int i = 0; i < vetor.length; i++) { // atribuição + comparação = 2(n+1)
            somaElementos = somaElementos + vetor[i]; // a soma é a operação básica ou é a atribuição? quanto ela vale?
        }
        return somaElementos / quantidadeElementos;
    }
}
