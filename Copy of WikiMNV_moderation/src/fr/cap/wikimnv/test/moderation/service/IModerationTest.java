package fr.cap.wikimnv.test.moderation.service;

import static org.junit.Assert.fail;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.Article;
import fr.cap.wikimnv.core.pojo.EtatPublication;
import fr.cap.wikimnv.core.pojo.EtatSignalement;
import fr.cap.wikimnv.moderation.service.*;

public class IModerationTest {
	
	IServiceModeration serviceModeration;
	
	public IModerationTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		serviceModeration = (IServiceModeration) applicationContext.getBean("sModeration");
	}

	@Test
	public void testPublier() {
		try{
			EtatPublication etatPublication=EtatPublication.PUBLIE;
			Object idArticle="1";
			serviceModeration.publierArticle(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}
	
	@Test
	public void testRejeter() {
		try{
			EtatPublication etatPublication=EtatPublication.ARCHIVE;
			Object idArticle="1";
			serviceModeration.publierArticle(idArticle);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}

	@Test
	public void testBannirUser() {
		try{
			EtatSignalement etatSignalement=EtatSignalement.TRAITE;
			Object idUser="1";
			serviceModeration.archiverContenu(idUser);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}
	
	@Test
	public void testBannirComment() {
		try{
			EtatSignalement etatSignalement=EtatSignalement.TRAITE;
			Object idComment="1";
			serviceModeration.archiverContenu(idComment);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}
	
	/*@Test
	public void testPublierArticles() {
		try{
			Set<Object> a = new TreeSet<Object>();
			a.add(new Article(Profil , Template));
			serviceModeration.publierArticles(a);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}*/
	
	@Test
	public void testArchiverContenu() {
		try{
			EtatPublication etatPublication=EtatPublication.ARCHIVE;
			Object idContenu="1";
			serviceModeration.archiverContenu(idContenu);
		}
		catch(MNVException e){
			fail(e.getMessage());	
		}
	}
	
	/*boolean archiverContenu(Object keyContenu) throws MNVException;
	public Set<Object> listerArticles(Class cl) throws MNVException;*/
	
}
