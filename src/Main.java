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
        main.addNodeValue(Kaliningrado, null, new NodeValue(null, null,null));
        main.addNodeValue(Kaliningrado, null, new NodeValue(null, null,null));
        main.addNodeValue(Kaliningrado, null, new NodeValue(null, null,null));
        main.addNodeValue(São_Petersburgo, null, new NodeValue(null, null,null));
        main.addNodeValue(São_Petersburgo, null, new NodeValue(null, null,null));
        main.addNodeValue(São_Petersburgo, null, new NodeValue(null, null,null));
        main.addNodeValue(São_Petersburgo, null, new NodeValue(null,null,null));
        main.addNodeValue(Moscou, null, new NodeValue(null,null,null));
        main.addNodeValue(Moscou, null, new NodeValue(null,null,null));
        main.addNodeValue(Moscou, null, new NodeValue(null,null,null));
        main.addNodeValue(Moscou, null, new NodeValue(null,null,null));
        main.addNodeValue(Moscou, null, new NodeValue(null,null,null));
        main.addNodeValue(Saransk, null, new NodeValue(null,null,null));
        main.addNodeValue(Saransk, null, new NodeValue(null,null,null));
        main.addNodeValue(Saransk, null, new NodeValue(null,null,null));
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
