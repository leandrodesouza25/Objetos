package Produtoeletrônico;
import java.util.Scanner;
public class TestaEletronico {

	
	
	 public static void main (String [] args) {
		 
		 Scanner ler = new Scanner(System.in);
		 Eletronico e1 = new Eletronico();
		 Eletronico e2 = new Eletronico();
		 
		 System.out.println("Eletrodoméstico disponível: MÁQUINA DE LAVAR");
		 e1.setEletrodomestico("Máquina de lavar");
		 
		 System.out.println("preço: 2000,00 ");
		 e1.setPreco(2000);
		 System.out.println("intruduza a loja que quer comprar");
		 e1.setLoja(ler.next());
		 
		 System.out.println("Eletrodoméstico disponível: TV ");
		 e2.setEletrodomestico("TV");
		 System.out.println( );
		 
		 System.out.println("preço: ");
		 e2.setPreco(3500);
		 
		 System.out.println();
		 System.out.println("intruduza a loja que quer comprar");
		 e2.setLoja(ler.next());
		 
		 
		 System.out.println("___________________________________________________________________________");
		 
		 System.out.println("Você adquiriu: " + e1.getEletrodomestico() + " por " + e1.getPreco() + " da loja:  " + e1.getLoja() );
		 
		 

		 System.out.println("Você adquiriu: " + e2.getEletrodomestico() + " por " + e2.getPreco() + " da loja:  " + e2.getLoja() );
		 
		 
		 
	 }
}
