package play;

import java.util.Scanner;

import Mapa.Map;
import Personagens.Bandido;
import Personagens.Principal;
import play.Char;

public class App {
	@SuppressWarnings("unused")
	public static void main(String[] Args) throws InterruptedException {

		

		Scanner leitor = new Scanner(System.in);
		Map londrina=new Map();
		Char um = new Char();
		
		
		um.criarpersonagem();
		
		
		
		Bandido bandido1 = new Bandido();
		um.fichadopersonagem();
		Thread.sleep(2000);
		bandido1.fichadopersonagem();
		Thread.sleep(3000);
		/*
		player.luta(bandido1);
		Thread.sleep(1000);
		player.anda();
		*/
		/*
		londrina.criarmapa();
		player.gatilhomapa(londrina);
		
		*/
		
		leitor.close();

	}
}
