import def.CaminhoHamiltoniano;
import def.GrafoMatricial;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        GrafoMatricial g = GrafoMatricial.lerDeArquivo("D:\\AED2_grafos_project_oficial\\Grafo1\\untitled\\src\\grafo.txt");
        
        CaminhoHamiltoniano ch = new CaminhoHamiltoniano(g);
        List<String> caminho = ch.resolver();

        System.out.println("");
        System.out.println("Sendo A1 a cidade inicial, as encanações devem seguir o seguinte caminho para abastecer todos os sítios de maneira otimizada:");
        System.out.println("");

        for (int i = 0; i < caminho.size() - 1; i++) {
            String sitioAtual = caminho.get(i);
            String proximoSitio = caminho.get(i + 1);
            double distancia = g.getDistancia(sitioAtual, proximoSitio);
            System.out.println(sitioAtual + " -> " + proximoSitio + " : " + distancia + " km");
        }
    }
}
