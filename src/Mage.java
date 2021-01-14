
public class Mage extends Joueur {

	public Mage(String nom, double pvMax, double manaMax, boolean isPlayable) {
		super(nom, pvMax, manaMax, isPlayable);
		// TODO Auto-generated constructor stub
	}
	
	public void afficher() {
		System.out.println("je suis un mage");
		System.out.println("Vie " + this.getPvMax());
		System.out.println("Mana " + this.getManaMax());
	}
	

}
