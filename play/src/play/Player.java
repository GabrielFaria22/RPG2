package play;
import play.Inimigo;

public class Player extends Char{
	
	
	public void ataca(Char qualinimigo) {
		qualinimigo.hp=qualinimigo.hp-this.valorataque;
	}

}
