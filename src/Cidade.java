public class Cidade {
    public String cidade;
    boolean wasVisited;

    public Cidade(String cidade) {
        this.cidade = cidade;
        this.wasVisited = false;
    }

    public String getCidade() {
        return cidade;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
