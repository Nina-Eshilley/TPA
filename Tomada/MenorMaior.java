import java.util.*;
public class MenorMaior {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int valor1, valor2, valor3;
		System.out.println("Escreva o 1° valor");
		valor1= ler.nextInt();
		System.out.println("Escreva o 2° valor");
		valor2= ler.nextInt();
		System.out.println("Escreva o 3° valor");
		valor3= ler.nextInt();
		System.out.println("Os valores em ordem crescente (do menor para o maior), ficam assim:");
		System.out.println("  ");
		if(valor1 < valor2 && valor2 <valor3){
			System.out.println(+valor1+ ", "+valor2+" e"+valor3);	
		}else if(valor1 < valor3 && valor3 < valor2) {
			System.out.println(+valor1+", "+valor3+ " e "+valor2);
		}else if(valor2 < valor3 && valor3 < valor1) {
			System.out.println(+valor2+", "+valor3+" e "+valor1);
		}else if(valor2 <  valor1 && valor1 < valor3) {
			System.out.println(+valor2+", "+valor1+" e "+valor3);
		}else if(valor3 < valor2 && valor2 < valor1) {
			System.out.println(+valor3+", "+valor2+" e "+valor1);
		}else {
			System.out.println(+valor3+", "+valor1+" e "+valor2);
		}ler.close();
	}

}
