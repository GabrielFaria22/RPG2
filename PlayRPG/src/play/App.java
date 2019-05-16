package play;

import java.util.Scanner;

import Eventos.BandidosNaEstrada;
import Mapa.Map;
import Personagens.Bandido;
import Personagens.Char;
import Personagens.Principal;

public class App {
	@SuppressWarnings("unused")
	public static void main(String[] Args) throws InterruptedException {

		Scanner leitor = new Scanner(System.in);
		Map londrina = new Map();
		Principal player = new Principal();

		player.criarpersonagem();
		
		BandidosNaEstrada.evento(player);
		

		Bandido bandido1 = new Bandido();
		player.fichadopersonagem();
		Thread.sleep(2000);
		bandido1.fichadopersonagem();
		Thread.sleep(3000);

		
		
		
		Thread.sleep(1000);

		/*
		 * mapa-fase de testes
		 * player.anda(); londrina.criarmapa(); player.gatilhomapa(londrina);
		 */

		leitor.close();

	}
}
