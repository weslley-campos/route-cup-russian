import java.util.*;

public class Main extends Cidade implements Comparable<Cidade> {

    protected static double[][] matriz_adjacente = new double[11][11];
    protected static Cidade[] cidades = new Cidade[11];

    public Main(){}

    public Main(String cidade, int position) {
        super(cidade, position);
    }

    public static void main(String[] args) {
//        int origem = 0, destino = 6;   // Teste de Kalinigrado -> Ecaterimburgo
        int origem = 10, destino = 1;    // Teste de Sochi       -> São Petersburgo
        new Data(cidades, matriz_adjacente);
        Cidade city = new Main().uniformCustSearch(origem, destino);

        while (city.getPai() != null) {
            System.out.println(city.getCidade());
            city = city.getPai();
        }
        System.out.println(city.getCidade());
    }


    public Cidade uniformCustSearch(int origem, int destino) {

        PriorityQueue<Cidade> fila = new PriorityQueue<Cidade>();
        cidades[destino].setIsFinal(true);
        cidades[origem] .setIsInicial(true);
        cidades[origem] .setWasVisited(true);
        fila.add(cidades[origem]);

        while (!fila.isEmpty()) {

            Cidade cidadeAtual = fila.remove();

//            System.out.printf("\n[%s = %1.3f]\n", cidadeAtual.getCidade(),cidadeAtual.getCustNode());

            if (cidadeAtual.isFinal() == cidades[destino].isFinal())
                return cidadeAtual;

            for (int i = 0; i < matriz_adjacente.length; i++) {
                if ((matriz_adjacente[cidadeAtual.getPosition()][i] != 0) && (cidades[i].wasVisited() == false)) {
                    cidades[i].setCustNode(cidadeAtual.getCustNode()+ matriz_adjacente[cidadeAtual.getPosition()][i]);
                    cidades[i].setPai(cidades[cidadeAtual.getPosition()]);
                    fila.add(cidades[i]);
                    cidades[i].setWasVisited(true);
                }
            }
//            fila.iterator().forEachRemaining(v -> {
//                System.out.printf("[%s = %1.3f] ", v.getCidade(),v.getCustNode());
//            });
//            System.out.println( );
        }
        return null;
    }
}
