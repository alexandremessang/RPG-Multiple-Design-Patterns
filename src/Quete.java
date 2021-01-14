import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Quete {
	
	private String description;
	private ArrayList<PersonnageJouable> players;
	
	
	private ArrayList<String> states;
	private int stateIndex;

	public Quete(String description, ArrayList<String> states) {
		this.description = description;
		this.states = states;
		this.stateIndex = 0;
		this.players = new ArrayList<>();
	}
	
	public void addPlayer(PersonnageJouable player) {
		this.players.add(player);
		this.addObserver(player);
	}
	
	public String description() {
		return this.description;
	}
	
	public String getState() {
		return states.get(stateIndex);
	}
	
	
	public void nextState() {
		String old = this.getState();
		this.stateIndex++;
		pcs.firePropertyChange("questStatement", old, this.getState());
	}

	// contain a support object instead of extending the support class
		public PropertyChangeSupport pcs = new  PropertyChangeSupport(this);
		
		public void addObserver(PropertyChangeListener l) {
			pcs.addPropertyChangeListener("questStatement", l);
		}
		
	

	
	

}
