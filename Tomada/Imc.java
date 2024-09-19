import java.util.*;
public class Imc {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		double peso, h, imc;
		System.out.println("Digite o seu peso");
		peso= leia.nextDouble();
		System.out.println("Digite sua altura");
		h= leia.nextDouble();
		imc= peso/(h*h);
		if(imc<=18.5) {
			System.out.println("Você está com excesso de magreza");
		}else if(imc<=25) {
			System.out.println("Você está com um peso normal");
		}else if(imc<=30) {
			System.out.println("Você está com excesso de peso");
		}else if(imc<=35) {
			System.out.println("Você está com Obesidade Grau I");
		}else if(imc<=40) {
			System.out.println("Você está com Obesidade Grau II");
		}else {
			System.out.println("Você está com Obesidade Grau III");
		}leia.close();
	}

}
