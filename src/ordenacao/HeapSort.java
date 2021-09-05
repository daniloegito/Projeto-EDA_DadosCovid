package ordenacao;

public class HeapSort {
    public static void heapSort(String array[][], int column) {
        int n = array.length;

        for(int i = 0; i < n; i++) {
            if(array[i][column] == null) {
                array[i][column] = "0";
            }
        }
 
        for (int i = n / 2 - 1; i >= 1; i--)
            heapify(array, n, i, column);
 
        for (int i = n - 1; i > 0; i--) {
            String[] temp = array[0];
            array[0] = array[i];
            array[i] = temp;
 
            heapify(array, i, 0, column);
        }
    }
 
    public static void heapify(String array[][], int n, int i, int column) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        
        if (l < n && Integer.parseInt(array[l][column]) > Integer.parseInt(array[largest][column]))
            largest = l;
 
        if (r < n && Integer.parseInt(array[r][column]) > Integer.parseInt(array[largest][column]))
            largest = r;
 
        if (largest != i) {
            String[] swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            heapify(array, n, largest, column);
        }
    }

    public static void heapSortParaString(String array[][], int column) {
        int n = array.length;

        for(int i = 0; i < n; i++) {
            if(array[i][column] == null) {
                array[i][column] = "";
            }
        }
 
        for (int i = n / 2 - 1; i >= 1; i--)
            heapifyParaString(array, n, i, column);
 
        for (int i = n - 1; i > 0; i--) {
            String[] temp = array[0];
            array[0] = array[i];
            array[i] = temp;
 
            heapifyParaString(array, i, 0, column);
        }
    }

    public static void heapifyParaString(String array[][], int n, int i, int column) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        
        if (l < n && array[l][column].compareTo(array[largest][column]) > 0)
            largest = l;
 
        if (r < n && array[r][column].compareTo(array[largest][column]) > 0)
            largest = r;
 
        if (largest != i) {
            String[] swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            heapifyParaString(array, n, largest, column);
        }
    }
}