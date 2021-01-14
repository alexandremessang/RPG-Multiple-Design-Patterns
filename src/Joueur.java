import java.util.ArrayList;

public abstract class Joueur {
	private String nom;
	private double pvMax;
	private double pv;
	private double manaMax;
	private double mana;
	private Playable etatJoueur;
	
	public Joueur(String nom, double pvMax, double manaMax, boolean isPlayable) {
		this.nom = nom;
		this.pvMax = pvMax;
		this.pv = this.pvMax;
		this.manaMax = manaMax;
		this.mana = this.manaMax;
		ArrayList<Quete> quetes = new ArrayList<Quete>();
		
		if(isPlayable) {
			this.etatJoueur = new PersonnageJouable(quetes);
		} else {
			this.etatJoueur = new NPC(quetes);
		}
	}
	
	public abstract void afficher();
	
	public double getPv() {
		return pv;
	}

	public void setPv(double pv) {
		this.pv = pv;
	}

	public double getMana() {
		return mana;
	}

	public void setMana(double mana) {
		this.mana = mana;
	}

	public Playable getEtatJoueur() {
		return etatJoueur;
	}

	public void setEtatJoueur(Playable etatJoueur) {
		this.etatJoueur = etatJoueur;
	}

	public void modifierPV(double pv) {
		this.pv = this.pv - pv;
	}
	
	public void modifierMana(double mana) {
		this.mana = this.mana - mana;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPvMax() {
		return pvMax;
	}

	public void setPvMax(double pvMax) {
		this.pvMax = pvMax;
	}

	public double getManaMax() {
		return manaMax;
	}

	public void setManaMax(double manaMax) {
		this.manaMax = manaMax;
	}
}
