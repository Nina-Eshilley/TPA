import java.util.*;
public class signo {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int mes, dia;
		System.out.println("Escreva o seu mês de nascimento em números:");
		mes= leia.nextInt();
		System.out.println("Escreva seu dia de nascimento");
		dia=leia.nextInt();
		switch (mes) {
			case 3:
				if(dia<21) {
					System.out.println("O seu signo é de Peixes");
			}else {
				System.out.println("O seu signo é de Áries");
			}
				break;
			case 4:
				if(dia<21) {
					System.out.println("O seu signo é de Áries");
				}else {
				System.out.println("O seu signo é de Touro ");
			}
				break;
			case 5: 
				if(dia<22) {
					System.out.println("O seu signo é de Touro");
				}else {
					System.out.println("O seu signo é de Gêmeos ");
				}
				break;
			case 6:
				if(dia<21) {
					System.out.println("O seu signo é de Gêmeos");
				}else {
					System.out.println("O seu signo é de Câncer");
				}
				break;
			case 7:
				if(dia<23) {
					System.out.println("O seu signo é de Câncer");
				}else {
					System.out.println("O seu signo é de Leão");
				}
				break;
			case 8:
				if(dia<23) {
					System.out.println("O seu signo é de Leão");
				}else {
					System.out.println("O seu singno é de Virgem");
				}
				break;
			case 9:
				if(dia <23) {
					System.out.println("O seu signo é de Virgem");
				}else {
					System.out.println("O seu signo é de Libra");
				}
				break;
			case 10:
				if(dia <23) {
					System.out.println("O seu signo é de Libra");
				}else {
					System.out.println("O seu signo é de Escorpião");
				}
				break;
			case 11:
				if(dia <22) {
					System.out.println("O seu signo é de Escorpião");
				}else {
					System.out.println("O seu signo é de Sagitário");
				}
				break;
			case 12:
				if(dia<22) {
					System.out.println("O seu signo é de Sagitário");
				}else {
					System.out.println("O seu signo é de Capricórnio");	
				}
				break;
				case 1:
					if(dia<21) {
						System.out.println("O seu signo é de Capricórnio");
					}else {
						System.out.println("O seu signo é de Aquário");
					}
					break;
				case 2:
					if(dia<19) {
						System.out.println("O seu signo é de Aquário");
					}else {
						System.out.println("O seu signo é de Peixes ");
					}
					break;
					default:
						System.out.println("Mês ou dia inválidos");
		}leia.close();
				
	}
}
