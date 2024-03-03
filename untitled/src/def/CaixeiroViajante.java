package def;

import java.util.ArrayList;
import java.util.List;

public class CaixeiroViajante {
    private GrafoMatricial g;

    public CaixeiroViajante(GrafoMatricial g) {
        this.g = g;
    }

    public List<String> resolver() {
        List<String> caminho = new ArrayList<>();
        List<Integer> vertices = new ArrayList<>(); // Lista para armazenar os índices dos vértices
        int numeroVertices = g.getNumeroVertices();

        // Adiciona todos os índices dos vértices à lista
        for (int i = 0; i < numeroVertices; i++) {
            vertices.add(i);
        }

        // Inicializa a variável para armazenar o caminho mais curto
        List<String> menorCaminho = new ArrayList<>();
        double menorDistancia = Double.MAX_VALUE;

        // Encontra todas as permutações dos vértices e calcula a distância
        while (nextPermutation(vertices)) {
            List<String> caminhoAtual = new ArrayList<>();
            for (int indice : vertices) {
                caminhoAtual.add(g.getNomeVertice(indice));
            }
            double distancia = calcularDistancia(caminhoAtual);
            if (distancia < menorDistancia) {
                menorCaminho = new ArrayList<>(caminhoAtual);
                menorDistancia = distancia;
            }
        }

        return menorCaminho;
    }

    // Calcula a distância total do caminho
    private double calcularDistancia(List<String> caminho) {
        double distanciaTotal = 0;
        int numeroVertices = caminho.size();
        for (int i = 0; i < numeroVertices - 1; i++) {
            int v1 = g.getIndiceVertice(caminho.get(i));
            int v2 = g.getIndiceVertice(caminho.get(i + 1));
            distanciaTotal += g.getDistancia(v1, v2);
        }
        return distanciaTotal;
    }

    // Implementação do algoritmo de permutação
    private boolean nextPermutation(List<Integer> arr) {
        int n = arr.size();
        int i = n - 2;
        while (i >= 0 && arr.get(i) >= arr.get(i + 1)) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = n - 1;
        while (arr.get(j) <= arr.get(i)) {
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i + 1, n - 1);
        return true;
    }

    private void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    private void reverse(List<Integer> arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}