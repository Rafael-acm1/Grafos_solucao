import def.CaixeiroViajante;
import def.Grafo;
import def.GrafoMatricial;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GrafoMatricial g = new GrafoMatricial(4);
        g. adicionarVertice("A1");
        g. adicionarVertice("A2");
        g. adicionarVertice("A3");
        g. adicionarVertice("A4");
        /*g. adicionarVertice("A5");
        g. adicionarVertice("A6");
        g. adicionarVertice("A7");
        g. adicionarVertice("A8");
        g. adicionarVertice("A9");
        g. adicionarVertice("A10");
        g. adicionarVertice("A11");
        g. adicionarVertice("A12");
        g. adicionarVertice("A13");
        g. adicionarVertice("A14");
        g. adicionarVertice("A15");
        g. adicionarVertice("A16");
        g. adicionarVertice("A17");
        g. adicionarVertice("A18");
        g. adicionarVertice("A19");
        g. adicionarVertice("A20");
        g. adicionarVertice("A21");
        g. adicionarVertice("A22");
        g. adicionarVertice("A23");
        g. adicionarVertice("A24");
        g. adicionarVertice("A25");
        g. adicionarVertice("A26");
        g. adicionarVertice("A27");
        g. adicionarVertice("A28");
        g. adicionarVertice("A29");
        g. adicionarVertice("A30");
        g. adicionarVertice("A31");
        g. adicionarVertice("A32");
        g. adicionarVertice("A33");
        g. adicionarVertice("A34");
        g. adicionarVertice("A35");
        g. adicionarVertice("A36");
        g. adicionarVertice("A37");
        g. adicionarVertice("A38");
        g. adicionarVertice("A39");
        g. adicionarVertice("A40");
        g. adicionarVertice("A41");
        g. adicionarVertice("A42");
        g. adicionarVertice("A43");
        g. adicionarVertice("A44");
        g. adicionarVertice("A45");
        g. adicionarVertice("A46");
        g. adicionarVertice("A47");
        g. adicionarVertice("A48");
        g. adicionarVertice("A49");
        g. adicionarVertice("A50");*/





        g.adicionarAresta("A1", "A2", 10);
        g.adicionarAresta("A1", "A4", 2);
        g.adicionarAresta("A2", "A3", 1);
        g.adicionarAresta("A4", "A3", 9);
        /*g.adicionarAresta("A8", "A9", 1);
        g.adicionarAresta("A8", "A7", 1);
        g.adicionarAresta("A4", "A3", 1);
        g.adicionarAresta("A4", "A5", 1);
        g.adicionarAresta("A2", "A3", 1);
        g.adicionarAresta("A2", "A9", 1);
        g.adicionarAresta("A6", "A7", 1);
        g.adicionarAresta("A6", "A5", 1);
        g.adicionarAresta("A1", "A9", 1);*/




        g.imprimir();
        CaixeiroViajante cv = new CaixeiroViajante(g);
        List<String> caminho = cv.resolver();

        System.out.println(caminho);
}
}