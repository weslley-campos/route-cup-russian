import java.util.PriorityQueue;

/**
 * UniformCustSearch
 */
public class UniformCustSearch {

    protected static double[][] matriz_adjacente = new double[11][11];
    protected static Cidade[] cidades = new Cidade[11];

    public Cidade uniformCustSearch(int origem, int destino) {

        PriorityQueue<Cidade> fila = new PriorityQueue<Cidade>();
        cidades[destino].setIsFinal(true);
        cidades[origem] .setWasVisited(true);
        fila.add(cidades[origem]);

        while (!fila.isEmpty()) {

            Cidade cidadeAtual = fila.remove();

            if (cidadeAtual.isFinal() == cidades[destino].isFinal())
                return cidadeAtual;

            for (int i = 0; i < matriz_adjacente.length; i++) {
                if ((matriz_adjacente[cidadeAtual.getPosition()][i] != 0) && (cidades[i].wasVisited() == false)) {
                    cidades[i].setCustNode(cidadeAtual.getCustNode()+ matriz_adjacente[cidadeAtual.getPosition()][i]);
                    cidades[i].setPai(cidades[cidadeAtual.getPosition()]);
                    cidades[i].setWasVisited(true);
                    fila.add(cidades[i]);
                }
            }
        }
        return null;
    }
}