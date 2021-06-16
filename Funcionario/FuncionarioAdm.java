package Funcionario;
import java.util.Scanner;
public class FuncionarioAdm extends Funcionario{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		
		System.out.println("Insira seu nome: " );
		f1.setNome(ler.next());
		
		System.out.println("Insira idade: ");
		f1.setIdade(ler.next());
		
		System.out.println("Sua profissão é: ");
		f1.setProfissão(ler.next());
		
		
		System.out.println("Infos pessoais: " + f1.getNome() + 
				"\n" + f1.getIdade() +
				"\n" + f1.getProfissão()); 
	}

}
