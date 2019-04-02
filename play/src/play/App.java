package play;

import java.util.Scanner;

import Personagens.Bandido;
import Personagens.Principal;
import play.Char;

public class App {
	public static void main(String[] Args) throws InterruptedException {

		

		Scanner leitor = new Scanner(System.in);

		Principal player = new Principal();
		Bandido bandido1 = new Bandido();
		player.fichadopersonagem();
		Thread.sleep(2000);
		bandido1.fichadopersonagem();
		Thread.sleep(3000);
		
		player.luta(bandido1);
		Thread.sleep(1000);
		bandido1.fichadopersonagem();

	}
}
