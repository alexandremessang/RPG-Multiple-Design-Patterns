
public class Guerrier extends Joueur {

	public Guerrier(String nom, double pvMax, double manaMax, boolean isPlayable) {
		super(nom, pvMax, manaMax, isPlayable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un guerrier");
		System.out.println("Vie " +		this.getPvMax());
		System.out.println("Mana " +	this.getManaMax());
	}

}
