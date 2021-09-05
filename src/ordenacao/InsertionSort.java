package ordenacao;

public class InsertionSort {

    public static void insertionSortParaMortes(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i][10] == null) {
                array[i][10] = "0";
            }
        }

        for (int i = 1; i < array.length; i++) {
            String actual = array[i][10];
            String [] actual_aux = array[i];
            int j = i - 1;
            if(array[j][10] == "last_available_deaths") {
                continue;
            } else {
                while (j >= 1 && Integer.parseInt(array[j][10]) >= Integer.parseInt(actual)) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = actual_aux;
            }
            
        }
    }

    public static void insertionSortParaCasos(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i][7] == null) {
                array[i][7] = "0";
            }
        }

        for (int i = 1; i < array.length; i++) {
            String actual = array[i][7];
            String[] actual_aux = array[i];
            int j = i - 1;
            if(array[j][7] == "last_available_confirmed") {
                continue;
            } else {
                while (j >= 1 && Integer.parseInt(array[j][7]) >= Integer.parseInt(actual)) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = actual_aux;
            }
        }
    }

    public static void insertionSortParaString(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i][4] == null) {
                array[i][4] = "";
            }
        }

        for (int i = 1; i < array.length; i++) {
            String actual = array[i][4];
            String[] actual_aux = array[i];
            int j = i - 1;
            if(array[j][4] == "city") {
                continue;
            } else {
                while (j >= 1 && (array[j][4].compareTo(actual) >= 0)) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = actual_aux;
            }
        }
    }
}
