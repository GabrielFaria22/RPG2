package Personagens;

import play.Item;
import Mapa.Map;
import java.util.Scanner;
import play.Item;

public class Char {
	Scanner leitor = new Scanner(System.in);
	public String nome = new String();
	public double forca, destreza, inteligencia, hp = 10, valorataque, valordefesa, iniciativa;
	public boolean vivo;
	public int posicaox=0,posicaoy=0;
	public int classe;
	/*Classes:
	 * 1- Guerreiro
	 * 2- Ladrao
	 * 3- Mago
	 * */
	public double honra,fama;
	
	
/*
	public Char() {
		this.nome = nome;
		this.forca = forca;
		this.destreza = destreza;
		this.inteligencia = inteligencia;
		this.hp = hp;
		this.valorataque = valorataque;
		this.valordefesa = valordefesa;
		this.iniciativa = iniciativa;
		this.classe=classe;
		

	}*/

	public void fichadopersonagem() {

		System.out.println("nome: " + this.nome);
		System.out.println("forca: " + this.forca);
		System.out.println("destreza: " + this.destreza);
		System.out.println("inteligencia: " + this.inteligencia);
		System.out.println("HP: " + this.hp);
		System.out.println("Ataque: " + this.valorataque);// vai printar 0 pois so e calculado ao lutar
		System.out.println("Defesa: " + this.valordefesa);// vai printar 0 pois so e calculado ao lutar
		System.out.println("Iniciativa: " + this.iniciativa);// vai printar 0 pois so e calculado ao lutar

	}

	public void criarpersonagem() {

		int ptsatributos = 10, repet = 0;
		boolean respostacerta=false;
		System.out.println("crie seu personagem");
		
		System.out.println("digite o nome: ");
		this.nome = leitor.nextLine();

		
		
		while(respostacerta==false) {
			System.out.println("Selecione uma classe: ");
			System.out.println("1- Guerreiro");
			System.out.println("2- Ladrao");
			System.out.println("3- Mago");
			System.out.println("4- Personalizar");
			
			classe=leitor.nextInt();
			switch(classe) {//posso simplificar, mas nao to a fim
			case 1:
				System.out.println("voce escolheu 1- Guerreiro");
				this.forca = 6;
				ptsatributos = (int) (ptsatributos - this.forca);
				System.out.println("colocados 6 pontos em forca");
				this.destreza = 3;
				ptsatributos = (int) (ptsatributos - this.destreza);
				System.out.println("colocados 3 pontos em destreza");
				this.inteligencia = 1;
				ptsatributos = (int) (ptsatributos - this.inteligencia);
				System.out.println("colocado apenas 1 ponto em inteligencia. guerreiros nao precisam pensar");
				respostacerta=true;
				break;
			case 2:
				System.out.println("voce escolheu 2- Ladrao");
				this.forca = 2;
				ptsatributos = (int) (ptsatributos - this.forca);
				System.out.println("colocados 2 pontos em forca");
				this.destreza = 5;
				ptsatributos = (int) (ptsatributos - this.destreza);
				System.out.println("colocados 5 pontos em destreza");
				this.inteligencia = 3;
				ptsatributos = (int) (ptsatributos - this.inteligencia);
				System.out.println("colocados 3 pontos em inteligencia");
				respostacerta=true;
				break;
			case 3:
				System.out.println("voce escolheu 3- Mago");
				this.forca = 2;
				ptsatributos = (int) (ptsatributos - this.forca);
				System.out.println("colocados 2 pontos em forca");
				this.destreza = 3;
				ptsatributos = (int) (ptsatributos - this.destreza);
				System.out.println("colocados 3 pontos em destreza");
				this.inteligencia = 5;
				ptsatributos = (int) (ptsatributos - this.inteligencia);
				System.out.println("colocados 5 pontos em inteligencia");
				respostacerta=true;
				break;
			case 4:
				while (ptsatributos > 0) {
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
					default:
						System.out.println("Resposta errada, digite novamente ");
						System.out.println(" ");
						break;
					}
					respostacerta=true;
				}
				System.out.println("acabaram os pontos.");
			
			
			}
		}
			
		}
		
		
		



	public void ataca(Char i, double valorataque) {
		double valordano = this.valorataque - i.valordefesa;

		i.hp = i.hp - (valordano);
		System.out.println(this.nome + "HP: " + this.hp + " atacou causando " + valordano + " de dano!");

	}

	public void anda() {
		int direcao;
		boolean tentenovamente = true;

		while (tentenovamente == true) {
			System.out.println("Qual direcao voce deseja viajar?");
			System.out.println("1 - Norte");
			System.out.println("2 - Sul");
			System.out.println("3 - Leste");
			System.out.println("4 - Oeste");
			direcao = leitor.nextInt();
			switch (direcao) {
			case 1:
				System.out.println("1 - Norte");
				posicaoy=posicaoy+1;
				if(posicaoy>10||posicaoy<0) {
					System.out.println("impossivel andar mais nesta direcao");
					tentenovamente=true;
				}else {
					tentenovamente = false;
				}
				break;
			case 2:
				System.out.println("2 - Sul");
				if(posicaoy>10||posicaoy<0) {
					System.out.println("impossivel andar mais nesta direcao");
					tentenovamente=true;
				}else {
					tentenovamente = false;
				}
				break;
			case 3:
				System.out.println("3 - Leste");
				if(posicaox>10||posicaox<0) {
					System.out.println("impossivel andar mais nesta direcao");
					tentenovamente=true;
				}else {
					tentenovamente = false;
				}
				break;
			case 4:
				System.out.println("4 - Oeste");
				if(posicaox>10||posicaox<0) {
					System.out.println("impossivel andar mais nesta direcao");
					tentenovamente=true;
				}else {
					tentenovamente = false;
				}
				break;
			default:
				System.out.println("comando nao reconhecido, tente novamnete");
			}

		}

	}

	public void gatilhomapa(Map m) {
		
		
		m=m.mundo[posicaox][posicaoy];
		
		
		
	}
	
}
