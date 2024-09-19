import java.util.Scanner;
public class Combustível {
	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		double km, litro, gasto;
		System.out.println("Coloque a distância percorrida:");
		km=leia.nextDouble();
		System.out.println("Coloque a capacidade do tanque de gasolina:");
		litro=leia.nextDouble();
		gasto=km/litro;
		System.out.println("O seu gasto médio é " +gasto+ " km/l");
		if (gasto>=10) {
			System.out.println("Seu carro é econômico");
		}else {
			System.out.println("Seu carro não é econômico");
		}leia.close();
	}
}
