package Cliente;
import java.util.Scanner;
public class TestaCliente {
	
	
	
	public static void main(String [] args) {
	Scanner ler = new Scanner(System.in);
	Cliente c1 = new Cliente();
	
        
	System.out.println("Escreva seu nome: ");
	c1.setNomeCliente(ler.next());
	
	System.out.println("Sua idade: ");
	c1.setIdade(ler.nextDouble());
	
	System.out.println("Qual banco / agência: ");
    c1.setBanco(ler.next());
    
    System.out.println("____________________________________________________________");
    
    System.out.println("Suas infos pessoais:" +
                          "\nSeu nome: " + c1.getNomeCliente() +
                          "\nSua idade: " + c1.getIdade() +
                          "\nSua agência: " + c1.getBanco());
    
    
    ler.close();
	
	
	}

}
