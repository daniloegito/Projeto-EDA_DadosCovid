# Primeiro projeto da disciplina Estrutura de Dados e Algoritmos 

Atividade que faz análise e comparação dos algoritmos de ordenação aplicados a dados referentes a número de casos e numero de óbitos causados por Covid19.
A aplicação ordena por Número de Casos, Numero de óbitos e Nomes das cidades, arquivos .csv e retorna outros arquivos já ordenados de forma crescente mostrando também o tempo de execução que cada algoritmo precisa para oredenar uma mesma entrada.

# Executando o código 
Ao baixar o projeto, vá até a linha 22 da classe Main e cole o diretório do arquivo .csv que seja ordenar, como na imagem abaixo.
Use o caminho do diretório conforme o sistema operacional de sua máquina. MacOS e Linux utilizam (/) e Windows (\\).
![git](https://user-images.githubusercontent.com/31939598/132149962-ea92dba1-9729-48de-b9b3-6c8786f34227.jpg)

Ainda na classe Main, linhas 299 e 303, cole um diretório onde deseja salvar os arquivos .csv ordenados gerados.
![git saida](https://user-images.githubusercontent.com/31939598/132150326-9df1d75d-aefd-40ba-981e-a68aae5b2663.jpg)

Execute o código na IDE, ele irá retornar os resultados de tempo em milisegundos de cada algoritmo para uma entrada desordenada (caso médio) e para uma entrada ordenada (melhor caso).
Cada algoritmo irá gerar na pasta escolhida como saída 3 arquivos, como por exemplo, para o Quick Sort, qSort_ordena_obitos.csv e qSort_ordena_casos.csv e qSort_ordena_cidades.csv.

