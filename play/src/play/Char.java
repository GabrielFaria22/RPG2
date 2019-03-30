package play;

import java.util.Scanner;
import play.Item;

public class Char {
	Scanner leitor=new Scanner(System.in);
	public String nome=new String();
	public int forca,destreza,inteligencia,hp,valorataque;
	public Item[] mochila=new Item[10];
	
	if(this.hp<=0) {
		System.out.println(this.nome+ "morreu!");
	}
	
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
	
	

}



