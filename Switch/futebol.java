import java.util.*;
public class futebol {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade do aluno");
		idade=leia.nextInt();
		switch (idade) {
			case 6:
				System.out.println("Este aluno será do grupo Dente de Leite");
				break;
			case 7:
				System.out.println("Este aluno será do grupo júnior");
				break;
			case 8:
				System.out.println("Este aluno será do grupo Júnior Max");
				break;
			case 9: 
				System.out.println("Este aluno será do grupo Júnior Master");
				break;
			case 10:
				System.out.println("Este aluno será do grupo Master");
				break;
				default:
					System.out.println("A escola não admite alunos essa idade ");
					
		}leia.close();			
	}
}
