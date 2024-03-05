import def.CaminhoHamiltoniano;
import def.GrafoMatricial;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GrafoMatricial g = new GrafoMatricial(50);
        for(int i = 1; i<=50; i++){
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
        g.adicionarAresta("A11", "A10", 2);
        g.adicionarAresta("A11", "A12", 10);
        g.adicionarAresta("A12", "A4", 10);
        g.adicionarAresta("A4", "A14", 5);
        g.adicionarAresta("A5", "A15", 1);
        g.adicionarAresta("A14", "A15", 3);
        g.adicionarAresta("A13", "A14", 1);
        g.adicionarAresta("A13", "A12", 2);
        g.adicionarAresta("A8", "A20", 3);
        g.adicionarAresta("A20", "A21", 9);
        g.adicionarAresta("A21", "A16", 4);
        g.adicionarAresta("A8", "A16", 6);
        g.adicionarAresta("A16", "A17", 5);
        g.adicionarAresta("A6", "A17", 10);
        g.adicionarAresta("A17", "A18", 4);
        g.adicionarAresta("A18", "A19", 2);
        g.adicionarAresta("A15", "A19", 9);
        g.adicionarAresta("A20", "A22", 1);
        g.adicionarAresta("A7", "A22", 1);
        g.adicionarAresta("A22", "A23", 9);
        g.adicionarAresta("A9", "A23", 2);
        g.adicionarAresta("A9", "A24", 7);
        g.adicionarAresta("A23", "A25", 2);
        g.adicionarAresta("A24", "A25", 1);
        g.adicionarAresta("A27", "A19", 4);
        g.adicionarAresta("A27", "A26", 3);
        g.adicionarAresta("A26", "A15", 2);
        g.adicionarAresta("A26", "A28", 1);
        g.adicionarAresta("A28", "A14", 6);
        g.adicionarAresta("A28", "A29", 7);
        g.adicionarAresta("A29", "A13", 9);
        g.adicionarAresta("A29", "A30", 2);
        g.adicionarAresta("A30", "A31", 4);
        g.adicionarAresta("A31", "A13", 2);
        g.adicionarAresta("A31", "A32", 2);
        g.adicionarAresta("A32", "A34", 6);
        g.adicionarAresta("A32", "A12", 1);
        g.adicionarAresta("A34", "A33", 5);
        g.adicionarAresta("A33", "A10", 8);
        g.adicionarAresta("A33", "A24", 4);
        g.adicionarAresta("A35", "A27", 1);
        g.adicionarAresta("A35", "A36", 8);
        g.adicionarAresta("A36", "A19", 4);
        g.adicionarAresta("A36", "A37", 2);
        g.adicionarAresta("A37", "A39", 1);
        g.adicionarAresta("A37", "A38", 1);
        g.adicionarAresta("A39", "A40", 1);
        g.adicionarAresta("A38", "A40", 1);
        g.adicionarAresta("A40", "A41", 7);
        g.adicionarAresta("A37", "A18", 5);
        g.adicionarAresta("A40", "A17", 4);
        g.adicionarAresta("A41", "A16", 2);
        g.adicionarAresta("A41", "A42", 9);
        g.adicionarAresta("A42", "A21", 1);
        g.adicionarAresta("A42", "A43", 8);
        g.adicionarAresta("A43", "A44", 2);
        g.adicionarAresta("A44", "A45", 8);
        g.adicionarAresta("A45", "A50", 7);
        g.adicionarAresta("A45", "A49", 1);
        g.adicionarAresta("A49", "A48", 2);
        g.adicionarAresta("A48", "A50", 10);
        g.adicionarAresta("A49", "A50", 1);
        g.adicionarAresta("A48", "A47", 4);
        g.adicionarAresta("A47", "A46", 3);
        g.adicionarAresta("A46", "A25", 4);


        //g.imprimir();
        CaminhoHamiltoniano ch = new CaminhoHamiltoniano(g);
        List<String> caminho = ch.resolver();

        System.out.println("");
        System.out.println("Sendo A1 a cidade inicial, as encanações devem seguir o seguinte caminho:");
        System.out.println("");

        for (int i = 0; i < caminho.size() - 1; i++) {
            String sitioAtual = caminho.get(i);
            String proximoSitio = caminho.get(i + 1);
            double distancia = g.getDistancia(sitioAtual, proximoSitio);
            System.out.println(sitioAtual + " -> " + proximoSitio + " : " + distancia + " km");
        }
    }
}