package play;

import java.util.Scanner;

public class Char {
	Scanner leitor=new Scanner(System.in);
	public String nome=new String();
	public int forca,destreza,inteligencia;
	
	public Char(String nome,int forca,int destreza,int inteligencia){
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

	
	
}



