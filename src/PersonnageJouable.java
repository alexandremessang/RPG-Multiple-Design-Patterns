import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class PersonnageJouable implements Playable, PropertyChangeListener {
	private ArrayList<Quete> quetes;
	private Quete activeQuest;
	
	PersonnageJouable(ArrayList<Quete> quetes) {
		this.quetes = quetes;
		if (this.activeQuest == null && !this.quetes.isEmpty()) {
			this.activeQuest = this.quetes.get(0);
		}
	}

	public ArrayList<Quete> getQuetes() {
		return quetes;
	}

	@Override
	public void setQuete(Quete quete) {
		this.quetes.add(quete);
		quete.addPlayer(this);
		this.activeQuest = quete;
	}
	
	
	public Quete getActiveQuest() {
		return this.activeQuest;
	}
	
	@Override
	public Quete getQuete(Quete quete) {	
		for (Quete quete2 : quetes) {
			if(quete2.equals(quete))
				return quete2;
		}
		return null;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("\t(" + evt.getOldValue() + 
							" -> " + evt.getNewValue() + ")");	
		System.out.println(this);
	}





}
