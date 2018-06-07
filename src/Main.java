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

    static Cidade[] listCidades = new Cidade[11];
    static NodeValue[][] nodeValues;

    public static void main(String[] args) {
        Main main = new Main();

        main.init_listCidades();

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

    public void addCidade(String city, int position){
        listCidades[position] = new Cidade(city);
    }

    public void addNodeValue(int inicio, int fim, NodeValue nodeValue){
        nodeValues[inicio][fim] = nodeValue;
        nodeValues[fim][inicio] = nodeValue;
    }

    public void init_matriz_nodevalues() {
        Main main = new Main();
        // exemplo para inserção
        // Paulo vitor
        main.addNodeValue(Kaliningrado, Sao_Petersburgo, new NodeValue(965, 12.32,3));
        main.addNodeValue(Kaliningrado, Ecaterimburgo, new NodeValue(3046, 39.0,1));
        main.addNodeValue(Kaliningrado, Rostov, new NodeValue(2319, 27.0,3));
        main.addNodeValue(Kaliningrado,Sochi , new NodeValue(2709, 36.0,4));
        main.addNodeValue(Sao_Petersburgo, Kaliningrado, new NodeValue(965, 12.32,3));
        main.addNodeValue(Sao_Petersburgo, Moscou, new NodeValue(711, 9.11,2));
        main.addNodeValue(Sao_Petersburgo, Kazan, new NodeValue(1527, 19.42,4));
        main.addNodeValue(Sao_Petersburgo, Ecaterimburgo, new NodeValue(2227,30.0,0));
        main.addNodeValue(Moscou, Sao_Petersburgo, new NodeValue(711,9.11,2));
        main.addNodeValue(Moscou, Nijni_Novgorod, new NodeValue(417,6.17,0));
        main.addNodeValue(Moscou, Ecaterimburgo, new NodeValue(1785,24.0,1));
        main.addNodeValue(Moscou, Volgogrado, new NodeValue(969,11.40,1));
        main.addNodeValue(Moscou, Rostov, new NodeValue(1076,12.30,3));
        main.addNodeValue(Saransk, Nijni_Novgorod, new NodeValue(284,4.8,0));
        main.addNodeValue(Saransk, Ecaterimburgo, new NodeValue(1340,17.41,0));
        main.addNodeValue(Saransk, Volgogrado, new NodeValue(715,9.3,0));
        // Clovis
        main.addNodeValue(Nijni_Novgorod, null, new NodeValue(null,null,null));
        main.addNodeValue(Nijni_Novgorod, null, new NodeValue(null,null,null));
        main.addNodeValue(Nijni_Novgorod, null, new NodeValue(null,null,null));
        main.addNodeValue(Nijni_Novgorod, null, new NodeValue(null,null,null));
        main.addNodeValue(Kazan, null, new NodeValue(null,null,null));
        main.addNodeValue(Kazan, null, new NodeValue(null,null,null));
        main.addNodeValue(Kazan, null, new NodeValue(null,null,null));
        main.addNodeValue(Ecaterimburgo, null, new NodeValue(null,null,null));
        main.addNodeValue(Ecaterimburgo, null, new NodeValue(null,null,null));
        main.addNodeValue(Ecaterimburgo, null, new NodeValue(null,null,null));
        main.addNodeValue(Ecaterimburgo, null, new NodeValue(null,null,null));
        main.addNodeValue(Ecaterimburgo, null, new NodeValue(null,null,null));
        // weslley
        main.addNodeValue(Samara, Kazan, new NodeValue(358,5.21,0));
        main.addNodeValue(Samara, Ecaterimburgo, new NodeValue(974,12.31,0));
        main.addNodeValue(Samara, Volgogrado, new NodeValue(798,11.57,0));
        main.addNodeValue(Samara, Sochi, new NodeValue(1802,25,0));
        main.addNodeValue(Volgogrado, Moscou, new NodeValue(969,11.32,1));
        main.addNodeValue(Volgogrado, Saransk, new NodeValue(715,8.4,0));
        main.addNodeValue(Volgogrado, Samara, new NodeValue(817,10.53,0));
        main.addNodeValue(Volgogrado, Rostov, new NodeValue(472,5.58,0));
        main.addNodeValue(Volgogrado, Sochi, new NodeValue(985,13.41,0));
        main.addNodeValue(Rostov, Kaliningrado, new NodeValue(2097,27,3));
        main.addNodeValue(Rostov, Moscou, new NodeValue(1078,12.49,3));
        main.addNodeValue(Rostov, Volgogrado, new NodeValue(472,6.25,0));
        main.addNodeValue(Rostov, Sochi, new NodeValue(564,8.54,0));
        main.addNodeValue(Sochi, Kaliningrado, new NodeValue(2540,36,4));
        main.addNodeValue(Sochi, Rostov, new NodeValue(554,7.32,0));
        main.addNodeValue(Sochi, Volgogrado, new NodeValue(981,13.24,0));
        main.addNodeValue(Sochi, Samara, new NodeValue(1798,25,0));
        main.addNodeValue(Sochi, Nijni_Novgorod, new NodeValue(18855,25,0));
    }
}
