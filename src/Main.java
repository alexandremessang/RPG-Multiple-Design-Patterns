import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		//Joueur guerrier = new Guerrier("Pierre", 600, 100, true);
		//Joueur mage = new Mage("John", 200, 100, true);
		//mage.afficher();
		System.out.println("************************");
		
		//Joueur papi = new Guerrier("Papi", 500, 200, false);
		
		// Creer une quete
		//ArrayList<String> etapes = new ArrayList<>();
		//etapes.add("Le gouffre de Heilm");
		//etapes.add("Les mines de la Moria");
		//etapes.add("Le fléau de Durin");
		//Quete quete1 = new Quete("Un anneau mistérieux", etapes);
		//System.out.println(quete1.description());
		System.out.println("************************");
		
		// Ajouter une quete au PNJ
		//papi.getEtatJoueur().setQuete(quete1);
		//System.out.println("Ajout quete : " + papi.getEtatJoueur().getQuetes().get(0).description());
		System.out.println("************************");
		
		// récuperer une quete d'un PNJ
		//mage.getEtatJoueur().setQuete(papi.getEtatJoueur().getQuete(quete1)); 
		//guerrier.getEtatJoueur().setQuete(quete1);
		
		// etape de quete
		//System.out.println("Récuperation de l'étape avant changement (mage) : " + mage.getEtatJoueur().getActiveQuest().getState());
		//changement d'étape
		//mage.getEtatJoueur().getActiveQuest().nextState();
		//System.out.println(mage.getEtatJoueur().getActiveQuest().getState());
		//System.out.println("Récuperation de l'étape après changement (guerrier) : " + guerrier.getEtatJoueur().getActiveQuest().getState());
		//guerrier.getEtatJoueur().getActiveQuest().nextState();
		//System.out.println("Récuperation de l'étape après changement (mage) : " + mage.getEtatJoueur().getActiveQuest().getState());
		
		
		// VARIABLES
		ArrayList<String> etapesQ1 = new ArrayList<>();
		etapesQ1.add("Le gouffre de Heilm");
		etapesQ1.add("Les mines de la Moria");
		etapesQ1.add("Le fléau de Durin");
		Quete quete1 = new Quete("Un anneau mistérieux", etapesQ1);
		
		ArrayList<String> etapesQ2 = new ArrayList<>();
		etapesQ2.add("Le fardeau de Grimalkin");
		etapesQ2.add("La mésaventure d'Alice");
		etapesQ2.add("Le combat de l'épouvanteur");
		Quete quete2 = new Quete("Le pacte de Sliter", etapesQ2);
		
		ArrayList<String> etapesQ3 = new ArrayList<>();
		etapesQ3.add("Docker et mon Kali");
		etapesQ3.add("Composition agrégée");
		etapesQ3.add("Une histoire de temps");
		etapesQ3.add("Le patron");
		Quete quete3 = new Quete("L'incommensurable dinguerie !", etapesQ3);
		
		Joueur papi = new Guerrier("Papi", 500, 200, false);
		papi.getEtatJoueur().setQuete(quete1);
		papi.getEtatJoueur().setQuete(quete2);
		Joueur lastPlayerInstance;
		
		// INTERFACE
		final InterfaceGraphique frame = new InterfaceGraphique();
		final int xSize = 500;
		final int ySize = 500;
		final Color BGCOLOR = Color.gray;
		JLabel choixJoueurTitre = new JLabel("Séléction du personnage");
		JButton mageBtn = new JButton("Mage");
		JButton guerrierBtn = new JButton("Guerrier");
		
		for (Quete quete : papi.getEtatJoueur().getQuetes()) {
			JButton button;
			button = new JButton(quete.description());
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					lastPlayerInstance.getEtatJoueur().setQuete(quete);
					JButton btn;
					btn = new JButton("Avancerla quete" + quete.description());
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							
						}
					});
					frame.add(btn);
				}
			});
			frame.add(button);
		}
		mageBtn.addActionListener(new ActionListener()
		{
			@Override
			  public void actionPerformed(ActionEvent e)
			  {
				Joueur mage = new Mage("mage", 200, 200, true);
				lastPlayerInstance = mage;
				mage.afficher();
			  }
		});
		guerrierBtn.addActionListener(new ActionListener()
		{
			@Override
			  public void actionPerformed(ActionEvent e)
			  {
				Joueur guerrier = new Guerrier("guerrier", 600, 100, true);
				lastPlayerInstance = guerrier;
				guerrier.afficher();
				
			  }
		});
		
		
		frame.add(choixJoueurTitre);
		frame.add(mageBtn);
		frame.add(guerrierBtn);
		
		
		final JFrame win = new JFrame();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				win.getContentPane().add(frame);
				win.pack();
				win.setVisible(true);
			}
		});
	}

}
