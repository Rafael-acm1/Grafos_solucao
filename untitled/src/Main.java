import def.CaminhoHamiltoniano;
import def.GrafoMatricial;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GrafoMatricial g = new GrafoMatricial(10);
        for(int i = 1; i<=10; i++){
            g.adicionarVertice("A"+ i);
        }









        g.adicionarAresta("A1", "A3", 2);
        g.adicionarAresta("A1", "A4", 10);
        g.adicionarAresta("A2", "A4", 2);
        g.adicionarAresta("A2", "A3", 1);
        g.adicionarAresta("A5", "A4", 1);
        g.adicionarAresta("A5", "A6", 2);
        g.adicionarAresta("A6", "A3", 10);

        g.adicionarAresta("A7", "A3", 2);
        g.adicionarAresta("A7", "A8", 2);
        g.adicionarAresta("A6", "A8", 2);

        g.adicionarAresta("A7", "A9", 1);
        g.adicionarAresta("A9", "A10", 2);
        g.adicionarAresta("A3", "A10", 10);







        g.imprimir();
        CaminhoHamiltoniano ch = new CaminhoHamiltoniano(g);
        List<String> caminho = ch.resolver();

        System.out.println(caminho);
}
}