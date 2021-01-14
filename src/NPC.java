import java.util.ArrayList;

public class NPC implements Playable {
	
	private ArrayList<Quete> quetes;
	
	
	public NPC(ArrayList<Quete> quetes) {
		this.quetes = quetes;
	}


	public ArrayList<Quete> getQuetes() {
		return quetes;
	}


	public void setQuetes(ArrayList<Quete> quetes) {
		this.quetes = quetes;
	}


	@Override
	public void setQuete(Quete quete) {
		this.quetes.add(quete);
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
	public Quete getActiveQuest() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


	
	

}
