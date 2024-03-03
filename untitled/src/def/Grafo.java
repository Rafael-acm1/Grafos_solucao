package def;


import java.util.List;

public interface Grafo {

    public int getIndiceVertice(String v);
    public void adicionarAresta(String v1, String v2, int distancia);
    public void adicionarVertice(String v);
    public void imprimir();
    public List<Integer> listarAdjacencias(int v);
    public int getNumeroVertices();
    public void setNumeroVertices(int numeroVertices);
    public String getNomeVertice(int v);
    public double getDistancia(int v1, int v2);


}
