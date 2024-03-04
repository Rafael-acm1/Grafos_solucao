package def;
import java.util.ArrayList;
import java.util.List;

    public class CaminhoHamiltoniano {
        private Grafo g;
        private int numeroVertices;
        private List<Integer> caminho;
        private boolean[] visitado;

        public CaminhoHamiltoniano(Grafo g) {
            this.g = g;
            this.numeroVertices = g.getNumeroVertices();
            this.caminho = new ArrayList<>(numeroVertices);
            this.visitado = new boolean[numeroVertices];
        }

        public List<String> resolver() {
            caminho.add(0);
            if (encontrarCaminhoHamiltoniano(0)) {
                List<String> caminhoNomes = new ArrayList<>();
                for (Integer i : caminho) {
                    caminhoNomes.add(g.getNomeVertice(i));
                }
                return caminhoNomes;
            } else {
                return null;
            }
        }


        private boolean encontrarCaminhoHamiltoniano(int v) {
            if (caminho.size() == numeroVertices) {
                return true;
            }

            for (int w : g.listarAdjacencias(v)) {
                if (!visitado[w] && w != 0) {
                    visitado[w] = true;
                    caminho.add(w);

                    if (encontrarCaminhoHamiltoniano(w)) {
                        return true;
                    }

                    visitado[w] = false;
                    caminho.remove(caminho.size() - 1);
                }
            }

            return false;
        }

    }

