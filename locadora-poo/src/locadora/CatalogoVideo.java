package locadora;

import java.util.ArrayList;

public class CatalogoVideo {

    private ArrayList < Video > catalogo = new ArrayList < Video > ();



    public ArrayList < Video > getCatalogo() { // retorna n�mero da mem�ria
        return catalogo;
    }

    public void imprimirCatalogo() {
        for (Video video: catalogo) {
            System.out.println(video.toString());
        }
    }

    public void adicionarVideo(String nome, double valor, boolean disponivel) { //quando n�o tenho de onde tirar vari�veis, digito os par�metros
        catalogo.add(new Video(nome, valor, disponivel));
    }
 
}
    
    
    
    
    
    
