import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import ordenacao.*;

public class Main {
	public static String List[] = new String[1];

	public static void main(String[] args) throws IOException {

		/*
		 * FAZ A LEITURA DO ARQUIVO .CSV 
		 * Atenção para o caminho do diretório, no Linux e
		 * MacOS utilizam (/), e no Windows (\\) Os arquivos de saída serão gerados na
		 * mesma pasta do arquivo de entrada \\dados\\
		 */
		// A entrada desta linha deve ser alterada para o diretório onde se encontra o arquivo .csv que deseja ordenar
		//
		readAllLinesFromFile("COLE AQUI O DIRETÓRIO DO ARQUIVO.CSV");

		System.out.println("------- ALGORITMOS DE ORDENAÇÃO E TEMPO GASTO -------\n");

		/* ORDENAÇÃO COM SELECTION SORT */
		// QUANTIDADE DE CASOS
		System.out.println("ALGORITMO SELECTION SORT");
		System.out.println("CASOS");
		String selectionCasos[][] = convertToSplited(List);
		long tempoInicial = System.currentTimeMillis();
		SelectionSort.selectionSortParaCasos(selectionCasos);
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("sSort_ordena_casos", selectionCasos);
		tempoInicial = System.currentTimeMillis();
		SelectionSort.selectionSortParaCasos(selectionCasos);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// QUANTIDADE DE MORTES
		System.out.println("MORTES");
		String selectionMortes[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		SelectionSort.selectionSortParaMortes(selectionMortes);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("sSort_ordena_obitos", selectionMortes);
		tempoInicial = System.currentTimeMillis();
		SelectionSort.selectionSortParaMortes(selectionMortes);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// NOMES DAS CIDAES
		System.out.println("CIDADES");
		String selectionNomeCidade[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		SelectionSort.selectionSortParaString(selectionNomeCidade);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("sSort_ordena_cidades", selectionNomeCidade);
		tempoInicial = System.currentTimeMillis();
		SelectionSort.selectionSortParaString(selectionNomeCidade);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms\n");

		/* ORDENAÇÃO COM INSERTION SORT */
		// QUANTIDADE DE CASOS
		System.out.println("ALGORITMO INSERTION SORT");
		System.out.println("CASOS");
		String insertionCasos[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		InsertionSort.insertionSortParaCasos(insertionCasos);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("iSort_ordena_casos", insertionCasos);
		tempoInicial = System.currentTimeMillis();
		InsertionSort.insertionSortParaCasos(insertionCasos);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// QUANTIDADE DE MORTES
		System.out.println("MORTES");
		String insertionMortes[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		InsertionSort.insertionSortParaMortes(insertionMortes);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("iSort_ordena_obitos", insertionMortes);
		tempoInicial = System.currentTimeMillis();
		InsertionSort.insertionSortParaMortes(insertionMortes);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// NOMES DAS CIDADES
		System.out.println("CIDADES");
		String insertionCidades[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		InsertionSort.insertionSortParaString(insertionCidades);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("iSort_ordena_cidades", insertionCidades);
		tempoInicial = System.currentTimeMillis();
		InsertionSort.insertionSortParaString(insertionCidades);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms\n");

		/* ORDENAÇÃO COM MERGE SORT */
		// QUANTIDADE DE CASOS
		System.out.println("ALGORITMO MERGE SORT");
		System.out.println("CASOS");
		String mergeCasos[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSort(mergeCasos.length, mergeCasos, 7);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("mSort_ordena_casos", mergeCasos);
		tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSort(mergeCasos.length, mergeCasos, 7);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		//QUANTIDADE DE MORTES
		System.out.println("MORTES");
		String mergeMortes[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSort(mergeMortes.length, mergeMortes, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("mSort_ordena_obitos", mergeMortes);
		tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSort(mergeMortes.length, mergeMortes, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// NOMES DAS CIDADES
		System.out.println("CIDADES");
		String mergeCidades[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSortParaString(mergeCidades.length, mergeCidades);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("mSort_ordena_cidades", mergeCidades);
		tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSortParaString(mergeCidades.length, mergeCidades);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms\n");

		/* ORDENAÇÃO COM QUICK SORT */
		// QUANTIDADE DE CASOS
		System.out.println("ALGORITMO QUICK SORT");
		System.out.println("CASOS");
		String quickCasos[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		QuickSort.quickSort(quickCasos, 1, quickCasos.length - 1, 7);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("qSort_ordena_casos", quickCasos);
		tempoInicial = System.currentTimeMillis();
		QuickSort.quickSort(quickCasos, 1, quickCasos.length - 1, 7);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// QUANTIDADE DE MORTES
		System.out.println("MORTES");
		String quickMortes[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		QuickSort.quickSort(quickMortes, 1, quickMortes.length - 1, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("qSort_ordena_obitos", quickMortes);
		tempoInicial = System.currentTimeMillis();
		QuickSort.quickSort(quickMortes, 1, quickMortes.length - 1, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// NOMES DAS CIDADES
		System.out.println("CIDADES");
		String quickCidades[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		QuickSort.quickSortParaString(quickCidades, 1, quickCidades.length - 1);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("qSort_ordena_cidades", quickCidades);
		QuickSort.quickSortParaString(quickCidades, 1, quickCidades.length - 1);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial)+ "ms\n");
		
		/* ORDENAÇÃO COM COUNTING SORT */
		// QUANTIDADE DE CASOS
		System.out.println("ALGORITMO COUNTING SORT");
		System.out.println("CASOS");
		String countingCasos[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		CountingSort.countingSortParaCasos(countingCasos, countingCasos.length);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("cSort_ordena_casos", countingCasos);
		tempoInicial = System.currentTimeMillis();
		CountingSort.countingSortParaCasos(countingCasos, countingCasos.length);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// QUANTIDADE DE MORTES
		System.out.println("MORTES");
		String countingMortes[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		CountingSort.countingSortParaMortes(countingMortes, countingMortes.length);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("cSort_ordena_obitos", countingMortes);
		tempoInicial = System.currentTimeMillis();
		CountingSort.countingSortParaMortes(countingMortes, countingMortes.length);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms\n");
		
		/* ORDENAÇÃO COM HEAP SORT */
		// QUANTIDADE DE CASOS
		System.out.println("ALGORITMO HEAP SORT");
		System.out.println("CASOS");
		String heapCasos[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		HeapSort.heapSort(heapCasos, 7);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("hSort_ordena_casos", heapCasos);
		heapCasos = heapAux(heapCasos);
		tempoInicial = System.currentTimeMillis();
		HeapSort.heapSort(heapCasos, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// QUANTIDADE DE MORTES
		System.out.println("MORTES");
		String heapMortes[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		HeapSort.heapSort(heapMortes, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("hSort_ordena_obitos", heapMortes);
		heapMortes = heapAux(heapMortes);
		tempoInicial = System.currentTimeMillis();
		HeapSort.heapSort(heapMortes, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms");
		// NOMES DAS CIDADES
		System.out.println("CIDADES");
		String heapCidades[][] = convertToSplited(List);
		tempoInicial = System.currentTimeMillis();
		HeapSort.heapSortParaString(heapCidades, 4);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - caso médio: " + (tempoFinal - tempoInicial) + "ms");
		writeAllLinesToFile("hSort_ordena_cidades", heapCidades);
		heapCidades = heapAux(heapCidades);
		tempoInicial = System.currentTimeMillis();
		HeapSort.heapSort(heapCidades, 10);
		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo de execução - melhor caso: " + (tempoFinal - tempoInicial) + "ms\n");

	}

	//FAZ A LEITURA DO ARQUIVO CSV E ARMAZENA EM UM ARRAY
	public static String[] readAllLinesFromFile(String path) throws IOException {

		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			String[] longer = new String[List.length + 1];
			System.arraycopy(List, 0, longer, 0, List.length);
			longer[List.length] = line;
			List = new String[longer.length];
			for (int i = 0; i < longer.length; i++) {
				List[i] = longer[i];
			}
		}
		bufferedReader.close();

		return List;

	}

	// CONVERTE EM LINHAS E COLUNAS UM ARRAY COM STRINGS
	public static String[][] convertToSplited(String[] arrSplit) {
		String[][] splitArr = new String[List.length][16];
		int cont = 0;
		for (String arrSplits : arrSplit) {
			if (arrSplits != null) {
				String[] parts = arrSplits.split(",");
				for (int i = 0; i < 16; i++) {
					splitArr[cont][i] = parts[i];
				}
				cont++;
			}
		}

		return splitArr;
	}

	//GERA UM ARQUIVO .CSV CONTENDO O ARRAY
	/*
	 * Atenção para o caminho do diretório, no Linux e MacOS utilizam (/), e no Windows (\\) 
	 * Os arquivos de saída serão gerados na mesma pasta do arquivo de
	 * entrada \\dados\\
	 */
	
	
	public static void writeAllLinesToFile(String fileName, String[][] aList) throws IOException {
		File newFile = new File("COLE AQUI O DIRETÓRIO DE DESTINO PARA OS ARQUIVOS CSV" + fileName + ".csv");
		String aux = "";
		String line = "";
		try {
			FileWriter file = new FileWriter("COLE AQUI O DIRETÓRIO DE DESTINO PARA OS ARQUIVOS CSV" + fileName + ".csv");
			PrintWriter write = new PrintWriter(file);
			for (int i = 0; i < aList.length; i++) {
				for (int j = 0; j < 16; j++) {
					aux = aList[i][j] + ",";
					line += aux;
				}
				write.println(line);
				line = "";
				aux = "";
			}
			write.close();
		} catch (IOException exe) {
			System.out.println("O arquivo .CSV não pode ser criado");
		}
	}

	public static String[][] heapAux(String vet[][]) {
		String[][] temp = new String[vet.length][16];
		for (int i = 0; i < vet.length - 1; i++) {
			temp[i] = vet[i];
		}
		return temp;
	}
}
