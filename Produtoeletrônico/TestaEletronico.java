package Produtoeletr�nico;
import java.util.Scanner;
public class TestaEletronico {

	
	
	 public static void main (String [] args) {
		 
		 Scanner ler = new Scanner(System.in);
		 Eletronico e1 = new Eletronico();
		 Eletronico e2 = new Eletronico();
		 
		 System.out.println("Eletrodom�stico dispon�vel: M�QUINA DE LAVAR");
		 e1.setEletrodomestico("M�quina de lavar");
		 
		 System.out.println("pre�o: 2000,00 ");
		 e1.setPreco(2000);
		 System.out.println("intruduza a loja que quer comprar");
		 e1.setLoja(ler.next());
		 
		 System.out.println("Eletrodom�stico dispon�vel: TV ");
		 e2.setEletrodomestico("TV");
		 System.out.println( );
		 
		 System.out.println("pre�o: ");
		 e2.setPreco(3500);
		 
		 System.out.println();
		 System.out.println("intruduza a loja que quer comprar");
		 e2.setLoja(ler.next());
		 
		 
		 System.out.println("___________________________________________________________________________");
		 
		 System.out.println("Voc� adquiriu: " + e1.getEletrodomestico() + " por " + e1.getPreco() + " da loja:  " + e1.getLoja() );
		 
		 

		 System.out.println("Voc� adquiriu: " + e2.getEletrodomestico() + " por " + e2.getPreco() + " da loja:  " + e2.getLoja() );
		 
		 
		 
	 }
}
