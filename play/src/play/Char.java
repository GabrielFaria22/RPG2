package play;

import java.util.Scanner;

public class Char {
	Scanner leitor = new Scanner (System.in);
	public int idade,altura;
	public String nome=new String();
	public int intel,carisma,forca,destreza;
	public int certeza=0;
	public int ptsatr=10;

	public void formulario() {
		
		System.out.println("nome:");
		nome=leitor.nextLine();
		
		System.out.println("idade:");
		idade=leitor.nextInt();
		System.out.println("altura em cm:");
		altura=leitor.nextInt();
		do {
			System.out.println("voce tem "+ptsatr +"pontos restantes.");
			System.out.println("digite quantos pontos voce quer em cada atributo:");
			
			System.out.println("FORCA: atualmente com"+forca + "pontos");
			forca=leitor.nextInt();
			
			System.out.println("DESTREZA: atualmente com"+destreza + "pontos");
			destreza=leitor.nextInt();
			
			System.out.println("INTELIGENCIA: atualmente com"+forca + "pontos");
			intel=leitor.nextInt();
			
			System.out.println("CARISMA: atualmente com"+carisma + "pontos");
			carisma=leitor.nextInt();
			
			System.out.println("FORCA: "+forca);
			System.out.println("DESTREZA: "+destreza);
			System.out.println("INTELIGENCIA: "+intel);
			System.out.println("CARISMA: "+carisma);
		}while(certeza!=1);
	}
	
}



