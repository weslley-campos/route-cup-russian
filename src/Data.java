public class Data {

    private static final int Kaliningrado = 0;
    private static final int Sao_Petersburgo = 1;
    private static final int Moscou = 2;
    private static final int Saransk = 3;
    private static final int Nijni_Novgorod = 4;
    private static final int Kazan = 5;
    private static final int Ecaterimburgo = 6;
    private static final int Samara = 7;
    private static final int Volgogrado = 8;
    private static final int Rostov = 9;
    private static final int Sochi  = 10;

    public Data(Cidade[] cidades, double[][] matriz_adjacente) {
        initCidades(cidades);
        initMatriz(matriz_adjacente);
    }

    public void initCidades(Cidade[] cidades) {
        cidades[0] = new Cidade("Kaliningrado", 0);
        cidades[1] = new Cidade("São Petersburgo", 1);
        cidades[2] = new Cidade("Moscou", 2);
        cidades[3] = new Cidade("Saransk", 3);
        cidades[4] = new Cidade("Níjni Novgorod", 4);
        cidades[5] = new Cidade("Kazan", 5);
        cidades[6] = new Cidade("Ecaterimburgo", 6);
        cidades[7] = new Cidade("Samara", 7);
        cidades[8] = new Cidade("Volgogrado", 8);
        cidades[9] = new Cidade("Rostov", 9);
        cidades[10] = new Cidade("Sochi",10);
    }

    public void initMatriz(double[][] matriz_adjacente) {
        insertData(matriz_adjacente, Kaliningrado, Sao_Petersburgo, 2.222);
        insertData(matriz_adjacente, Kaliningrado, Ecaterimburgo, 2.713);
        insertData(matriz_adjacente, Kaliningrado, Rostov, 1.592);
        insertData(matriz_adjacente, Kaliningrado, Sochi , 1.270);
        insertData(matriz_adjacente, Sao_Petersburgo, Moscou, 1.308);
        insertData(matriz_adjacente, Sao_Petersburgo, Kazan, 0.746);
        insertData(matriz_adjacente, Sao_Petersburgo, Ecaterimburgo, 0.839);
        insertData(matriz_adjacente, Moscou, Nijni_Novgorod, 1.440);
        insertData(matriz_adjacente, Moscou, Ecaterimburgo, 1.907);
        insertData(matriz_adjacente, Moscou, Volgogrado, 1.285);
        insertData(matriz_adjacente, Moscou, Rostov, 0.840);
        insertData(matriz_adjacente, Saransk, Nijni_Novgorod, 1.372); 
        insertData(matriz_adjacente, Saransk, Ecaterimburgo, 0.337);
        insertData(matriz_adjacente, Saransk, Volgogrado, 0.048);
        insertData(matriz_adjacente, Nijni_Novgorod, Kazan, 0.120);
        insertData(matriz_adjacente, Nijni_Novgorod, Sochi, 1.158);
        insertData(matriz_adjacente, Kazan, Samara, 0.106);
        insertData(matriz_adjacente, Ecaterimburgo, Samara,0.525);
        insertData(matriz_adjacente, Samara, Volgogrado, 0.443);
        insertData(matriz_adjacente, Samara, Sochi, 0.111);
        insertData(matriz_adjacente, Volgogrado, Rostov, 0.167);
        insertData(matriz_adjacente, Volgogrado, Sochi, 0.559);
        insertData(matriz_adjacente, Rostov, Sochi, 0.280);
    }

    public void insertData(double[][] matriz_adjacente, int origem, int destino, double valor){
        matriz_adjacente[origem][destino] = valor;
        matriz_adjacente[destino][origem] = valor;
    }
}