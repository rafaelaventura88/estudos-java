package assessemtEzequielPOO;

import java.util.Locale;

public class ClasseDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
			
			
		ListaCarros lista = new ListaCarros();
		
		
		lista.adicionarCarro("fox", 30000, 2000, 11.8, 2000);
		lista.adicionarCarro("onix", 40000, 1000, 13.8, 1000);
		
	
		lista.preencherListaMedias();
		System.out.println(lista.menorMedia());
		System.out.println("a");
		
		
		
	}

}
