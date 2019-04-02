package play;

import play.Item;
import java.util.Scanner;
import play.Item;

public class Char {
	Scanner leitor = new Scanner(System.in);
	public String nome = new String();
	public double forca, destreza, inteligencia, hp = 10, valorataque, valordefesa,iniciativa;
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

	public void luta(Char i) throws InterruptedException {
		
		this.iniciativa=destreza+inteligencia/2;
		i.iniciativa=i.destreza+i.inteligencia/2;
		valorataque = (forca + destreza) / 2;
		valordefesa = (forca + destreza) / 4;
		i.valorataque = (forca + destreza) / 2;
		i.valordefesa = (forca + destreza) / 4;
		
		
		if(this.iniciativa>=i.iniciativa) {
			while(this.hp>0&&i.hp>0) {
				System.out.println(this.nome + " vai atacar!");
				Thread.sleep(2000);
				ataca(i, valorataque);
				
				Thread.sleep(2000);
				System.out.println(i.nome + " vai atacar!");
				Thread.sleep(2000);
				i.ataca(this, i.valorataque);
				
				Thread.sleep(2000);
			}
			
		}else {
			while(this.hp>0&&i.hp>0) {
				System.out.println(i.nome + " vai atacar!");
				i.ataca(this, i.valorataque);
				
				System.out.println(this.nome + " vai atacar!");
				ataca(i, valorataque);
				
			}
			
		}
		
		if(this.hp<=0) {
			System.out.println(this.nome+" morreu!");
		}else if(i.hp<=0) {
			System.out.println(i.nome+" morreu!");
		}

		

		
		
	}

	public void ataca(Char i, double valorataque) {

		i.hp = i.hp - (this.valorataque - i.valordefesa);
		System.out.println(this.nome + " atacou causando " + (this.valorataque - i.valordefesa) + " de dano!");

	}

}
