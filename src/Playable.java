import java.util.ArrayList;

public interface Playable {
	public ArrayList<Quete> getQuetes();
	public void setQuete(Quete quete);
	public Quete getQuete(Quete quete);
	public Quete getActiveQuest();

}
