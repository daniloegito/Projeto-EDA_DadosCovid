package ordenacao;

public class QuickSort {
    public static void quickSort(String[][] vetor, int first, int last, int column) {
             if (first < last) {
                    int posicaoPivot = separar(vetor, first, last, column);
                    quickSort(vetor, first, posicaoPivot - 1, column);
                    quickSort(vetor, posicaoPivot + 1, last, column);
             }
       }

       public static int separar(String[][] vetor, int first, int last, int column) {
             int pivot = Integer.parseInt(vetor[first][column]);
             String[] pivot_aux = vetor[first];
             int i = first + 1, f = last;
             while (i <= f) {
                    if(vetor[i][column] == null) {
                        vetor[i][column] = "0";
                    }
                    if(vetor[f][column] == null) {
                        vetor[f][column] = "0";
                    }
                    if (Integer.parseInt(vetor[i][column]) <= pivot)
                           i++;
                    else if (pivot < Integer.parseInt(vetor[f][column]))
                           f--;
                    else {
                           String[] swap = vetor[i];
                           vetor[i] = vetor[f];
                           vetor[f] = swap;
                           i++;
                           f--;
                    }
             }
             vetor[first] = vetor[f];
             vetor[f] = pivot_aux;
             return f;
       }

       public static void quickSortParaString(String[][] vetor, int first, int last) {
             if (first < last) {
                    int posicaoPivot = separarString(vetor, first, last);
                    quickSortParaString(vetor, first, posicaoPivot - 1);
                    quickSortParaString(vetor, posicaoPivot + 1, last);
             }
       }

       public static int separarString(String[][] vetor, int first, int last) {
            for(int i = 0; i < vetor.length; i++) {
                if(vetor[i][4] == null) {
                    vetor[i][4] = "";
                }
            }
             String pivot = vetor[first][4];
             String[] pivot_aux = vetor[first];
             int i = first + 1, f = last;
             while (i <= f) {
                    if ((vetor[i][4].compareTo(pivot) <= 0))
                           i++;
                    else if (pivot.compareTo(vetor[f][4]) < 0)
                           f--;
                    else {
                           String[] swap = vetor[i];
                           vetor[i] = vetor[f];
                           vetor[f] = swap;
                           i++;
                           f--;
                    }
             }
             vetor[first] = vetor[f];
             vetor[f] = pivot_aux;
             return f;
       }
}