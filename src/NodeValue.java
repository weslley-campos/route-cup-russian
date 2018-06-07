public class NodeValue {
    int distancia;
    double tempo;
    int pedagios;

    public NodeValue(int distancia, double tempo, int pedagios) {
        this.distancia = distancia;
        this.tempo = tempo;
        this.pedagios = pedagios;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public int getPedagios() {
        return pedagios;
    }

    public void setPedagios(int pedagios) {
        this.pedagios = pedagios;
    }
}
