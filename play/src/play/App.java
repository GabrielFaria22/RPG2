package play;
import java.util.Scanner;
import play.Char;



public class App {
	public static void main(String[]Args) {
		
		Scanner leitor=new Scanner(System.in);
		int ptsatributos=10,repet=0;
		Char novop=new Char(null, 0, 0, 0);
		String nome=new String();
		int forca = 0,destreza=0,inteligencia=0;
		System.out.println("crie seu personagem");
		
		
		System.out.println("nome: ");
		nome=leitor.nextLine();
		
			while(ptsatributos>=2) {
				switch(repet) {
				case 0:
					System.out.println("voce tem "+ptsatributos+" pontos de atributos restantes");
					System.out.println("forca: ");
					forca=leitor.nextInt();
					ptsatributos=ptsatributos-forca;
					repet++;
					break;
				case 1:
					System.out.println("voce tem "+ptsatributos+" pontos de atributos restantes");
					System.out.println("destreza: ");
					destreza=leitor.nextInt();
					ptsatributos=ptsatributos-destreza;
					repet++;
					break;
				case 2:
					System.out.println("voce tem "+ptsatributos+" pontos de atributos restantes");
					System.out.println("inteligencia: ");
					inteligencia=leitor.nextInt();
					ptsatributos=ptsatributos-inteligencia;
					repet++;
					break;
				}
			}
			System.out.println("acabaram os pontos");
		
		Char protagonista=new Char(nome, forca, destreza, inteligencia);
		
		protagonista.fichadopersonagem();
	}
	

}
