public class Main {

    static final int Kaliningrado = 0;
    static final int São_Petersburgo = 1;
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
        main.addNodeValue(Kaliningrado, São_Petersburgo, new NodeValue(965, 12.32,3));
         main.addNodeValue(Kaliningrado, Ecaterimburgo, new NodeValue(3046, 39.0,1));
        main.addNodeValue(Kaliningrado, Rostov, new NodeValue(2319, 27.0,3));
        main.addNodeValue(Kaliningrado,Sochi , new NodeValue(2709, 36.0,4));
        main.addNodeValue(São_Petersburgo, Kaliningrado, new NodeValue(965, 12.32,3));
        main.addNodeValue(São_Petersburgo, Moscou, new NodeValue(711, 9.11,2));
        main.addNodeValue(São_Petersburgo, Kazan, new NodeValue(1527, 19.42,4));
        main.addNodeValue(São_Petersburgo, Ecaterimburgo, new NodeValue(2227,30.0,0));
        main.addNodeValue(Moscou, São_Petersburgo, new NodeValue(711,9.11,2));
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
        main.addNodeValue(Samara, null, new NodeValue(null,null,null));
        main.addNodeValue(Samara, null, new NodeValue(null,null,null));
        main.addNodeValue(Samara, null, new NodeValue(null,null,null));
        main.addNodeValue(Samara, null, new NodeValue(null,null,null));
        main.addNodeValue(Volgogrado, null, new NodeValue(null,null,null));
        main.addNodeValue(Volgogrado, null, new NodeValue(null,null,null));
        main.addNodeValue(Volgogrado, null, new NodeValue(null,null,null));
        main.addNodeValue(Volgogrado, null, new NodeValue(null,null,null));
        main.addNodeValue(Volgogrado, null, new NodeValue(null,null,null));
        main.addNodeValue(Rostov, null, new NodeValue(null,null,null));
        main.addNodeValue(Rostov, null, new NodeValue(null,null,null));
        main.addNodeValue(Rostov, null, new NodeValue(null,null,null));
        main.addNodeValue(Rostov, null, new NodeValue(null,null,null));
        main.addNodeValue(Sochi, null, new NodeValue(null,null,null));
        main.addNodeValue(Sochi, null, new NodeValue(null,null,null));
        main.addNodeValue(Sochi, null, new NodeValue(null,null,null));
        main.addNodeValue(Sochi, null, new NodeValue(null,null,null));
        main.addNodeValue(Sochi, null, new NodeValue(null,null,null));
    }
}
