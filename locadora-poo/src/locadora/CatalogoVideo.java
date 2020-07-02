package locadora;

import java.util.ArrayList;

public class CatalogoVideo {

    private ArrayList < Video > catalogo = new ArrayList < Video > ();



    public ArrayList < Video > getCatalogo() { // retorna número da memória
        return catalogo;
    }

    public void imprimirCatalogo() {
        for (Video video: catalogo) {
            System.out.println(video.toString());
        }
    }

    public void adicionarVideo(String nome, double valor, boolean disponivel) { //quando não tenho de onde tirar variáveis, digito os parâmetros
        catalogo.add(new Video(nome, valor, disponivel));
    }
 
}
    
    
    
    
    
    
