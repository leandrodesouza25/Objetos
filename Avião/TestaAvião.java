package Avi�o;
import java.util.Scanner;
public class TestaAvi�o {

	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		Aviaozin usuario = new Aviaozin();
		
		System.out.println("O nome do piloto �:");
		usuario.setNomedopiloto(ler.next());
		
		System.out.println("O nome da companhia  que deseja viajar: ");
		usuario.setNomedacompanhia(ler.next());
		
		System.out.println("O destino na qual quero viajar �:");
		usuario.setDestino(ler.next());
		
		
		System.out.println("__________________________");
		
		
		System.out.println("Informa��es de v�o: ");
		
				System.out.println("Nome do Piloto: " + usuario.getNomedopiloto());
				System.out.println("Nome da companhia: " + usuario.getNomedacompanhia());
		        System.out.println("Lugar de Destino: " + usuario.getDestino());
		ler.close();
	}
}
