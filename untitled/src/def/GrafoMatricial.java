package def;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrafoMatricial implements Grafo {
    private double distancias[][];
    private List<String> mapa;
    private int numeroVertices;

    public GrafoMatricial(int numeroVertices){
        this.numeroVertices = numeroVertices;
        this.mapa = new ArrayList<String>(numeroVertices);
        this.distancias = new double[numeroVertices][numeroVertices];

        for(int i=0; i<numeroVertices;i++){
            Arrays.fill(this.distancias[i], Double.MAX_VALUE);
            this.distancias[i][i] = 0;
            /*for(int j=0; j<numeroVertices;j++){
                this.distancias[i][j] = 0;
            }*/
        }


    }


    public int getIndiceVertice(String v){

        return this.mapa.indexOf(v);
    }

    public void adicionarAresta(String v1, String v2, int distancia){
        this.distancias[getIndiceVertice(v1)][getIndiceVertice(v2)] = distancia;
        this.distancias[getIndiceVertice(v2)][getIndiceVertice(v1)] = distancia;
    }

    public void adicionarVertice(String v){
        this.mapa.add(v);
    }



    /*public void imprimir(){
        for(int i=0; i<numeroVertices;i++){
            for(int j=0; j<numeroVertices;j++){
                System.out.print(this.distancias[i][j] + "\t");
            }
            System.out.println("");
        }
    }*/
    public void imprimir() {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                if (this.distancias[i][j] == Double.MAX_VALUE) {
                    System.out.print(" ∞\t");
                } else {
                    System.out.print(this.distancias[i][j] + "\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public List<Integer> listarAdjacencias(int v) {
        List<Integer> adjacentes = new ArrayList<>();

        for (int j = 0; j < numeroVertices; j++) {
            if (distancias[v][j] != 0 && distancias[v][j] != Double.MAX_VALUE && v != j) {
                adjacentes.add(j);
            }
        }

        return adjacentes;
    }


    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    public String getNomeVertice(int v){
        return this.mapa.get(v);
    }

    public double getDistancia(int v1, int v2) {
        return this.distancias[v1][v2];
    }




}
