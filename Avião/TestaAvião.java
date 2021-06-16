package Avião;
import java.util.Scanner;
public class TestaAvião {

	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		Aviaozin usuario = new Aviaozin();
		
		System.out.println("O nome do piloto é:");
		usuario.setNomedopiloto(ler.next());
		
		System.out.println("O nome da companhia  que deseja viajar: ");
		usuario.setNomedacompanhia(ler.next());
		
		System.out.println("O destino na qual quero viajar é:");
		usuario.setDestino(ler.next());
		
		
		System.out.println("__________________________");
		
		
		System.out.println("Informações de vôo: ");
		
				System.out.println("Nome do Piloto: " + usuario.getNomedopiloto());
				System.out.println("Nome da companhia: " + usuario.getNomedacompanhia());
		        System.out.println("Lugar de Destino: " + usuario.getDestino());
		ler.close();
	}
}
