import java.util.*;
public class Baskara {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int a, b, c, delta;
		double x1, x2;
		System.out.println("Vamos calcular uma equação de 2° grau?");
		System.out.println("   ");
		System.out.println("Escreva o valor de A (não pode ser 0)");
		a= leia.nextInt();
		System.out.println("Escreva o valor de B");
		b= leia.nextInt();
		System.out.println("Escreva o valor de C");
		c= leia.nextInt();
		delta= (b*b) -4*(a*c);		
		System.out.println("O valor de Delta é: " +delta);
		System.out.println("  ");
		if (delta == 0) {
			x1= (-b + Math.sqrt(delta))/ (2*a);
			System.out.println("Portanto, só tem uma raiz possível: " +x1);
		} else if (delta < 0 ){
			System.out.println("O valor de Delta é negativo, sendo assim, não tem raizes reais");
		}else {
			x1= (-b + Math.sqrt(delta))/ (2*a);
			x2= (-b - Math.sqrt(delta))/ (2*a);
			System.out.println("Seu Delta tem duas raizes possíveis. A primeira é: "+x1+". "
					+ "E a segunda é: "+x2);
		}leia.close();
		
	}


}
