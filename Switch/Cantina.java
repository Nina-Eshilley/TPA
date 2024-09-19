import java.util.*;
public class Cantina {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int cod;
		System.out.println("Escreva o código do produto");
		cod= leia.nextInt();
		switch (cod) {
			case 1: 
				System.out.println("Seu produto é um Cachorro-Quente, que custa $ 8,00");
				break;
			case 2:
				System.out.println("Seu produto é um Cheeseburguer, que custa R$ 12,00");
				break;
			case 3:
				System.out.println("Seu Seu produto é um X-Salada, que custa R$ 15,00");
				break;
			case 4:
				System.out.println("Seu produto é um Misto Quente, que custa R$ 1q,00");
				break;
			case 5:
				System.out.println("Seu produto é um Pão na Chapa, que custa R$ 6,00");
				break;
			default:
				System.out.println("Esse produto não existe");
		
		}
	}
}
