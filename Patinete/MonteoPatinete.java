package Patinete;
import java.util.Scanner;
public class MonteoPatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		Patinete p1 = new Patinete();
		
		System.out.println("Insira em ordem: Seu nome, quantas rodas ele possui e quais pe�as lhe faltam");
		
		p1.setDonodoPatinete(ler.next());
		p1.setQuantidaderodas(ler.nextInt());
		p1.setPecaquefalta(ler.next());
		
		System.out.println("Informa��es pendentes: " + p1.getDonodoPatinete() + " , voc� t�m " + p1.getQuantidaderodas() + "\n Rodas: " + "E lhe falta" + p1.getPecaquefalta() );
		
		
		
	}

}
