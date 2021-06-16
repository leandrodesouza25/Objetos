package Paciente;
import java.util.Scanner;


public class TestaPaciente {
	
	
	 public static void main(String [] args) {
	Scanner ler = new Scanner(System.in);
	Paciente p = new Paciente();
	
	
	
	System.out.println("Insira o nome do paciente, sua comorbidade e quantos dias ele permanecerá no hospital");
	p.setNomedopaciente(ler.next());
	p.setDoencaoucomorbidade(ler.next());
	p.setDiaspararecuperacao(ler.nextInt());
	
	System.out.println("As informações, respectivamente conferem: \n" +
	                                     p.getNomedopaciente()  + "\n" +
			                              p.getDoencaoucomorbidade() + "\n" + 
	                                     p.getDiaspararecuperacao() + " dias");

}
}
