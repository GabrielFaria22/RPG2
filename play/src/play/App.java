package play;

import java.util.Scanner;
import play.Char;

public class App {
	public static void main(String[] Args) {

		// carregando mapa
		Mapa map = new Mapa();

		Scanner leitor = new Scanner(System.in);
		
		Char principal=new Char();
		principal.criarpersonagem();
		principal.fichadopersonagem();
	}
	
}
		

	
