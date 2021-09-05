package ordenacao;

public class MergeSort {

	/* Merge sort para ordenar inteiros */
	public static void mergeSort(int size, String[][] array, int column) {
		int element = 1;
		int first, half, last;

		while (element < size) {
			first = 1;

			while (first + element < size) {
				half = first + element;
				last = first + 2 * element;

				if (last > size)
					last = size;

				merge(array, first, half, last, column);

				first = last;
			}

			element = element * 2;
		}
	}

	/* intercala para inteiros */
	public static void merge(String[][] array, int first, int half, int last, int column) {
		String newArray[][] = new String[last - first][16];
		int i = first;
		int m = half;
		int pos = 0;

		while (i < half && m < last) {
			if (array[i][column] == null) {
				array[i][column] = "0";
			}
			if (array[m][column] == null) {
				array[m][column] = "0";
			}
			if (Integer.parseInt(array[i][column]) <= Integer.parseInt(array[m][column])) {
				newArray[pos] = array[i];
				pos = pos + 1;
				i = i + 1;
			} else {
				newArray[pos] = array[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		while (i < half) {
			newArray[pos] = array[i];
			pos = pos + 1;
			i = i + 1;
		}

		while (m < last) {
			newArray[pos] = array[m];
			pos = pos + 1;
			m = m + 1;
		}

		for (pos = 0, i = first; i < last; i++, pos++) {
			array[i] = newArray[pos];
		}
	}

	/* merge sort para string */
	public static void mergeSortParaString(int size, String[][] array) {
		int element = 1;
		int first, half, last;

		while (element < size) {
			first = 1;

			while (first + element < size) {
				half = first + element;
				last = first + 2 * element;

				if (last > size)
					last = size;

				mergeParaString(array, first, half, last);

				first = last;
			}

			element = element * 2;
		}
	}

	/* intercala para string */
	public static void mergeParaString(String[][] array, int first, int half, int last) {
		String newArray[][] = new String[last - first][16];
		int i = first;
		int m = half;
		int pos = 0;

		while (i < half && m < last) {
			if (array[i][4] == null) {
				array[i][4] = "0";
			}
			if (array[m][4] == null) {
				array[m][4] = "0";
			}
			if (array[i][4].compareTo(array[m][4]) < 0) {
				newArray[pos] = array[i];
				pos = pos + 1;
				i = i + 1;
			} else {
				newArray[pos] = array[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		while (i < half) {
			newArray[pos] = array[i];
			pos = pos + 1;
			i = i + 1;
		}

		while (m < last) {
			newArray[pos] = array[m];
			pos = pos + 1;
			m = m + 1;
		}

		for (pos = 0, i = first; i < last; i++, pos++) {
			array[i] = newArray[pos];
		}
	}
}