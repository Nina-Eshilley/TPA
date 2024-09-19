import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int nasc, anoAtu, idade;
		System.out.println("Digite seu ano de nascimento");
		nasc= leia.nextInt();
		System.out.println("Digite o ano atual");
		anoAtu= leia.nextInt();
		idade=anoAtu-nasc;
		if(idade<10) {
			System.out.println("Você é uma criança");
		}else if(idade<18) {
			System.out.println("Você é um adolescente");
		}else if(idade<60) {
			System.out.println("Você é um adulto");
		}else {
			System.out.println("Você é um idoso");
		}leia.close();
	}

}
