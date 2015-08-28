package fr.cap.wikimnv.test.moderation.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import fr.cap.wikimnv.moderation.pojo.Signalement;
import fr.cap.wikimnv.moderation.service.IServiceSignalement;

public class IServiceSignalementTest {

	IServiceSignalement gsig;

	public IServiceSignalementTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		gsig = (IServiceSignalement) applicationContext.getBean("serviceSignalement");
	}

	@Test
	public void testRejeter() throws MNVException {
		
		Signalement sig = new Signalement(null, null);
				
		sig = (Signalement)gsig.sauver(sig);
		
		//TODO comment récupérer l'id de manière générale ??
		sig = gsig.rejeter(sig.toString());
	
		if (sig.getEtat() != EtatSignalement.REJETE)
			throw new MNVException(30, "Etat du signalement n'est pas REJETE");
		
	}

	@Test
	public void testTraiter() throws MNVException {
		
		Signalement sig = new Signalement(null, null);
		
		sig = (Signalement)gsig.sauver(sig);
		
		//TODO comment récupérer l'id de manière générale ??
		sig = gsig.traiter(sig.toString());
	
		if (sig.getEtat() != EtatSignalement.TRAITE)
			throw new MNVException(31, "Etat du signalement n'est pas TRAITE");
	}
	
	@Test
	public void testSignaler() throws MNVException {
		
		int taille;

		taille = gsig.lister(Signalement.class).size();
		
		gsig.signaler(null, null);
		
		if (!(taille < gsig.lister(Signalement.class).size()))
		{
			throw new MNVException(32, "Signaler n'a crée aucun nouveau signalement");
		}

	}

}
