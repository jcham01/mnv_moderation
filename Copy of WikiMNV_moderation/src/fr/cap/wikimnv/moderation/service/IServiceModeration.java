package fr.cap.wikimnv.moderation.service;

import java.util.Set;

import fr.cap.wikimnv.core.commons.exception.*;

public interface IServiceModeration {
	
	//TODO publier un article renvoie l'etat de l'action par boolean
	boolean publierArticle(Object keyArticle) throws MNVException;
	//TODO rejeter un article
	boolean rejeterArticle(Object keyArticle) throws MNVException;
	//TODO bannir un utilisateur
	boolean bannirUtilisateur(Object keyUser) throws MNVException;
	//TODO bannir commentaire
	boolean bannirCommentaire(Object keyCommentaire) throws MNVException;
	
	//TODO publier tous les articles
	Set<Object> publierArticles(Set<Object> Articles) throws MNVException;
	//TODO Archiver un contenu
	boolean archiverContenu(Object keyContenu) throws MNVException;

	//TODO Afficher tous les articles
	public Set<Object> listerArticles(Class cl) throws MNVException;
	
}
