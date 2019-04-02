package play;
import play.Item;
import java.util.Scanner;
import play.Item;

public class Char {
	Scanner leitor=new Scanner(System.in);
	public String nome=new String();
	public int forca,destreza,inteligencia,hp,valorataque;
	
	
	
	public Char(){
		this.nome=nome;
		this.forca=forca;
		this.destreza=destreza;
		this.inteligencia=inteligencia;
		
	}
	
	public void fichadopersonagem() {
		
		System.out.println("nome: "+this.nome);
		System.out.println("forca: "+this.forca);
		System.out.println("destreza: "+this.destreza);
		System.out.println("inteligencia: "+this.inteligencia);
		
	}
	
	public void criarpersonagem() {
		
		int ptsatributos = 10, repet = 0;
		System.out.println("crie seu personagem");

		System.out.println("nome: ");
		this.nome = leitor.nextLine();

		while (ptsatributos >= 2) {
			switch (repet) {
			case 0:
				System.out.println("voce tem " + ptsatributos + " pontos de atributos restantes");
				System.out.println("forca: ");
				this.forca = leitor.nextInt();
				ptsatributos = ptsatributos - this.forca;
				repet++;
				break;
			case 1:
				System.out.println("voce tem " + ptsatributos + " pontos de atributos restantes");
				System.out.println("destreza: ");
				this.destreza = leitor.nextInt();
				ptsatributos = ptsatributos - this.destreza;
				repet++;
				break;
			case 2:
				System.out.println("voce tem " + ptsatributos + " pontos de atributos restantes");
				System.out.println("inteligencia: ");
				this.inteligencia = leitor.nextInt();
				ptsatributos = ptsatributos - this.inteligencia;
				repet++;
				break;
			}
		}
		System.out.println("acabaram os pontos.");

		
		
		
		
	}
		
	}
	
	





