import java.util.*;
public class Triângulo {
	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		double a, b, c;
		System.out.println("Para termos um triângulo, você precisa do valor de seus 3 lados");
		System.out.println("  ");
		System.out.println("Informe aqui o valor A");
		a=leia.nextDouble();
		System.out.println("Informa o valor de B");
		b=leia.nextDouble();
		System.out.println("Informe o valor de C");
		c=leia.nextDouble();
	    System.out.println("Esse triângulo é:");
		if( a!=b && b!=c && a!=c){
			System.out.println("Escaleno");
		}else if (a==b && b!=c || a==c && c!=b || b==c && c!=a) {
			System.out.println("Isósceles");
		}else {
			System.out.println("Eqüilatero");
		}
		if (a + b > c && b + c > a && a + c > b){
			System.out.println("  ");
			System.out.println("Mas de acordo com a 'condição de existência',"
			+ " seus valores não formam um triângulo ");
		}leia.close();
	}

}
