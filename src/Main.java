
public class Main {

    static final int Kaliningrado = 0;
    static final int Sao_Petersburgo = 1;
    static final int Moscou = 2;
    static final int Saransk = 3;
    static final int Nijni_Novgorod = 4;
    static final int Kazan = 5;
    static final int Ecaterimburgo = 6;
    static final int Samara = 7;
    static final int Volgogrado = 8;
    static final int Rostov = 9;
    static final int Sochi  = 10;

    static double[][] matriz_adjacente = new double[11][11];
    static Cidade[] cidades = new Cidade[11];

    public static void main(String[] args) {
        new Main().init_listCidades();
        new Main().init_matriz_values();
        new Main().mostrarMatrizAdjacente();

    }

    public void init_listCidades() {
        Main main = new Main();
        main.addCidade("Kaliningrado", 0);
        main.addCidade("São Petersburgo",1);
        main.addCidade("Moscou",2);
        main.addCidade("Saransk",3);
        main.addCidade("Níjni Novgorod",4);
        main.addCidade("Kazan",5);
        main.addCidade("Ecaterimburgo",6);
        main.addCidade("Samara",7);
        main.addCidade("Volgogrado",8);
        main.addCidade("Rostov",9);
        main.addCidade("Sochi",10);
    }

    public void addCidade(String cidade, int position){ 
        cidades[position] = new Cidade(cidade);
    }


    public void addValue(int cidade1, int cidade2, double valor) {
        matriz_adjacente[cidade1][cidade2] =  valor;
        matriz_adjacente[cidade2][cidade1] =  valor;

    }
    

    public void init_matriz_values() {
        Main main = new Main();
        // Paulo vitor
        main.addValue(Kaliningrado, Sao_Petersburgo, 2.222);
        main.addValue(Kaliningrado, Ecaterimburgo, 2.713);
        main.addValue(Kaliningrado, Rostov, 1.592);
        main.addValue(Kaliningrado,Sochi , 1.270);
        main.addValue(Sao_Petersburgo, Kaliningrado, 1.363);
        main.addValue(Sao_Petersburgo, Moscou, 1.308);
        main.addValue(Sao_Petersburgo, Kazan, 0.746);
        main.addValue(Sao_Petersburgo, Ecaterimburgo, 0.839);
        main.addValue(Moscou, Sao_Petersburgo, 0.150);
        main.addValue(Moscou, Nijni_Novgorod, 1.440);
        main.addValue(Moscou, Ecaterimburgo, 1.907);
        main.addValue(Moscou, Volgogrado, 1.285);
        main.addValue(Moscou, Rostov, 0.840);
        main.addValue(Saransk, Nijni_Novgorod, 1.372); 
        main.addValue(Saransk, Ecaterimburgo, 0.337);
        main.addValue(Saransk, Volgogrado, 0.048);
        // Clóvis
        main.addValue(Nijni_Novgorod, Moscou, 0.124);
        main.addValue(Nijni_Novgorod, Saransk, 0.045);
        main.addValue(Nijni_Novgorod, Kazan, 0.120);
        main.addValue(Nijni_Novgorod, Sochi, 1.158);
        main.addValue(Kazan, Sao_Petersburgo, 1.144);
        main.addValue(Kazan, Nijni_Novgorod, 0.120);
        main.addValue(Kazan, Samara, 0.106);
        main.addValue(Ecaterimburgo, Kaliningrado, 1.995);
        main.addValue(Ecaterimburgo, Sao_Petersburgo, 1.441);
        main.addValue(Ecaterimburgo, Saransk, 0.783);
        main.addValue(Ecaterimburgo, Moscou, 1.357);
        main.addValue(Ecaterimburgo, Samara,0.525);
        // weslley
        main.addValue(Samara, Kazan, 1.156);
        main.addValue(Samara, Ecaterimburgo, 0.523);
        main.addValue(Samara, Volgogrado, 0.443);
        main.addValue(Samara, Sochi, 0.111);
        main.addValue(Volgogrado, Moscou, 0.744);
        main.addValue(Volgogrado, Saransk, 0.329);
        main.addValue(Volgogrado, Samara, 0.423);
        main.addValue(Volgogrado, Rostov, 0.167);
        main.addValue(Volgogrado, Sochi, 0.559);
        main.addValue(Rostov, Kaliningrado, 2.063);
        main.addValue(Rostov, Moscou, 1.317);
        main.addValue(Rostov, Volgogrado, 0.180);
        main.addValue(Rostov, Sochi, 0.280);
        main.addValue(Sochi, Kaliningrado, 1.924);
        main.addValue(Sochi, Rostov, 0.239);
        main.addValue(Sochi, Volgogrado, 0.550);
        main.addValue(Sochi, Samara, 1.154);
        main.addValue(Sochi, Nijni_Novgorod, 1.174);
    }

    public void mostrarMatrizAdjacente() {
        for (int i = 0; i < matriz_adjacente.length; i++) {
            for (int j = 0; j < matriz_adjacente.length; j++) {
                System.out.print(matriz_adjacente[i][j]+" | ");
            }
            System.out.println("");
        }
    }
}
