package play;

import java.util.Scanner;

import Mapa.Map;
import Personagens.Bandido;
import Personagens.Principal;
import play.Char;

public class App {
	public static void main(String[] Args) throws InterruptedException {

		

		Scanner leitor = new Scanner(System.in);
		Map londrina=new Map();
		Principal player = new Principal();
		Bandido bandido1 = new Bandido();
		player.fichadopersonagem();
		Thread.sleep(2000);
		bandido1.fichadopersonagem();
		Thread.sleep(3000);
		
		player.luta(bandido1);
		Thread.sleep(1000);
		player.anda();
		
		londrina.criarmapa();
		player.gatilhomapa(londrina);

	}
}
