package Eventos;

import java.util.Scanner;

import Personagens.Bandido;
import Personagens.Principal;
import View.MensagensTexto;

public class BandidosNaEstrada {
	
	MensagensTexto msg = new MensagensTexto();
	static Scanner leitor = new Scanner(System.in);
	
	
	public static void evento(Principal p) throws InterruptedException {
		int escolha;
		boolean respostacerta=false;
		
		while(respostacerta==false) {
			System.out.println("Voce encontrou um bandido na estrada, que quer te roubar. Como deseja prosseguir? ");
			//System.out.println("");
			System.out.println("1- Se defender na porrada");
			System.out.println("2- Correr e se esconder");
			System.out.println("3- Persuadir o bandido a te deixar em paz");
			System.out.println("4- Fugir");
			
			escolha=leitor.nextInt();
			
			switch(escolha) {
			
			case 1:
				Bandido b=new Bandido();
				p.fichadopersonagem();
				Thread.sleep(2000);
				b.fichadopersonagem();
				Thread.sleep(3000);
				
				respostacerta=true;
				break;
			case 2:
				
				
				respostacerta=true;
				break;
			case 3:
				
				
				respostacerta=true;
				break;
			case 4:
				
				
				respostacerta=true;
				break;
			default:
				System.out.println("resposta invalida, digite novamente");
				break;
			
			}
			
		}
		
		
		
		
		
		
	}
	
	

}
