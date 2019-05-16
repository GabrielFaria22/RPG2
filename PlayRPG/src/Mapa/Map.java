package Mapa;

public class Map {
	
	double x,y;
	String nomeregiao=new String();
	String nomelocal=new String();
	public Terreno mundo[][]=new Terreno[10][10];
	public double movimentodificil;
	public boolean chuva;
	public boolean lama;
	
	public Map(){
		this.x=x;
		this.y=y;
		this.nomeregiao=nomeregiao;
		this.nomelocal=nomelocal;
		this.mundo=mundo;
	}
	
	public void criarmapa() {
		int repet=0;
		int repet2=0;
		double criador;
		//fazer for para criar um tipo de terrenno em cada vetor+
		for(repet = 0;repet<=9;repet++) {
			for(repet2 = 0;repet2<=9;repet2++) {
				criador=Math.random();
				if(criador<0.5) {
					this.mundo[repet][repet2]=new Floresta();
				}else {
					this.mundo[repet][repet2]=new Planicie();
				}
			}
		}
		
	}
	
	
}
