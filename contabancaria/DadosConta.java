package contabancaria;
import java.util.Scanner;
public class DadosConta {
	
       public static void main(String [] args) {
    	   
    	   
    	   
	Scanner ler = new Scanner(System.in);
	Conta c1 = new Conta();
	
	System.out.println("Digite seus dados: Nome , seu sal�rio e quantos reais quer transferir");
	c1.setNome(ler.next());
	c1.setSalario(ler.nextDouble());
	c1.setTransferir(ler.nextDouble());
	 
	
	System.out.println("Confirme os dados a seguir: " + c1.getNome() + " , sal�rio de : " + c1.getSalario() + " , ir� transferir :  " + c1.getTransferir()  + " , Confirma?");
	
}
}