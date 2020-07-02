package locadora;

public class Debug {
		public static void main(String[] args) {
			
			 
		 Cliente cliente = new Cliente("Ana");
		 cliente.adicionarVideo("titanic",5, true);
		 cliente.adicionarVideo("mascara", 5, false);
	
			 
		 System.out.println(cliente.getNome());
		 cliente.setNome("Rafaela");
		 System.out.println(cliente.getNome());
		 
		 	 
		 
		}
}
