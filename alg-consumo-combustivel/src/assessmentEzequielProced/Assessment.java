package assessmentEzequielProced;

import java.util.Locale;
import java.util.Scanner;

public class Assessment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
    	Locale.setDefault(Locale.US);
    	
        /*Preciso ter listas ok
         * lista de nomes de veiculos ok
         * lista de valores ok
         * preencher listas com os nomes e os valores ok
         * lista com as medias finais ok
         * imprimir a lista dos nomes e das medias (tem o mesmo tamanho), posso fazer um for só, e um print formatado ok
         *  dizer qual é a menor média
         *  percorrer a lista de medias e verificar qual é a menor
         *  precisou percorrer uma lista:
         *  VETOR = 1 FOR
         *  MATRIZ= 2 FOR
         */
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite quantos carros você quer consultar:");
        int qtd = scn.nextInt();


        String[] listaNomes = new String[qtd];

        double[][] listaCustos = new double[qtd][4];




        for (int coluna = 0; coluna < listaNomes.length; coluna++) {

            System.out.println("Digite o nome do carro " + (coluna + 1) + ":");
            listaNomes[coluna] = scn.next();

        }
        
        //System.out.println(listaNomes[0]);
        //for(int i=0; i<listaNomes.length;i++) {
        //System.out.println(listaNomes[i]);
        //}


        for (int linha = 0; linha < listaCustos.length; linha++) {
            System.out.println("Linha " + (linha + 1) + ":");

            for (int coluna = 0; coluna < listaCustos[linha].length; coluna++) {


                switch (coluna) {
				case 0:
					System.out.println("Custo da compra do " + listaNomes[linha]);
					break;
				case 1:
					System.out.println("Custo de impostos: " + listaNomes[linha]);
					break;
				case 2:
					System.out.println("Custo de combustível: " + listaNomes[linha]);
					break;
				case 3:
					System.out.println("Custo com seguro: " + listaNomes[linha]);
					break;

                }
                double valor = scn.nextDouble();
                
               

                listaCustos[linha][coluna] = valor;
            }

        }


        double [] listaMediaFinal = new double [qtd];
        
        
        
        for (int linha = 0; linha < listaCustos.length; linha++) {
        double mediaFinal = 0.0;
        
            for (int coluna = 0; coluna < listaCustos[linha].length; coluna++) {
            	
            	if(coluna == 2) {
            	mediaFinal += 10000 / (listaCustos[linha][coluna] * 4.98);
            	}
            	
            	else {
            	mediaFinal += listaCustos[linha][coluna];
            	}
            
            }
            	listaMediaFinal [linha] = mediaFinal;   
         
        }
        
        for (int i = 0; i < listaMediaFinal.length; i++) {
			System.out.printf("O carro %s tem a média final de R$ %.2f. %n", listaNomes[i],listaMediaFinal[i] );
			
		}
         
        double menorMedia = listaMediaFinal[0];
        int valorIndice = 0;
        for (int i = 0; i < listaMediaFinal.length; i++) {
			if(listaMediaFinal[i] < menorMedia) {
				menorMedia = listaMediaFinal[i];
				valorIndice = i;//funciona pois as listas tem o mesmo tamanho.
			}
		}
       System.out.printf("A menor média é R$ %.2f, do carro %s.", menorMedia, listaNomes[valorIndice]);
    }
  }


    