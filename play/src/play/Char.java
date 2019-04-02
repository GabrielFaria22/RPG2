package play;

import play.Item;
import java.util.Scanner;
import play.Item;

public class Char {
	Scanner leitor = new Scanner(System.in);
	public String nome = new String();
	public double forca, destreza, inteligencia, hp = 10, valorataque, valordefesa;
	public boolean vivo;

	public Char() {
		this.nome = nome;
		this.forca = forca;
		this.destreza = destreza;
		this.inteligencia = inteligencia;
		this.hp = hp;

	}

	public void fichadopersonagem() {

		System.out.println("nome: " + this.nome);
		System.out.println("forca: " + this.forca);
		System.out.println("destreza: " + this.destreza);
		System.out.println("inteligencia: " + this.inteligencia);
		System.out.println("HP: " + this.hp);

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
				this.forca = leitor.nextDouble();
				ptsatributos = (int) (ptsatributos - this.forca);
				repet++;
				break;
			case 1:
				System.out.println("voce tem " + ptsatributos + " pontos de atributos restantes");
				System.out.println("destreza: ");
				this.destreza = leitor.nextDouble();
				ptsatributos = (int) (ptsatributos - this.destreza);
				repet++;
				break;
			case 2:
				System.out.println("voce tem " + ptsatributos + " pontos de atributos restantes");
				System.out.println("inteligencia: ");
				this.inteligencia = leitor.nextDouble();
				ptsatributos = (int) (ptsatributos - this.inteligencia);
				repet++;
				break;
			}
		}
		System.out.println("acabaram os pontos.");

	}

	public void luta(Char i) {

		System.out.println(this.nome + " vai atacar!");
		valorataque = (forca + destreza) / 2;
		valordefesa = (forca + destreza) / 4;
		i.valorataque = (forca + destreza) / 2;
		i.valordefesa = (forca + destreza) / 4;

		ataca(i, valorataque);
		System.out.println(this.nome + " atacou causando " + valorataque + " de dano!asd");
		

	}

	public void ataca(Char i, double valorataque) {

		i.hp = i.hp - (this.valorataque - i.valordefesa);

	}

}
